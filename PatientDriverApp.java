/*
 * Class: CMSC203 
 * Instructor: Dr .Kuijt
 * Description: (Give a brief description for each Class)
 * Due: 09/24/2023
 * Platform/compiler: Eclipse
 * I pledge that I have completed the programming 
 * assignment independently. I have not copied the code 
 * from a student or any source. I have not given my code 
 * to any student.
   Print your Name here: ____James Malca______
*/

public class PatientDriverApp {

	public static void main(String[] args) {
		Patient patient = new Patient("Jenny", "Elaine", "Santori","123 Main Street", "MyTown", "CA", "01234", "Bill Santori", "777-555-1212"); //creating a patient object and initializing with values
		
		Procedure procedure1 = new Procedure("Physical Exam", "7/20/2019", "Dr, Irvine", 3250.00); //creating a procedure object and initializing with values
		
		Procedure procedure2 = new Procedure("X-ray","7/20/2019", "Dr. Jamison", 5500.43); //creating a procedure object and initializing with values
		
		Procedure procedure3 = new Procedure("Blood Test", "7/20/2019", "Dr. Smith", 1400.75);//creating a procedure object and initializing with values
		
		displayPatient(patient); //displaying patient info
		
		displayProcedure(procedure1); // displaying all procedure info
		
		displayProcedure(procedure2);
		
		displayProcedure(procedure3);
		
		
		
		System.out.println("Total Charges: $" + calculateTotalCharges(procedure1.getCharges(), procedure2.getCharges(), procedure3.getCharges())); //print outs the total charges
		
		System.out.println("Student Name: James Malca");
		
		System.out.println("MC#: M21095336");
		
		System.out.println("Due Date: 09/24/2023");
	}
	
	public static void displayPatient(Patient newPatient) { //method that uses tostring to display patient info
		System.out.println(newPatient.toString());
	}
	
	public static void displayProcedure(Procedure newProcedure) { //method that uses tostring to display procedure info
		System.out.println(newProcedure.toString());
	}
	
	public static double calculateTotalCharges(double charge1, double charge2, double charge3) { //method to calculate total costs
		double result;
		
		result = charge1 + charge2 + charge3;
		
		return result;
	}
}
