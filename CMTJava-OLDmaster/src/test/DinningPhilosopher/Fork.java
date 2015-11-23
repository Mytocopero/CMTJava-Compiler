package test.DinningPhilosopher;

import stm.*;

class Fork implements TObject{

	private volatile Boolean fork = true;
	private FieldInfo<Boolean> forkFieldInfo = new FieldInfo<Boolean> ("fork", {Boolean a => fork = a; });
	
	public STM<stm.Void> setFork (Boolean n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = forkFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(forkFieldInfo.wlock.isMarked() && forkFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(forkFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(forkFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(forkFieldInfo, n);
					if (forkFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<Boolean> getFork() {
		
		return new STM<Boolean> ({Trans t =>
			TResult r = null;
			Boolean result;
			boolean mark[] = {false};
			Long version = forkFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(forkFieldInfo.wlock.isMarked() && forkFieldInfo.wlock.getReference().equals(t.transId));
				result = (Boolean)t.writeSet.get(forkFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = forkFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = forkFieldInfo.rlock.get(mark);
						continue;
					}

					result = fork;
					long version2 = forkFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(forkFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 
}

