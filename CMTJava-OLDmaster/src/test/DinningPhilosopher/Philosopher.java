package test.DinningPhilosopher;

import stm.*;

class Philosopher extends Thread {
	
   Fork right; 
   Fork left; 
   int id; 
	
   Philosopher (int i, Fork l, Fork r) {
      right = r;
      left = l;
      id = i;
   }
	
	public void run() {

		do{
      STM<stm.Void> t1 =  STMRTS.then( acquireFork(left), 
 acquireFork(right)  ) ;
			STMRTS.atomic(t1);

			System.out.println("Philosopher " + id + " is eating!!!");

			STM<stm.Void> t2 =  STMRTS.then( releaseFork(left), 
 releaseFork(right)  ) ;
			STMRTS.atomic(t2);
		} while(true);
	}

	public STM<stm.Void> releaseFork (Fork g) {
	 
		return  g.setFork(true)  ;
	}

	public STM<stm.Void> acquireFork (Fork g) {

		STM<stm.Void> t =  STMRTS.bind( g.getFork(),{ Boolean b => 
 b==true ?  g.setFork(false)   
	   :  STMRTS.retry()    }) ;
	  return t;
	}          
}
