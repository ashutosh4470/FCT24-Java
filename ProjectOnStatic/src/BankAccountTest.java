
public class BankAccountTest {
	public static void main(String[] args) {
		
		System.out.println("Begin main");

		BankAccount.setRateOfInterest(5.7f);
		BankAccount.setRateOfInterest(5.8f);
		BankAccount.setRateOfInterest(5.9f);

		System.out.println("-----1st object----");
		BankAccount baObj1 = new BankAccount(101,5000); //now acno,name,bal is also allocated in the RAM
		
		System.out.println("-----2nd object----");
		BankAccount baObj2 = new BankAccount(102,6000); //now acno,name,bal is also allocated

		System.out.println("-----3rd object----");
		BankAccount baObj3 = new BankAccount(103,7000); //now acno,name,bal is also allocated
		
		System.out.println("-----4th object----");
		BankAccount baObj4 = new BankAccount(104);
		
		System.out.println("-----5th object----");
		BankAccount baObj5 = new BankAccount(9000.0);
		
		System.out.println("baObj1 "+baObj1);
		System.out.println("baObj2 "+baObj2);
		System.out.println("baObj3 "+baObj3);
		System.out.println("baObj4 "+baObj4);
		System.out.println("baObj5 "+baObj5);
		
		System.out.println("End  main");
		
		/*
		System.out.println("Following is the rate of interest...");//rateOfInterest is allocated in the RAM
		
		System.out.println("CURRENT RATE : "+BankAccount.getRateOfInterest());
		BankAccount.setRateOfInterest(5.7f);
		System.out.println("NEW RATE : "+BankAccount.getRateOfInterest());
		
		
		System.out.println("Bank accounts are opened below....");
		BankAccount baObj1 = new BankAccount(101,"Jack",5000); //now acno,name,bal is also allocated in the RAM
		BankAccount baObj2 = new BankAccount(102,"Jane",6000); //now acno,name,bal is also allocated
		BankAccount baObj3 = new BankAccount(103,"Julie",7000); //now acno,name,bal is also allocated
		
		System.out.println("baObj1 "+baObj1);
		System.out.println("baObj2 "+baObj2);
		System.out.println("baObj3 "+baObj3);
		
		System.out.println("setting new rate of interest.....\n");
		BankAccount.setRateOfInterest(6.7f);
		System.out.println("NEW RATE AGAIN : "+BankAccount.getRateOfInterest());

		
		System.out.println("baObj1 "+baObj1);
		System.out.println("baObj2 "+baObj2);
		System.out.println("baObj3 "+baObj3);*/
		
		
		
	}
}


//com.fc.banks

class BankAccount
{
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	private static float rateOfInterest; //single copy maintained
	private static String bankName="State Bank Of India"; // single copy 
	
	public static float getRateOfInterest() { //static function
		return rateOfInterest; //can refer other static members
	}

	static
	{
		System.out.println("This is a static block...");
		System.out.println("DB CONNECTION HERE..ONLY ONCE....");
	}

	{//annonymous block - non-static initializer
		System.out.println("This is a normal non-static block...COMMON CODE (pre-loading) FOR EVERY CTOR to follow...");
		accountHolder="NONAME";
	}
	
	public static void setRateOfInterest(float rateOfInterest) {//a static method only refers static data
		System.out.println("setRateOfInterest(float) invoked...");
		BankAccount.rateOfInterest = rateOfInterest;
	}
	
	
	public BankAccount(int accountNumber, double accountBalance) {
		super();
		System.out.println("BankAccount(int,String,float) ctor...");
		this.accountNumber = accountNumber; //this <-- is the pointer to the current object 
		//this.accountHolder = "NONAME1";
		this.accountBalance = accountBalance;
	}
	
	public BankAccount(int acno) {
		System.out.println("BankAccount(int) ctor...");
		//this.accountHolder = "NONAME2";


	}
	public BankAccount(double bal) {
		System.out.println("BankAccount(double) ctor...");
		//this.accountHolder = "NONAME3";


	}
	
	public BankAccount(int accountNumber, String accountHolder, double accountBalance, float rateOfInterest) {
		super();
		this.accountNumber = accountNumber;
		this.accountHolder = accountHolder;
		this.accountBalance = accountBalance;
		this.rateOfInterest = rateOfInterest;
	}


	
	
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + ", rateOfInterest=" + rateOfInterest + "]";
	}

	
	

	


	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	
	
}