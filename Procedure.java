
public class Procedure {
	//declaring String and double variables
	private String procedureName;
	
	private String procedureDate;
	
	private String practitionerName;
	
	private double charges;
	//default constructor
	public Procedure() {
		procedureName = "";
		procedureDate = "";
		practitionerName = "";
		charges = 0;
	}
	//constructor to create class
	public Procedure(Procedure p) {
		procedureName = p.procedureName;
		procedureDate = p.procedureDate;
		practitionerName = p.practitionerName;
		charges = p.charges;
	}
	//constructor to initialize 
	public Procedure(String procedureName, String procedureDate) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
	}
	
	public Procedure(String practitionerName, double charges) {
		this.practitionerName = practitionerName;
		this.charges = charges;
	}
	
	public Procedure(String procedureName, String procedureDate, String practitionerName, double charges) {
		this.procedureName = procedureName;
		this.procedureDate = procedureDate;
		this.practitionerName = practitionerName;
		this.charges = charges;
	}
	//getters and setters for all values
	public String getProcedureName() {
		return procedureName;
	}
	
	public void setProcedureName(String procedureName) {
		this.procedureName = procedureName;
	}
	
	public String getProcedureDate() {
		return procedureDate;
	}
	
	public void setProcedureDate(String procedureDate) {
		this.procedureDate = procedureDate;
	}
	
	public String getPractitionerName() {
		return practitionerName;
	}
	
	public void setPractitionerName(String practitionerName) {
		this.practitionerName = practitionerName;
	}
	
	public double getCharges() {
		return charges;
	}
	
	public void setCharges(double charges) {
		this.charges = charges;
	}
	//tostring to print out procedure info
	public String toString() {
		return("\tProcedure: " + this.procedureName + "\n\tProcedureDate = " + this.procedureDate + "\n\tPractitioner = " + this.practitionerName + "\n\tCharge: " + this.charges + "\n");
	}
}
