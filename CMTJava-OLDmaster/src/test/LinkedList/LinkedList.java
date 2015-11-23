package test.LinkedList;

import stm.*;

public class LinkedList<E> extends TLinkedList{	

	public STM<stm.Void> addFirst(E e) {

		STM<stm.Void> r =  STMRTS.bind( this.getHead(),{ Node head => 
 STMRTS.bind( STMRTS.stmReturn (new Node(e, head, null)),{ Node node => 
 STMRTS.then( this.setHead(node), 
 STMRTS.bind( this.getSize(),{ Integer lsize => 
 STMRTS.then( this.setSize(lsize+1), 
 lsize.equals(0) ?  this.setTail(node)   
	   :  STMRTS.then( node.setNext(head), 
 head.setPrevious(node)  )   ) }) ) }) }) ;
		return r;
	}

	public STM<stm.Void> addLast(E e) {

		STM<stm.Void> r =  STMRTS.bind( this.getTail(),{ Node tail => 
 STMRTS.bind( STMRTS.stmReturn (new Node(e, null, tail)),{ Node node => 
 STMRTS.then( this.setTail(node), 
 STMRTS.bind( this.getSize(),{ Integer lsize => 
 STMRTS.then( this.setSize(lsize+1), 
 lsize.equals(0) ?  this.setHead(node)   
	   :  STMRTS.then( tail.setNext(node), 
 node.setPrevious(tail)  )   ) }) ) }) }) ;
		return r;
	}

	public STM<Boolean> contains(E e) {

		STM<Boolean> r =  STMRTS.bind( this.getHead(),{ Node head => 
 this.contains(head, e)  }) ;
		return r;
	}

	private STM<Boolean> contains(Node curNode, E e) {

		STM<Boolean> r =  curNode == null ?  STMRTS.stmReturn(false)   
	   :  STMRTS.bind( curNode.getElement(),{ E element => 
 element.equals(e) ?  STMRTS.stmReturn(true)   
	   :  STMRTS.bind( curNode.getNext(),{ Node next => 
 contains(next, e)  })   })   ;
		return r;
	}

	public STM<Boolean> remove(E e) {

		STM<Boolean> r =  STMRTS.bind( this.getHead(),{ Node head => 
 remove(head, e)  }) ;
		return r;
	}

	private STM<Boolean> remove(Node curNode, E e) {

		STM<Boolean> r =  curNode==null ?  STMRTS.stmReturn(false)   
	   :  STMRTS.bind( curNode.getElement(),{ Integer element => 
 !element.equals(e) ?  STMRTS.bind( curNode.getNext(),{ Node next => 
 remove(next, e)  })  
	   :  STMRTS.then( remove(curNode), 
 STMRTS.stmReturn(true)  )   })   ;
		return r;
	}

	private STM<E> remove(Node<E> node) {

		STM<E> r =  STMRTS.bind( this.getSize(),{ Integer lsize => 
 STMRTS.then( this.setSize(lsize-1), 
 STMRTS.then( lsize == 1 ?  STMRTS.then( this.setHead(null), 
 this.setTail(null)  )  
	   :  STMRTS.bind( this.getHead(),{ Node head => 
 STMRTS.bind( node.getNext(),{ Node next => 
 STMRTS.bind( node.getPrevious(),{ Node previous => 
 node == head ?  STMRTS.then( this.setHead(next), 
 next.setPrevious(null)  )  
	   :  STMRTS.bind( this.getTail(),{ Node tail => 
 node == tail ?  STMRTS.then( this.setTail(previous), 
 previous.setNext(null)  )  
	   :  STMRTS.then( previous.setNext(next), 
 next.setPrevious(previous)  )   })   }) }) }) , 
 node.getElement()  ) ) }) ;
		return r;
	}

	public STM<E> removeFirst() {

		STM<E> r =  STMRTS.bind( this.getHead(),{ Node head => 
 head == null ?  STMRTS.stmReturn(null)   
	   :  STMRTS.stmReturn(this.remove(head))    }) ;
		return r;
	}
}
