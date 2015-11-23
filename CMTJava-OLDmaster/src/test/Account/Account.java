package test.Account;

import stm.*;

class Account extends TAccount{

	public STM<stm.Void> deposit (Double n) {
		
		return  STMRTS.bind( this.getBalance(),{ Double balance => 
 STMRTS.then( this.setBalance(balance + n), 
 STMRTS.bind( this.getOps(),{ Integer ops => 
 this.setOps(ops+1)  }) ) }) ;
	}

	public STM<stm.Void> withdraw (Double n) {
		
		return  STMRTS.bind( this.getOps(),{ Integer ops => 
 STMRTS.then( this.setOps(ops+1), 
 STMRTS.bind( this.getBalance(),{ Double balance => 
 balance>=n ? this.setBalance(balance - n) 
	   : STMRTS.retry()  }) ) }) ;
	}

	public STM<stm.Void> transfer(Account dest, Double n){
	
		return  STMRTS.then( this.withdraw(n), 
 dest.deposit(n)  ) ;
	}
}
