package test.LinkedBlockingQueue;

import stm.*;

public class TLinkedBlockingQueue<E> implements TObject{

    /** The capacity bound, or Integer.MAX_VALUE if none */
    private Integer capacity;
	private FieldInfo<Integer> capacityFieldInfo = new FieldInfo<Integer> ("capacity", {Integer a => capacity = a; });
	
	public STM<stm.Void> setCapacity (Integer n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = capacityFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(capacityFieldInfo.wlock.isMarked() && capacityFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(capacityFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(capacityFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(capacityFieldInfo, n);
					if (capacityFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
						r = new TResult(null, t, Trans.Status.ABORTED);
					}else
						r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
					}
				else{
					r = new TResult(null, t, Trans.Status.ABORTED);
				}
			}		
			r
		});
	}

	public STM<Integer> getCapacity() {
		
		return new STM<Integer> ({Trans t =>
			TResult r = null;
			Integer result;
			boolean mark[] = {false};
			Long version = capacityFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(capacityFieldInfo.wlock.isMarked() && capacityFieldInfo.wlock.getReference().equals(t.transId));
				result = (Integer)t.writeSet.get(capacityFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = capacityFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = capacityFieldInfo.rlock.get(mark);
						continue;
					}

					result = capacity;
					long version2 = capacityFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(capacityFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 

    /** Current number of elements */
    private Integer count;
	private FieldInfo<Integer> countFieldInfo = new FieldInfo<Integer> ("count", {Integer a => count = a; });
	
	public STM<stm.Void> setCount (Integer n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = countFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(countFieldInfo.wlock.isMarked() && countFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(countFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(countFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(countFieldInfo, n);
					if (countFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
						r = new TResult(null, t, Trans.Status.ABORTED);
					}else
						r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
					}
				else{
					r = new TResult(null, t, Trans.Status.ABORTED);
				}
			}		
			r
		});
	}

	public STM<Integer> getCount() {
		
		return new STM<Integer> ({Trans t =>
			TResult r = null;
			Integer result;
			boolean mark[] = {false};
			Long version = countFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(countFieldInfo.wlock.isMarked() && countFieldInfo.wlock.getReference().equals(t.transId));
				result = (Integer)t.writeSet.get(countFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = countFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = countFieldInfo.rlock.get(mark);
						continue;
					}

					result = count;
					long version2 = countFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(countFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 

    /** Head of linked list */
    private transient Node<E> head;
	private FieldInfo<Node<E>> headFieldInfo = new FieldInfo<Node<E>> ("head", {Node<E> a => head = a; });
	
	public STM<stm.Void> setHead (Node<E> n) {
		
		return new STM<stm.Void>({Trans t =>
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
			r
		});
	}

	public STM<Node<E>> getHead() {
		
		return new STM<Node<E>> ({Trans t =>
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

			r
		});
	} 

    /** Tail of linked list */
    private transient Node<E> last;
	private FieldInfo<Node<E>> lastFieldInfo = new FieldInfo<Node<E>> ("last", {Node<E> a => last = a; });
	
	public STM<stm.Void> setLast (Node<E> n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = lastFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(lastFieldInfo.wlock.isMarked() && lastFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(lastFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(lastFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(lastFieldInfo, n);
					if (lastFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
						r = new TResult(null, t, Trans.Status.ABORTED);
					}else
						r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
					}
				else{
					r = new TResult(null, t, Trans.Status.ABORTED);
				}
			}		
			r
		});
	}

	public STM<Node<E>> getLast() {
		
		return new STM<Node<E>> ({Trans t =>
			TResult r = null;
			Node<E> result;
			boolean mark[] = {false};
			Long version = lastFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(lastFieldInfo.wlock.isMarked() && lastFieldInfo.wlock.getReference().equals(t.transId));
				result = (Node<E>)t.writeSet.get(lastFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = lastFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = lastFieldInfo.rlock.get(mark);
						continue;
					}

					result = last;
					long version2 = lastFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(lastFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 

    public TLinkedBlockingQueue(int capacity) {
        if (capacity <= 0) throw new IllegalArgumentException();
        this.capacity = capacity;
        last = head = new Node<E>(null);
	this.count = 0;
    }

    public TLinkedBlockingQueue() {
        this(Integer.MAX_VALUE);
    }

}
