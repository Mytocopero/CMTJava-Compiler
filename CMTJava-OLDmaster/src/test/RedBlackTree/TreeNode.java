package test.RedBlackTree;

import stm.*;

enum Color { RED, BLACK }

public class TreeNode implements TObject{

	private Integer value;
	private FieldInfo<Integer> valueFieldInfo = new FieldInfo<Integer> ("value", {Integer a => value = a; });
	
	public STM<stm.Void> setValue (Integer n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = valueFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(valueFieldInfo.wlock.isMarked() && valueFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(valueFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(valueFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(valueFieldInfo, n);
					if (valueFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<Integer> getValue() {
		
		return new STM<Integer> ({Trans t =>
			TResult r = null;
			Integer result;
			boolean mark[] = {false};
			Long version = valueFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(valueFieldInfo.wlock.isMarked() && valueFieldInfo.wlock.getReference().equals(t.transId));
				result = (Integer)t.writeSet.get(valueFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = valueFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = valueFieldInfo.rlock.get(mark);
						continue;
					}

					result = value;
					long version2 = valueFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(valueFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 
	private TreeNode left;
	private FieldInfo<TreeNode> leftFieldInfo = new FieldInfo<TreeNode> ("left", {TreeNode a => left = a; });
	
	public STM<stm.Void> setLeft (TreeNode n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = leftFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(leftFieldInfo.wlock.isMarked() && leftFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(leftFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(leftFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(leftFieldInfo, n);
					if (leftFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<TreeNode> getLeft() {
		
		return new STM<TreeNode> ({Trans t =>
			TResult r = null;
			TreeNode result;
			boolean mark[] = {false};
			Long version = leftFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(leftFieldInfo.wlock.isMarked() && leftFieldInfo.wlock.getReference().equals(t.transId));
				result = (TreeNode)t.writeSet.get(leftFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = leftFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = leftFieldInfo.rlock.get(mark);
						continue;
					}

					result = left;
					long version2 = leftFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(leftFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 
	private TreeNode right;
	private FieldInfo<TreeNode> rightFieldInfo = new FieldInfo<TreeNode> ("right", {TreeNode a => right = a; });
	
	public STM<stm.Void> setRight (TreeNode n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = rightFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(rightFieldInfo.wlock.isMarked() && rightFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(rightFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(rightFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(rightFieldInfo, n);
					if (rightFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<TreeNode> getRight() {
		
		return new STM<TreeNode> ({Trans t =>
			TResult r = null;
			TreeNode result;
			boolean mark[] = {false};
			Long version = rightFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(rightFieldInfo.wlock.isMarked() && rightFieldInfo.wlock.getReference().equals(t.transId));
				result = (TreeNode)t.writeSet.get(rightFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = rightFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = rightFieldInfo.rlock.get(mark);
						continue;
					}

					result = right;
					long version2 = rightFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(rightFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 
	private TreeNode parent;
	private FieldInfo<TreeNode> parentFieldInfo = new FieldInfo<TreeNode> ("parent", {TreeNode a => parent = a; });
	
	public STM<stm.Void> setParent (TreeNode n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = parentFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(parentFieldInfo.wlock.isMarked() && parentFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(parentFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(parentFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(parentFieldInfo, n);
					if (parentFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<TreeNode> getParent() {
		
		return new STM<TreeNode> ({Trans t =>
			TResult r = null;
			TreeNode result;
			boolean mark[] = {false};
			Long version = parentFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(parentFieldInfo.wlock.isMarked() && parentFieldInfo.wlock.getReference().equals(t.transId));
				result = (TreeNode)t.writeSet.get(parentFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = parentFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = parentFieldInfo.rlock.get(mark);
						continue;
					}

					result = parent;
					long version2 = parentFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(parentFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 
	private Color color;
	private FieldInfo<Color> colorFieldInfo = new FieldInfo<Color> ("color", {Color a => color = a; });
	
	public STM<stm.Void> setColor (Color n) {
		
		return new STM<stm.Void>({Trans t =>
			TResult r = null;
			boolean mark[] = {false};
			Long version = colorFieldInfo.wlock.get(mark);
		    if(mark[0] && t.transId.equals(version)){
		    	assert(colorFieldInfo.wlock.isMarked() && colorFieldInfo.wlock.getReference().equals(t.transId));
				t.writeSet.put(colorFieldInfo, n);
				r = new TResult(new stm.Void(), t, Trans.Status.ACTIVE);
			}else{
				if(colorFieldInfo.wlock.compareAndSet(null, t.transId, false, true)){
					t.writeSet.put(colorFieldInfo, n);
					if (colorFieldInfo.rlock.getReference() > t.validationStamp && !t.extend()){
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

	public STM<Color> getColor() {
		
		return new STM<Color> ({Trans t =>
			TResult r = null;
			Color result;
			boolean mark[] = {false};
			Long version = colorFieldInfo.wlock.get(mark);
			
	    	if(mark[0] && t.transId.equals(version)){
	    		assert(colorFieldInfo.wlock.isMarked() && colorFieldInfo.wlock.getReference().equals(t.transId));
				result = (Color)t.writeSet.get(colorFieldInfo);
				r = new TResult(result, t, Trans.Status.ACTIVE);
			}else{
		   		version = colorFieldInfo.rlock.get(mark);
				while(true){
					if(mark[0]==true){
						version = colorFieldInfo.rlock.get(mark);
						continue;
					}

					result = color;
					long version2 = colorFieldInfo.rlock.get(mark);
					if(version == version2 && mark[0]==false) break;
					version=version2;
				}

				boolean added = t.readSet.put(colorFieldInfo, version);
				if (!added || (version > t.validationStamp && !t.extend()) ){
					r = new TResult(null, t, Trans.Status.ABORTED);
				}else{
					r = new TResult(result, t, Trans.Status.ACTIVE);	
				}
			}	

			r
		});
	} 
	
	protected TreeNode(){
		value = null;
		parent = null;
		left = right = this;
		color = Color.BLACK;  // empty trees below the leaves should be black
 }
    
    protected TreeNode(Integer val){
		value = val;
		parent = null;
		left = right = this;
		color = Color.BLACK;  // empty trees below the leaves should be black
    }

   protected TreeNode(Integer val, TreeNode parent, TreeNode left, TreeNode right){
		value = val;
		this.parent = parent;
		this.left = left;
		this.right = right;
		color = Color.BLACK;  // empty trees below the leaves should be black
    }
}
