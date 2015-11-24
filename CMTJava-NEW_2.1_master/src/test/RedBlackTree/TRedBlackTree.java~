package test.RedBlackTree;

import stm.*;

public class TRedBlackTree implements TObject{
	
    private Conteiner<TreeNode> root = new Conteiner<TreeNode> ();
private FieldInfo<TreeNode> rootFieldInfo = new FieldInfo<TreeNode> ("root", (TreeNode a) -> {root.setConteudo(a); return null;});
	


	public STM<stm.Void> setRoot (TreeNode n) {
		
		return new STM<stm.Void>((Trans t) -> {
			TResult r = null;
			boolean mark[] = {false};
			Long version = rootFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(rootFieldInfo.wlock.isMarked() && rootFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(rootFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(rootFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(rootFieldInfo, n);
					if (rootFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<TreeNode> getRoot() {
		
		return new STM<TreeNode> ((Trans t) -> {
			TResult r = null;
			TreeNode result;
			boolean mark[] = {false};
			Long version = rootFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(rootFieldInfo.wlock.isMarked() && rootFieldInfo.wlock.getReference().equals(t.transId));
				result = (TreeNode)t.writeSet.get(rootFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = rootFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = rootFieldInfo.rlock.get(mark);
						continue;
					}

					result = root.getConteudo();
					long version2 = rootFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(rootFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			return r;
		});
	} 
    private Conteiner<TreeNode> EMPTY = new Conteiner<TreeNode> ();
private FieldInfo<TreeNode> EMPTYFieldInfo = new FieldInfo<TreeNode> ("EMPTY", (TreeNode a) -> {EMPTY.setConteudo(a); return null;});
	


	public STM<stm.Void> setEMPTY (TreeNode n) {
		
		return new STM<stm.Void>((Trans t) -> {
			TResult r = null;
			boolean mark[] = {false};
			Long version = EMPTYFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(EMPTYFieldInfo.wlock.isMarked() && EMPTYFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(EMPTYFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(EMPTYFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(EMPTYFieldInfo, n);
					if (EMPTYFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<TreeNode> getEMPTY() {
		
		return new STM<TreeNode> ((Trans t) -> {
			TResult r = null;
			TreeNode result;
			boolean mark[] = {false};
			Long version = EMPTYFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(EMPTYFieldInfo.wlock.isMarked() && EMPTYFieldInfo.wlock.getReference().equals(t.transId));
				result = (TreeNode)t.writeSet.get(EMPTYFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = EMPTYFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = EMPTYFieldInfo.rlock.get(mark);
						continue;
					}

					result = EMPTY.getConteudo();
					long version2 = EMPTYFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(EMPTYFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			return r;
		});
	} 

		public TRedBlackTree() 
	{
				this.EMPTY.setConteudo(new TreeNode());
				this.root.setConteudo(new TreeNode());
		}
	
}
