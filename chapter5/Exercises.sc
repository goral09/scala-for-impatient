object Exercises {
	//2
	class BankAccount {
		private var balance: Double = 0
		def deposit(toDeposit: Double) = balance += toDeposit
		def withdraw(toWithdraw: Double): Double = {
			if(toWithdraw > balance) throw new IllegalArgumentException("Account balance is too low")
			balance -= toWithdraw
			toWithdraw
		}
		
		def currentBalance = balance
	}
	
	val b1 = new BankAccount                  //> b1  : Exercises.BankAccount = Exercises$BankAccount@7f6473
	b1.deposit(500)
	b1.currentBalance                         //> res0: Double = 500.0
	//3
	class Time(var hrs: Int, var min: Int) {
		assert(hrs < 24)
		assert(min < 60)
		def hours: Int = hrs
		def minutes: Int = min
		
		def before(other: Time): Boolean = {
			println("Checking");
			(hours*60 + minutes) < (other.hours * 60 + other.minutes)
		}
	}
	
	val t1 = new Time(10,50)                  //> t1  : Exercises.Time = Exercises$$anonfun$main$1$Time$1@1f97b55
	val t2 = new Time(9,30)                   //> t2  : Exercises.Time = Exercises$$anonfun$main$1$Time$1@bbc1e0
	t2.before(t1)                             //> Checking
                                                  //| res1: Boolean = true
}