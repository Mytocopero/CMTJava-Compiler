package test.RedBlackTree;

import stm.*;

public class RedBlackTree extends TRedBlackTree{

	public STM<Integer> length(){

		return  STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.bind( this.length(root),{ Integer len => 
 STMRTS.stmReturn(len)  }) }) ;
	}

	public STM<Boolean> remove(Integer value){

		return  STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.bind( this.locate(root, value),{ TreeNode target => 
 STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 target==empty ?  STMRTS.stmReturn(false)   
	   :  STMRTS.then( remove(target), 
 STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.then( root.setColor(Color.BLACK), 
 STMRTS.stmReturn(true)  ) }) )   }) }) }) ;
	}

	public STM<Boolean> insert(Integer value){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.bind( this.insert(root, value),{ TreeNode node => 
 node == empty ?  STMRTS.stmReturn(false)   
	   :  STMRTS.then( node.setColor(Color.RED), 
 STMRTS.then( fixRBTree(node), 
 STMRTS.stmReturn(true)  ) )   }) }) }) ;
	}

	private STM<Boolean> remove(TreeNode target){

		return  STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 target==empty ?  STMRTS.stmReturn(false)   
	   :  STMRTS.bind( target.getLeft(),{ TreeNode l => 
 STMRTS.bind( target.getRight(),{ TreeNode r => 
 STMRTS.then( l!=empty && r!=empty ?  STMRTS.bind( this.successor(target),{ TreeNode successor => 
 STMRTS.bind( successor.getValue(),{ Integer val => 
 STMRTS.then( target.setValue(val), 
 remove(successor)  ) }) })  
	   :  STMRTS.bind( this.getSibling(target),{ TreeNode sibling => 
 STMRTS.bind( isLeftChild(target),{ Boolean isLeftChild => 
 STMRTS.bind( target.getParent(),{ TreeNode parent => 
 STMRTS.then( r!=empty ?  parent==empty ?  STMRTS.then( this.setRoot(r), 
 r.setParent(empty)  )  
	   :  isLeftChild ?  r!=empty ?  STMRTS.then( parent.setLeft(r), 
 r.setParent(parent)  )  
	   :  STMRTS.then( parent.setLeft(empty), 
 target.setParent(null)  )    
	   :  r!=empty ?  STMRTS.then( parent.setRight(r), 
 r.setParent(parent)  )  
	   :  STMRTS.then( parent.setRight(empty), 
 target.setParent(null)  )        
	   :  parent==empty ?  STMRTS.then( this.setRoot(l), 
 l.setParent(empty)  )  
	   :  isLeftChild ?  l!=empty ?  STMRTS.then( parent.setLeft(l), 
 l.setParent(parent)  )  
	   :  parent.setLeft(empty)     
	   :  l!=empty ?  STMRTS.then( parent.setRight(l), 
 l.setParent(parent)  )  
	   :  parent.setRight(empty)        , 
 STMRTS.then( removeFixUp(target, sibling, isLeftChild), 
 STMRTS.then( target.setParent(null), 
 STMRTS.then( target.setRight(null), 
 STMRTS.then( target.setLeft(null), 
 target.setValue(null)  ) ) ) ) ) }) }) }) , 
 STMRTS.stmReturn(true)  ) }) })   }) }) ;
	}

	private STM<Integer> length(TreeNode node){

		return  STMRTS.bind( node.getValue(),{ Integer val => 
 val == null ?  STMRTS.stmReturn(0)   
	   :  STMRTS.bind( node.getLeft(),{ TreeNode l => 
 STMRTS.bind( node.getRight(),{ TreeNode r => 
 STMRTS.bind( length(r),{ Integer rlen => 
 STMRTS.bind( length(l),{ Integer llen => 
 STMRTS.stmReturn(1+rlen+llen)  }) }) }) })   }) ;
	}

	private STM<stm.Void> fixRBTree(TreeNode node){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.bind( parent.getColor(),{ Color parent_color => 
 node != root && parent_color == Color.RED ?  STMRTS.bind( this.getUncle(node),{ TreeNode uncle => 
 STMRTS.bind( uncle.getColor(),{ Color color => 
 color == Color.RED ?  STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.then( uncle.setColor(Color.BLACK), 
 STMRTS.bind( this.getGrandPa(node),{ TreeNode grand => 
 STMRTS.then( grand.setColor(Color.RED), 
 fixRBTree(grand)  ) }) ) )  
	   :  STMRTS.bind( this.isLeftChild(parent),{ Boolean hasRightUncle => 
 STMRTS.bind( this.isLeftChild(node),{ Boolean isLeftChild => 
 !hasRightUncle ?  isLeftChild ?  STMRTS.then( rotateRight(parent), 
 STMRTS.then( node.setColor(Color.BLACK), 
 STMRTS.bind( node.getParent(),{ TreeNode grand => 
 STMRTS.then( grand.setColor(Color.RED), 
 STMRTS.then( rotateLeft(grand), 
 fixRBTree(grand)  ) ) }) ) )  
	   :  STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.bind( parent.getParent(),{ TreeNode grand => 
 STMRTS.then( grand.setColor(Color.RED), 
 STMRTS.then( rotateLeft(grand), 
 fixRBTree(node)  ) ) }) )    
	   :  !isLeftChild ?  STMRTS.then( rotateLeft(parent), 
 STMRTS.then( node.setColor(Color.BLACK), 
 STMRTS.bind( node.getParent(),{ TreeNode grand => 
 STMRTS.then( grand.setColor(Color.RED), 
 STMRTS.then( rotateRight(grand), 
 fixRBTree(grand)  ) ) }) ) )  
	   :  STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.bind( parent.getParent(),{ TreeNode grand => 
 STMRTS.then( grand.setColor(Color.RED), 
 STMRTS.then( rotateRight(grand), 
 fixRBTree(node)  ) ) }) )     }) })   }) })  
	   :  root.setColor(Color.BLACK)    }) }) }) }) ;
	}

	private STM<stm.Void> deleteFixUp(TreeNode node){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.bind( node.getColor(),{ Color node_color => 
 STMRTS.then( node != root && node_color == Color.BLACK ?  STMRTS.bind( this.getSibling(node),{ TreeNode sibling => 
 STMRTS.bind( this.isLeftChild(node),{ Boolean isLeftChild => 
 STMRTS.bind( sibling.getColor(),{ Color sibling_color => 
 isLeftChild ?  STMRTS.then( sibling_color == Color.RED ?  STMRTS.then( sibling.setColor(Color.BLACK), 
 STMRTS.then( parent.setColor(Color.RED), 
 STMRTS.then( rotateLeft(parent), 
 STMRTS.bind( parent.getRight(),{ TreeNode sibling => 
 STMRTS.bind( sibling.getRight(),{ TreeNode right => 
 STMRTS.bind( sibling.getLeft(),{ TreeNode left => 
 STMRTS.bind( left.getColor(),{ Color lcolor => 
 STMRTS.bind( right.getColor(),{ Color rcolor => 
 lcolor==Color.BLACK && rcolor==Color.BLACK ?  STMRTS.then( right.setColor(Color.BLACK), 
 STMRTS.then( sibling.setColor(Color.RED), 
 deleteFixUp(parent)  ) )  
	   :  rcolor == Color.BLACK ?  STMRTS.then( left.setColor(Color.BLACK), 
 STMRTS.then( rotateRight(sibling), 
 STMRTS.bind( parent.getRight(),{ TreeNode sibling => 
 STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.bind( parent.getColor(),{ Color color => 
 STMRTS.then( sibling.setColor(color), 
 STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.bind( sibling.getRight(),{ TreeNode right => 
 STMRTS.then( right.setColor(Color.BLACK), 
 rotateLeft(parent)  ) }) ) ) }) }) }) ) )  
	   :  STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.bind( parent.getColor(),{ Color color => 
 STMRTS.then( sibling.setColor(color), 
 STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.bind( sibling.getRight(),{ TreeNode right => 
 STMRTS.then( right.setColor(Color.BLACK), 
 rotateLeft(parent)  ) }) ) ) }) })     }) }) }) }) }) ) ) )  
	   :  STMRTS.bind( sibling.getRight(),{ TreeNode right => 
 STMRTS.bind( sibling.getLeft(),{ TreeNode left => 
 STMRTS.bind( left.getColor(),{ Color lcolor => 
 STMRTS.bind( right.getColor(),{ Color rcolor => 
 lcolor==Color.BLACK && rcolor==Color.BLACK ?  STMRTS.then( right.setColor(Color.BLACK), 
 STMRTS.then( sibling.setColor(Color.RED), 
 deleteFixUp(parent)  ) )  
	   :  rcolor == Color.BLACK ?  STMRTS.then( left.setColor(Color.BLACK), 
 STMRTS.then( rotateRight(sibling), 
 STMRTS.bind( parent.getRight(),{ TreeNode sibling => 
 STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.bind( parent.getColor(),{ Color color => 
 STMRTS.then( sibling.setColor(color), 
 STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.bind( sibling.getRight(),{ TreeNode right => 
 STMRTS.then( right.setColor(Color.BLACK), 
 rotateLeft(parent)  ) }) ) ) }) }) }) ) )  
	   :  STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.bind( parent.getColor(),{ Color color => 
 STMRTS.then( sibling.setColor(color), 
 STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.bind( sibling.getRight(),{ TreeNode right => 
 STMRTS.then( right.setColor(Color.BLACK), 
 rotateLeft(parent)  ) }) ) ) }) })     }) }) }) }) , 
 root.setColor(Color.BLACK)  )  
	   :  root.setColor(Color.BLACK)    }) }) })  
	   :  root.setColor(Color.BLACK)  , 
 node.setColor(Color.BLACK)  ) }) }) }) }) ;
	}

	public STM<TreeNode> getGrandPa(TreeNode node){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( node.getParent(),{ TreeNode parent => 
 parent != empty ?  STMRTS.bind( parent.getParent(),{ TreeNode grandPa => 
 grandPa != empty ?  STMRTS.stmReturn(grandPa)   
	   :  STMRTS.stmReturn(empty)    })  
	   :  STMRTS.stmReturn(empty)    }) }) ;
	}

	public STM<TreeNode> getUncle(TreeNode node){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( this.getGrandPa(node),{ TreeNode grandPa => 
 grandPa != empty ?  STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.bind( this.getSibling(parent),{ TreeNode sibling => 
 sibling != empty ?  STMRTS.stmReturn(sibling)   
	   :  STMRTS.stmReturn(empty)    }) })  
	   :  STMRTS.stmReturn(empty)    }) }) ;
	}

	public STM<TreeNode> getSibling(TreeNode node){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( node.getParent(),{ TreeNode parent => 
 parent != empty ?  STMRTS.bind( this.isLeftChild(node),{ Boolean isLeftChild => 
 isLeftChild ?  STMRTS.bind( parent.getRight(),{ TreeNode sibling => 
 STMRTS.stmReturn(sibling)  })  
	   :  STMRTS.bind( parent.getLeft(),{ TreeNode sibling => 
 STMRTS.stmReturn(sibling)  })   })  
	   :  STMRTS.stmReturn(empty)    }) }) ;
	}

	private STM<TreeNode> insert(TreeNode root, Integer value){
	
		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 root == empty ?  STMRTS.bind( STMRTS.stmReturn(new TreeNode(value, empty, empty,empty)),{ TreeNode n => 
 STMRTS.then( this.setRoot(n), 
 STMRTS.stmReturn(n)  ) })  
	   :  STMRTS.bind( root.getValue(),{ Integer v => 
 v.equals(value) ?  STMRTS.stmReturn(empty)   
	   :  v>value ?  STMRTS.bind( root.getLeft(),{ TreeNode left => 
 left == empty ?  STMRTS.bind( STMRTS.stmReturn(new TreeNode(value, root, empty,empty)),{ TreeNode l => 
 STMRTS.then( root.setLeft(l), 
 STMRTS.stmReturn(l)  ) })  
	   :  insert(left, value)    })  
	   :  STMRTS.bind( root.getRight(),{ TreeNode right => 
 right == empty ?  STMRTS.bind( STMRTS.stmReturn(new TreeNode(value, root, empty,empty)),{ TreeNode r => 
 STMRTS.then( root.setRight(r), 
 STMRTS.stmReturn(r)  ) })  
	   :  insert(right, value)    })     })   }) ;	
	}

	private STM<Boolean> isTerminal(Integer value){

		return  STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.bind( this.locate(root, value),{ TreeNode target => 
 STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 target==empty ?  STMRTS.stmReturn(false)   
	   :  STMRTS.bind( target.getLeft(),{ TreeNode l => 
 STMRTS.bind( target.getRight(),{ TreeNode r => 
 (l==empty && r!=empty) || (l!=empty && r==empty) ? STMRTS.stmReturn(true) 
	   : STMRTS.stmReturn(false)  }) })   }) }) }) ;
	}

	public STM<Boolean> removeFixUp(TreeNode target, TreeNode sibling, Boolean wasLeftChild){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( target.getColor(),{ Color color => 
 color == Color.BLACK ?  STMRTS.bind( target.getLeft(),{ TreeNode lchild => 
 lchild != empty ?  STMRTS.bind( lchild.getColor(),{ Color color => 
 color == Color.RED ?  STMRTS.then( lchild.setColor(Color.BLACK), 
 STMRTS.stmReturn(false)  )  
	   :  this.removeFixUp1(target, sibling, wasLeftChild)    })  
	   :  STMRTS.bind( target.getRight(),{ TreeNode rchild => 
 STMRTS.bind( rchild.getColor(),{ Color color => 
 color == Color.RED ?  STMRTS.then( rchild.setColor(Color.BLACK), 
 STMRTS.stmReturn(false)  )  
	   :  this.removeFixUp1(target, sibling, wasLeftChild)    }) })   })  
	   :  STMRTS.stmReturn(false)    }) }) ;
	}

	public STM<Boolean> removeFixUp1(TreeNode target, TreeNode sibling, Boolean wasLeftChild){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( target.getParent(),{ TreeNode parent => 
 parent != empty ?  this.removeFixUp2(target, sibling, wasLeftChild)   
	   :  STMRTS.stmReturn(false)    }) }) ;
	}

	public STM<Boolean> removeFixUp2(TreeNode target, TreeNode sibling, Boolean wasLeftChild){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( target.getParent(),{ TreeNode parent => 
 STMRTS.bind( sibling.getColor(),{ Color color => 
 color == Color.RED ?  STMRTS.then( parent.setColor(Color.RED), 
 STMRTS.then( sibling.setColor(Color.BLACK), 
 wasLeftChild ?  STMRTS.bind( sibling.getLeft(),{ TreeNode newSibling => 
 STMRTS.then( rotateLeft(parent), 
 this.removeFixUp3(target, newSibling, wasLeftChild)  ) })  
	   :  STMRTS.bind( sibling.getRight(),{ TreeNode newSibling => 
 STMRTS.then( rotateRight(parent), 
 this.removeFixUp3(target, newSibling, wasLeftChild)  ) })   ) )  
	   :  this.removeFixUp3(target, sibling, wasLeftChild)    }) }) }) ;
	}


	public STM<Boolean> removeFixUp3(TreeNode target, TreeNode sibling, Boolean wasLeftChild){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( target.getParent(),{ TreeNode parent => 
 STMRTS.bind( sibling.getLeft(),{ TreeNode lchild => 
 STMRTS.bind( sibling.getRight(),{ TreeNode rchild => 
 STMRTS.bind( parent.getColor(),{ Color pcolor => 
 STMRTS.bind( sibling.getColor(),{ Color scolor => 
 STMRTS.bind( rchild.getColor(),{ Color rcolor => 
 STMRTS.bind( lchild.getColor(),{ Color lcolor => 
 pcolor == Color.BLACK && scolor == Color.BLACK &&
			  rcolor  == Color.BLACK && lcolor == Color.BLACK ?  STMRTS.then( sibling.setColor(Color.RED), 
 STMRTS.bind( this.getSibling(parent),{ TreeNode sibling => 
 STMRTS.bind( this.isLeftChild(parent),{ boolean isLeftChild => 
 this.removeFixUp1(parent, sibling, isLeftChild)  }) }) )  
	   :  this.removeFixUp4(target, sibling, wasLeftChild)    }) }) }) }) }) }) }) }) ;
	}

	public STM<Boolean> removeFixUp4(TreeNode target, TreeNode sibling, Boolean wasLeftChild){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( target.getParent(),{ TreeNode parent => 
 STMRTS.bind( sibling.getLeft(),{ TreeNode lchild => 
 STMRTS.bind( sibling.getRight(),{ TreeNode rchild => 
 STMRTS.bind( parent.getColor(),{ Color pcolor => 
 STMRTS.bind( sibling.getColor(),{ Color scolor => 
 STMRTS.bind( rchild.getColor(),{ Color rcolor => 
 STMRTS.bind( lchild.getColor(),{ Color lcolor => 
 pcolor == Color.RED && scolor == Color.BLACK &&
				rcolor == Color.BLACK && lcolor == Color.BLACK ?  STMRTS.then( sibling.setColor(Color.RED), 
 STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.stmReturn(true)  ) )  
	   :  this.removeFixUp5(target, sibling, wasLeftChild)    }) }) }) }) }) }) }) }) ;
	}

	public STM<Boolean> removeFixUp5(TreeNode target, TreeNode sibling, Boolean wasLeftChild){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( target.getParent(),{ TreeNode parent => 
 STMRTS.bind( sibling.getColor(),{ Color scolor => 
 scolor == Color.BLACK ?  STMRTS.bind( sibling.getLeft(),{ TreeNode lchild => 
 STMRTS.bind( sibling.getRight(),{ TreeNode rchild => 
 STMRTS.bind( rchild.getColor(),{ Color rcolor => 
 STMRTS.bind( lchild.getColor(),{ Color lcolor => 
 wasLeftChild && rcolor == Color.BLACK && lcolor == Color.RED ?  STMRTS.then( sibling.setColor(Color.RED), 
 STMRTS.then( lchild.setColor(Color.BLACK), 
 STMRTS.then( rotateRight(sibling), 
 this.removeFixUp6(target, lchild, wasLeftChild)  ) ) )  
	   :  !wasLeftChild && rcolor == Color.RED && lcolor == Color.BLACK ?  STMRTS.then( sibling.setColor(Color.RED), 
 STMRTS.then( rchild.setColor(Color.BLACK), 
 STMRTS.then( rotateLeft(sibling), 
 this.removeFixUp6(target, rchild, wasLeftChild)  ) ) )  
	   :  this.removeFixUp6(target, sibling, wasLeftChild)      }) }) }) })  
	   :  this.removeFixUp6(parent, sibling, wasLeftChild)    }) }) }) ;
	}

	public STM<Boolean> removeFixUp6(TreeNode target, TreeNode sibling, Boolean wasLeftChild){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( target.getParent(),{ TreeNode parent => 
 STMRTS.bind( sibling.getLeft(),{ TreeNode lchild => 
 STMRTS.bind( sibling.getRight(),{ TreeNode rchild => 
 STMRTS.bind( parent.getColor(),{ Color pcolor => 
 STMRTS.then( sibling.setColor(pcolor), 
 STMRTS.then( parent.setColor(Color.BLACK), 
 STMRTS.bind( sibling.getColor(),{ Color scolor => 
 STMRTS.bind( rchild.getColor(),{ Color rcolor => 
 STMRTS.bind( lchild.getColor(),{ Color lcolor => 
 wasLeftChild ?  STMRTS.then( rchild.setColor(Color.BLACK), 
 STMRTS.then( rotateLeft(parent), 
 STMRTS.stmReturn(true)  ) )  
	   :  STMRTS.then( lchild.setColor(Color.BLACK), 
 STMRTS.then( rotateRight(parent), 
 STMRTS.stmReturn(true)  ) )   }) }) }) ) ) }) }) }) }) }) ;
	}
	
	public STM<TreeNode> locate(TreeNode root, Integer value){
	
		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 root == empty ?  STMRTS.stmReturn(empty)   
	   :  STMRTS.bind( root.getValue(),{ Integer v => 
 v.equals(value) ?  STMRTS.stmReturn(root)   
	   :  v>value ?  STMRTS.bind( root.getLeft(),{ TreeNode left => 
 locate(left, value)  })  
	   :  STMRTS.bind( root.getRight(),{ TreeNode right => 
 locate(right, value)  })     })   }) ;	
	}

	public STM<Boolean> find(Integer value){
	
		return  STMRTS.bind( this.getRoot(),{ TreeNode root => 
 STMRTS.bind( this.locate(root, value),{ TreeNode node => 
 STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.stmReturn(node != empty)  }) }) }) ;	

	}

	private STM<Boolean> isLeftChild(TreeNode node){

		return  STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.bind( parent.getLeft(),{ TreeNode left => 
 left.equals(node) ?  STMRTS.stmReturn(true)   
	   :  STMRTS.stmReturn(false)    }) }) ;

	}

	public STM<TreeNode> rotateLeft(TreeNode node){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( node.getRight(),{ TreeNode tempNode => 
 STMRTS.bind( tempNode.getLeft(),{ TreeNode left => 
 STMRTS.then( node.setRight(left), 
 STMRTS.then( left.setParent(node), 
 STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.then( parent == empty ?  STMRTS.then( this.setRoot(tempNode), 
 tempNode.setParent(empty)  )  
	   :  STMRTS.bind( this.isLeftChild(node),{ Boolean isLeftChild => 
 STMRTS.then( isLeftChild ?  parent.setLeft(tempNode)   
	   :  parent.setRight(tempNode)  , 
 tempNode.setParent(parent)  ) }) , 
 STMRTS.then( tempNode.setLeft(node), 
 STMRTS.then( node.setParent(tempNode), 
 STMRTS.stmReturn(node)  ) ) ) }) ) ) }) }) }) ;
	}

	public STM<TreeNode> rotateRight(TreeNode node){

		return  STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 STMRTS.bind( node.getLeft(),{ TreeNode tempNode => 
 STMRTS.bind( tempNode.getRight(),{ TreeNode right => 
 STMRTS.then( node.setLeft(right), 
 STMRTS.then( right.setParent(node), 
 STMRTS.bind( node.getParent(),{ TreeNode parent => 
 STMRTS.then( parent == empty ?  STMRTS.then( this.setRoot(tempNode), 
 tempNode.setParent(empty)  )  
	   :  STMRTS.bind( this.isLeftChild(node),{ Boolean isLeftChild => 
 STMRTS.then( isLeftChild ?  parent.setLeft(tempNode)   
	   :  parent.setRight(tempNode)  , 
 tempNode.setParent(parent)  ) }) , 
 STMRTS.then( tempNode.setRight(node), 
 STMRTS.then( node.setParent(tempNode), 
 STMRTS.stmReturn(node)  ) ) ) }) ) ) }) }) }) ;
	}

	public STM<TreeNode> successor(TreeNode node){

		return  STMRTS.bind( node.getRight(),{ TreeNode rchild => 
 STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 rchild == empty ?  STMRTS.stmReturn(empty)   
	   :  leftmostChild(rchild)    }) }) ;
	}

	private STM<TreeNode> leftmostChild(TreeNode node){

		return  STMRTS.bind( node.getLeft(),{ TreeNode lchild => 
 STMRTS.bind( this.getEMPTY(),{ TreeNode empty => 
 lchild == empty ?  STMRTS.stmReturn(node)   
	   :  leftmostChild(lchild)    }) }) ;
	}

	private STM<stm.Void> exchangeNodes(TreeNode a, TreeNode b){

		return  STMRTS.bind( a.getValue(),{ Integer a_value => 
 STMRTS.bind( b.getValue(),{ Integer b_value => 
 STMRTS.then( a.setValue(b_value), 
 b.setValue(a_value)  ) }) }) ;
	}					
}
