package bank;

public class BankTest {
	public static void main(String[] args) {
		Bank bank = new Bank("SBI", 50000.0);
		SavingAccount savingAcc = new SavingAccount(bank, 5);
		
		bank.createAccount("Saving");
		savingAcc.deposite(2000.0);
		savingAcc.calculateInterest();		
		bank.closeAccount("Saving");
	}
}

class Bank{
	private String bankName;
	private double balance;
	
	public Bank(String bankName,double balance) {
		this.bankName = bankName;
		this.balance = balance;
	}
	
	public void createAccount(String accType) {
        System.out.println(accType + " account created at " + bankName);
	}
	
	public void closeAccount(String accType) {
        System.out.println(accType + " account closed at " + bankName);
    }
	
	public void getBalance() {
        System.out.println("Balance: " + balance);
    }

    // Method to add balance to the bank
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited " + amount + ". New balance: " + balance);
    }
}

class SavingAccount{
	private Bank bank;	
	private double interestRate;
	
	public SavingAccount(Bank bank,double interestRate) {
		this.bank = bank;
		this.interestRate = interestRate;
	}
	public void calculateInterest() {
        System.out.println("Interest calculated at rate: " + interestRate + "%");	
	}
	public void deposite(double amount) {
		this.bank.deposit(amount);
	}
	public void getBalance() {
		bank.getBalance();
	}
}