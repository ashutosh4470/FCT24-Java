
public class CricketTest {

	public static void main(String[] args) {

		Cricketer cricketer = new Cricketer();					//Cricketer *ptr = new Cricketer(); in C++
		cricketer.rank=3;
		cricketer.crickerName="Ashutosh Mahale";
		
		cricketer.hitSixer();
		
		cricketer.printCricketerInformation();
		
		cricketer.hitFourRuns();
		
		cricketer.printCricketerInformation();
		
	}

}

class Cricketer // u may create a separate class also
{
	int rank;
	String crickerName;
	int age;
	float strikeRate;
	int numberOfCenturies;
	int numberOfFiftees;
	int numberOfSixers;
	int numberOfBoundries;
	int totalScore;

	
	void hitSixer() {
		System.out.println("Hitting six runs...");
		numberOfSixers++;
		totalScore = totalScore + 6;
	}

	void hitFourRuns() {
		System.out.println("Hitting four runs...");

		numberOfBoundries++;
		totalScore = totalScore + 4;
	}

	void makeOneRun() {
		totalScore++;
	}
	void printCricketerInformation() {
		System.out.println("Rank           : "+rank);
		System.out.println("Cricketer Name : "+crickerName);
		System.out.println("Total Score    : "+totalScore);
		
	}
	
}