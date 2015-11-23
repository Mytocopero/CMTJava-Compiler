package test.LinkedBlockingQueue;

import stm.*;

public class LinkedBlockingQueue<E> extends TLinkedBlockingQueue{

	/**
		Constructors
	*/

	public LinkedBlockingQueue(int capacity) {
		super(capacity);
	}

	public LinkedBlockingQueue() {
		super();
    }

    	/**
    Retrieves and removes the head of this queue, waiting if necessary until an element becomes available.
	*/
	public STM<E> take() {

		return  STMRTS.bind( this.getCount(),{ Integer count => 
 STMRTS.bind( this.isFull(),{ Boolean full => 
 full ?  STMRTS.then( STMRTS.retry(), 
 STMRTS.stmReturn(null)  )  
	   :  STMRTS.bind( this.extract(),{ E e => 
 STMRTS.stmReturn(e)  })   }) }) ;
    }

	/**
     Retrieves and removes the head of this queue, 
		or returns null if this queue is empty.
	*/
	public STM<E> poll() {

		return  STMRTS.bind( this.getCount(),{ Integer count => 
 STMRTS.bind( this.isFull(),{ Boolean full => 
 count == 0 ?  STMRTS.stmReturn(null)   
	   :  STMRTS.bind( this.extract(),{ E e => 
 STMRTS.stmReturn(e)  })   }) }) ;
    }

	/*Adds the specified element to the tail of this queue, 
	waiting if necessary for space to become available.
	*/

	public STM<stm.Void> put(E e){
		
		return  STMRTS.bind( this.isFull(),{ Boolean full => 
 full ?  STMRTS.retry()   
	   :  this.insert(e)    }) ;
	}

	/**
     * Inserts the specified element at the tail of this queue if it is
     * possible to do so immediately without exceeding the queue's capacity,
     * returning true upon success and false if this queue
     * is full.
	*/
    public STM<Boolean> offer(E e) {
		
		return  STMRTS.bind( this.isFull(),{ Boolean full => 
 full ?  STMRTS.stmReturn(false)   
	   :  STMRTS.then( this.insert(e), 
 STMRTS.stmReturn(true)  )   }) ;
	}

	/** 
		Auxiliar Methods
	*/

    /**
     * Creates a node and links it at end of queue.
     */
    private STM<stm.Void> insert(E x) {

		return  STMRTS.bind( this.getLast(),{ Node tail => 
 STMRTS.bind( STMRTS.stmReturn (new Node(x)),{ Node node => 
 STMRTS.then( this.setLast(node), 
 STMRTS.bind( this.getCount(),{ Integer count => 
 STMRTS.then( this.setCount(count+1), 
 count.equals(0) ?  this.setHead(node)   
	   :  tail.setNext(node)    ) }) ) }) }) ;
    }

    /**
     * Removes a node from head of queue,
     * returns the node
     */
     private STM<E> extract() {
			return  STMRTS.bind( this.getHead(),{ Node head => 
 STMRTS.bind( this.getCount(),{ Integer count => 
 STMRTS.then( this.setCount(count-1), 
 count.equals(1) ?  STMRTS.then( this.setHead(null), 
 STMRTS.then( this.setLast(null), 
 STMRTS.stmReturn ((E)head)  ) )  
	   :  STMRTS.bind( head.getNext(),{ Node first => 
 STMRTS.bind( first.getNext(),{ Node second => 
 STMRTS.then( first.setNext(second), 
 STMRTS.then( this.setHead(first), 
 STMRTS.stmReturn ((E)head)  ) ) }) })   ) }) }) ;
    }







	/**
	Checks wheather the queue is full or not
	*/
    private STM<Boolean> isFull() {
	
		return  STMRTS.bind( this.getCount(),{ Integer count => 
 STMRTS.bind( this.getCapacity(),{ Integer capacity => 
 count != capacity ? STMRTS.stmReturn(false) 
	   : STMRTS.stmReturn(true)  }) }) ;	
				
	}
}
