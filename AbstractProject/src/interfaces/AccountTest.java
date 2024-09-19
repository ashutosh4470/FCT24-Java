package interfaces;

public class AccountTest {
	public static void main(String[] args) {
	  Bank bank = new Bank("SBI", 50000.0);
      SavingAccount savingAcc = new SavingAccount(bank, 5);
      CurrentAccount currentAcc = new CurrentAccount(bank, 1000.0);

      bank.createAccount("Saving");
      savingAcc.deposit(2000.0);
      savingAcc.calculateInterest();
      savingAcc.getBalance();
      bank.closeAccount("Saving");

      bank.createAccount("Current");
      currentAcc.deposit(3000.0);
      currentAcc.withdraw(2500.0);
      currentAcc.getBalance();
      currentAcc.calculateInterest(); 
      bank.closeAccount("Current");
	}
}

interface Account {
	void deposit(double amount);

	void getBalance();
}

abstract class BaseAccount implements Account {
	protected Bank bank;
	protected double balance;

	public BaseAccount(Bank bank) {
		this.bank = bank;
		this.balance = 0.0;
	}

	@Override
	public void deposit(double amount) {
		balance += amount;
		System.out.println("Deposited " + amount + " . Account balance : " + balance);
	}

	@Override
	public void getBalance() {
		System.out.println("Current account balance : " + balance);
	}

	public abstract void calculateInterest();

}

class SavingAccount extends BaseAccount {
	private double interestRate;

	public SavingAccount(Bank bank, double interestRate) {
		super(bank);
		this.interestRate = interestRate;
	}

	@Override
	public void calculateInterest() {
		double interest = balance * (interestRate / 100);
		System.out.println("Interest calculated at rate " + interestRate + " % : " + interest);
	}
}

class CurrentAccount extends BaseAccount {

	private double monthlyFee;

	public CurrentAccount(Bank bank, double monthlyFee) {
		super(bank);
		this.monthlyFee = monthlyFee;
	}

	@Override
	public void calculateInterest() {
		System.out.println("Current account type do not earn interest.");
	}

	public void withdraw(double amount) {
		if (balance >= amount) {
			balance -= amount;
			System.out.println("Withdrawn " + amount + ". Remaining balance : " + balance);
		} else {
			System.out.println("Insufficient Balance ...");
		}
	}

	public void applyMonthlyFee() {
		if(balance >= monthlyFee) {
			balance -= monthlyFee;
			System.out.println("Monthly fee of "+monthlyFee+" applied. Remaining balance : "+balance);
		}else
		{
			System.out.println("Insufficient balance to apply monthly fees . Balance : "+balance);
		}
	}

}


class Bank {
    private String bankName;
    private double balance;

    public Bank(String bankName, double balance) {
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