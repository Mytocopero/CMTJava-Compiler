package test.LinkedList;
import stm.*;

class TLinkedList<E> implements TObject{

	private Node<E> head;
	private FieldInfo<Node<E>> headFieldInfo = new FieldInfo<Node<E>> ("head", (Node<E> a) -> {head = a; return null;});
	
	public STM<stm.Void> setHead (Node<E> n) {
		
		return new STM<stm.Void>((Trans t) -> {
			TResult r = null;
			boolean mark[] = {false};
			Long version = headFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(headFieldInfo.wlock.isMarked() && headFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(headFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(headFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(headFieldInfo, n);
					if (headFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
						r = new TResult(null, t, Trans.Status.ABORTED);
					}else
						r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
					}
				else{
					r = new TResult(null, t, Trans.Status.ABORTED);
				}
			}		
			return r;
		});
	}

	public STM<Node<E>> getHead() {
		
		return new STM<Node<E>> ((Trans t) -> {
			TResult r = null;
			Node<E> result;
			boolean mark[] = {false};
			Long version = headFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(headFieldInfo.wlock.isMarked() && headFieldInfo.wlock.getReference().equals(t.transId));
				result = (Node<E>)t.writeSet.get(headFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = headFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = headFieldInfo.rlock.get(mark);
						continue;
					}

					result = head;
					long version2 = headFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(headFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			return r;
		});
	} 
	private Node<E> tail;
	private FieldInfo<Node<E>> tailFieldInfo = new FieldInfo<Node<E>> ("tail", (Node<E> a) -> {tail = a; return null;});
	
	public STM<stm.Void> setTail (Node<E> n) {
		
		return new STM<stm.Void>((Trans t) -> {
			TResult r = null;
			boolean mark[] = {false};
			Long version = tailFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(tailFieldInfo.wlock.isMarked() && tailFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(tailFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(tailFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(tailFieldInfo, n);
					if (tailFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
						r = new TResult(null, t, Trans.Status.ABORTED);
					}else
						r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
					}
				else{
					r = new TResult(null, t, Trans.Status.ABORTED);
				}
			}		
			return r;
		});
	}

	public STM<Node<E>> getTail() {
		
		return new STM<Node<E>> ((Trans t) -> {
			TResult r = null;
			Node<E> result;
			boolean mark[] = {false};
			Long version = tailFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(tailFieldInfo.wlock.isMarked() && tailFieldInfo.wlock.getReference().equals(t.transId));
				result = (Node<E>)t.writeSet.get(tailFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = tailFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = tailFieldInfo.rlock.get(mark);
						continue;
					}

					result = tail;
					long version2 = tailFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(tailFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			return r;
		});
	} 
  	private Integer size;
	private FieldInfo<Integer> sizeFieldInfo = new FieldInfo<Integer> ("size", (Integer a) -> {size = a; return null;});
	
	public STM<stm.Void> setSize (Integer n) {
		
		return new STM<stm.Void>((Trans t) -> {
			TResult r = null;
			boolean mark[] = {false};
			Long version = sizeFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(sizeFieldInfo.wlock.isMarked() && sizeFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(sizeFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(sizeFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(sizeFieldInfo, n);
					if (sizeFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
						r = new TResult(null, t, Trans.Status.ABORTED);
					}else
						r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
					}
				else{
					r = new TResult(null, t, Trans.Status.ABORTED);
				}
			}		
			return r;
		});
	}

	public STM<Integer> getSize() {
		
		return new STM<Integer> ((Trans t) -> {
			TResult r = null;
			Integer result;
			boolean mark[] = {false};
			Long version = sizeFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(sizeFieldInfo.wlock.isMarked() && sizeFieldInfo.wlock.getReference().equals(t.transId));
				result = (Integer)t.writeSet.get(sizeFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = sizeFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = sizeFieldInfo.rlock.get(mark);
						continue;
					}

					result = size;
					long version2 = sizeFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(sizeFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			return r;
		});
	} 

	TLinkedList() {
		head = null;
		tail = null;
    	size = 0;
	}
}