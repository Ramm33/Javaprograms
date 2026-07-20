package com.javaintro;

public class MobileRechargePlan {
	void plandetails() {
		System.out.println("current recharge plan");
		System.out.println("plan Name : unlimited 299");
		System.out.println("valdity: 28 days");
		System.out.println("Data: 1.5gb/Day");
		System.out.println("unlimited calls");
	}

	void Recharge(double amount) {
		System.out.println("\recharge Successfull!");
		System.out.println("Recharge amount:"+amount);
		
	}

	public static void main(String[] args) {
		MobileRechargePlan Mr = new MobileRechargePlan();
		Mr.plandetails();
		Mr.Recharge(299);
		

	}

}
