package lab4_nandini;
import java.util.Scanner;

public class Account extends Person {
	private long accNum;
	private double balance;
	
	public long getAccNum() {
		return accNum;
	}
	public void setAccNum(long accNum) {
		this.accNum = accNum;
	}
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public Account() {
		super();
	}
	
	public Account(long accNum,double balance) {
		super();
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public void deposit(double depositCash) {
		balance += depositCash;
		System.out.println("Credited INR" +depositCash);
	}
	
	public void withDraw(double withdrawCash) {
		balance -= withdrawCash;
		System.out.println("Debited INR" +withdrawCash);
	}
	
	public void getBalance(double balance) {
		System.out.println("Current Bal INR: " + balance);
	}
	
	

}
