// Thanyathon Kitsakun
// 6887101

import java.util.ArrayList;
import java.util.List;

public class Bank {
	//1.variable
	private ArrayList<BankAccount> accounts;
	//2.constructor
	public Bank(){
		accounts = new ArrayList<BankAccount>();
	}
	//3.methods
	//add an account to this bank
	public void addAccount(BankAccount a){
		accounts.add(a);
	}
	//gets the sum of the balances of all accounts in this bank
	public double getTotalBalance(){
		
		//**************** YOUR CODE HERE****************
        double total = 0;
		for (BankAccount acc : accounts){
            total += acc.getBalance();
        }
		return total;
		//*********************************************
	}
	//counts the number of bank account whose balance is at least given value.
	public int countBalanceAtLeast(double atLeast){
		
		//**************** YOUR CODE HERE****************
        int totalAtLeast = 0;
            for (BankAccount acc : accounts){
                if (acc.getBalance() >= atLeast){
                    totalAtLeast++;
                }
            }
		return totalAtLeast;
		//*********************************************
	}
	
	//finds a bank account with a given number
	public BankAccount find(int accountNumber){
		
		//**************** YOUR CODE HERE****************
        for (BankAccount acc : accounts){
            if (acc.getAccountNumber() == accountNumber){
                return acc;
            }   
        }
		return null;
		//*********************************************
	}
	
	//gets the bank account with the largest balance.
	public BankAccount getMax(){
		
		//**************** YOUR CODE HERE****************
        BankAccount max = accounts.get(0);
            for (BankAccount acc : accounts){
                if (acc.getBalance() > max.getBalance()){
                    max = acc;
                }
            }
		return max;
		//*********************************************
	}
	
	//gets the bank account with the minimum balance.
	public BankAccount getMin(){
		
		//**************** YOUR CODE HERE****************
        BankAccount min = accounts.get(0);
            for (BankAccount acc : accounts){
                if (acc.getBalance() < min.getBalance()){
                    min = acc;
                }
            }
		return min;
		//*********************************************
	}
	
	
	
	
	
}