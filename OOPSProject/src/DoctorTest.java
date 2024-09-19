
public class DoctorTest {
	public static void main(String[] args) {
		
		Doctor doctor  = new Doctor();
		doctor.diagnose();
		doctor.chargeFees(300);
		System.out.println("---------");
		
		Surgeon surgeon = new Surgeon();
		surgeon.diagnose();
		surgeon.doSurgery();
		surgeon.chargeFees(2000);
		
		System.out.println("---------");
		
		HeartSurgeon heartSurgeon = new HeartSurgeon();
		heartSurgeon.diagnose();
		//heartSurgeon.doSurgery(); // it is the inhertied function
		heartSurgeon.doHeartSurgery();
		heartSurgeon.chargeFees(200000);
		
	}
}

class Doctor
{		
	// it is explicit - no - arg ctor, visible to human eyes
	Doctor() { // it is never called as DEFAULT ctor
		System.out.println("Doctor ctor....");
	}
	void diagnose() {
		System.out.println("Doctor is diagnosing...EENTT....");
	}
	void chargeFees() {
		System.out.println("Doctor is charging.......");
	}
	void chargeFees(int amount) {
		System.out.println("Doctor is charging......."+amount);
	}
}

class Surgeon extends Doctor 
{
	Surgeon()  {
		//super(); by default this line is present in every ctor as a first line
		System.out.println("\tSurgeon ctor...");
	}
	void diagnose() {
		System.out.println("Surgeon is diagnosing...EENTT..+ CT SCAN..");
	}
	void doSurgery() {
		System.out.println("Surgeon is doing surgery.....");
	}
}
class HeartSurgeon extends Surgeon 
{
	HeartSurgeon() {
		//super();
		System.out.println("\t\tHeartSurgeon ctor...");
	}
	void diagnose() {
		System.out.println("HeartSurgeon is diagnosing...EENTT..+ CT SCAN..+ ECG SCAN....");
	}
	void doHeartSurgery() {
		System.out.println("HeartSurgery is doing heart surgery....");
	}

}