package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {

	public static void main(String[] args) {
		
		Account acc = new Account(1001, "Alex", 0.0);
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);
		
		// UPCASTING
		
		Account acc1 = bacc;
		Account acc2 = new BusinessAccount(1003, "Bob", 0.0, 200.0);
		Account sacc3 = new SavingsAccount(1004, "Anna", 0.0, 0.01);
		Account acc6 = new Account(1001, "Gilberto", 1000.0);
		Account sacc7 =new SavingsAccount(1010, "Silva", 1000.0, 0.01);
		Account bacc8 = new BusinessAccount(1011, "Alex", 1000.0, 500.0);
		
		// DOWNCASTING
		
		BusinessAccount acc4 = /* Casting de classes */ (BusinessAccount)acc2;
		acc4.loan(100.0);
		
		// BusinessAccount acc5 = (BusinessAccount)acc3;
		if(sacc3 instanceof BusinessAccount) {
			BusinessAccount acc5 = (BusinessAccount)sacc3;
			acc5.loan(200.0);
			System.out.println("Laon!");
		}
		
		if(sacc3 instanceof SavingsAccount) {
			SavingsAccount acc5 = (SavingsAccount)sacc3;
			acc5.updateBalance();
			System.out.println("Update!");
		}
		
		acc6.withdraw(200.0);
		System.out.println(acc6.getBalance());
		
		sacc7.withdraw(200.0);
		System.out.println(sacc7.getBalance());
		
		bacc8.withdraw(200.0);
		System.out.println(bacc8.getBalance());
	}
	
}
