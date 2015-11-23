package test.LinkedList;

import stm.*;

class Node<E> implements TObject{

	private Conteiner<E> element = new Conteiner<E> ();
private FieldInfo<E> elementFieldInfo = new FieldInfo<E> ("element", (E a) -> {element.setConteudo(a); return null;});
	


	public STM<stm.Void> setElement (E n) {
		
		return new STM<stm.Void>((Trans t) -> {
			TResult r = null;
			boolean mark[] = {false};
			Long version = elementFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(elementFieldInfo.wlock.isMarked() && elementFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(elementFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(elementFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(elementFieldInfo, n);
					if (elementFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<E> getElement() {
		
		return new STM<E> ((Trans t) -> {
			TResult r = null;
			E result;
			boolean mark[] = {false};
			Long version = elementFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(elementFieldInfo.wlock.isMarked() && elementFieldInfo.wlock.getReference().equals(t.transId));
				result = (E)t.writeSet.get(elementFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = elementFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = elementFieldInfo.rlock.get(mark);
						continue;
					}

					result = element.getConteudo();
					long version2 = elementFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(elementFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			return r;
		});
	} 
	private Conteiner<Node<E>> next = new Conteiner<Node<E>> ();
private FieldInfo<Node<E>> nextFieldInfo = new FieldInfo<Node<E>> ("next", (Node<E> a) -> {next.setConteudo(a); return null;});
	


	public STM<stm.Void> setNext (Node<E> n) {
		
		return new STM<stm.Void>((Trans t) -> {
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
			return r;
		});
	}

	public STM<Node<E>> getNext() {
		
		return new STM<Node<E>> ((Trans t) -> {
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

					result = next.getConteudo();
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

			return r;
		});
	} 
	private Conteiner<Node<E>> previous = new Conteiner<Node<E>> ();
private FieldInfo<Node<E>> previousFieldInfo = new FieldInfo<Node<E>> ("previous", (Node<E> a) -> {previous.setConteudo(a); return null;});
	


	public STM<stm.Void> setPrevious (Node<E> n) {
		
		return new STM<stm.Void>((Trans t) -> {
			TResult r = null;
			boolean mark[] = {false};
			Long version = previousFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(previousFieldInfo.wlock.isMarked() && previousFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(previousFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(previousFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(previousFieldInfo, n);
					if (previousFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<Node<E>> getPrevious() {
		
		return new STM<Node<E>> ((Trans t) -> {
			TResult r = null;
			Node<E> result;
			boolean mark[] = {false};
			Long version = previousFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(previousFieldInfo.wlock.isMarked() && previousFieldInfo.wlock.getReference().equals(t.transId));
				result = (Node<E>)t.writeSet.get(previousFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = previousFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = previousFieldInfo.rlock.get(mark);
						continue;
					}

					result = previous.getConteudo();
					long version2 = previousFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(previousFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			return r;
		});
	} 

	 Node(E element, Node next, Node previous) 
	{
				this.element.setConteudo(element);
				this.next.setConteudo(next);
				this.previous.setConteudo(previous);
		}
	
}

