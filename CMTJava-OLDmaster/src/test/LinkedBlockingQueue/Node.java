package test.LinkedBlockingQueue;

import stm.*;

class Node<E> implements TObject{

	private E item;
	private FieldInfo<E> itemFieldInfo = new FieldInfo<E> ("item", {E a => item = a; });
	
	public STM<stm.Void> setItem (E n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = itemFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(itemFieldInfo.wlock.isMarked() && itemFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(itemFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(itemFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(itemFieldInfo, n);
					if (itemFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<E> getItem() {
		
		return new STM<E> ({Trans t =>
			TResult r = null;
			E result;
			boolean mark[] = {false};
			Long version = itemFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(itemFieldInfo.wlock.isMarked() && itemFieldInfo.wlock.getReference().equals(t.transId));
				result = (E)t.writeSet.get(itemFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = itemFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = itemFieldInfo.rlock.get(mark);
						continue;
					}

					result = item;
					long version2 = itemFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(itemFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 
	private Node<E> next;
	private FieldInfo<Node<E>> nextFieldInfo = new FieldInfo<Node<E>> ("next", {Node<E> a => next = a; });
	
	public STM<stm.Void> setNext (Node<E> n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = nextFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(nextFieldInfo.wlock.isMarked() && nextFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(nextFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(nextFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(nextFieldInfo, n);
					if (nextFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<Node<E>> getNext() {
		
		return new STM<Node<E>> ({Trans t =>
			TResult r = null;
			Node<E> result;
			boolean mark[] = {false};
			Long version = nextFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(nextFieldInfo.wlock.isMarked() && nextFieldInfo.wlock.getReference().equals(t.transId));
				result = (Node<E>)t.writeSet.get(nextFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = nextFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = nextFieldInfo.rlock.get(mark);
						continue;
					}

					result = next;
					long version2 = nextFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(nextFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 

	Node(E x) {
		this.item = x;
		this.next = null;
	}
}

