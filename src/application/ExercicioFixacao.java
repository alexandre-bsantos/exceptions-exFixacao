package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.WithdrawException;

public class ExercicioFixacao {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		try {
			
			System.out.println("Enter account data");
			System.out.print("Number: ");
			int number = sc.nextInt();
			System.out.print("Holder: ");
			sc.nextLine();
			String holder = sc.nextLine();
			System.out.print("Initial balance: ");
			double balance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			double withdrawLimit = sc.nextDouble();
			
			Account account = new Account(number, holder, balance, withdrawLimit);
			System.out.println();
			System.out.print("Enter amount for withdraw: ");
			double amount = sc.nextDouble();
			account.withdraw(amount);
			
			System.out.printf("New balance: %.2f", account.getBalance());
		}
		catch (WithdrawException e){
			System.out.println(e.getMessage());
		}
		catch (Exception e) {
			System.out.println("Unexpected error");
		}
		sc.close();
		
	}

}
