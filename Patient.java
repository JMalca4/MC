
public class Patient {
	//declaring String  variables
	private String firstName, middleName, lastName;
	
	private String address, city, state, zip;
	
	private String phoneNumber;
	
	private String emergencyName, emergencyNumber;
	
	//default constructor
	public Patient() {
		
		firstName = "";
		middleName = "";
		lastName = "";
		address = "";
		city = "";
		state = "";
		zip = "";
		phoneNumber = "";
		emergencyName = "";
		emergencyNumber = "";
	}
	//constructor to create class
	public Patient(Patient m) {
		firstName = m.firstName;
		middleName = m.middleName;
		lastName = m.lastName;
		address = m.address;
		city = m.city;
		state = m.state;
		zip = m.zip;
		phoneNumber = m.phoneNumber;
		emergencyName = m.emergencyName;
		emergencyNumber = m.emergencyNumber;
	}
	//constructor to initialize values
	public Patient(String firstName, String middleName, String lastName) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
	}
	
	public Patient(String address, String city, String state, String zip, String phoneNumber, String emergencyName, String emergencyNumber) {
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
		this.emergencyName = emergencyName;
		this.emergencyNumber = emergencyNumber;
	}
	
	public Patient(String firstName, String middleName, String lastName, String address, String city, String state, String zip, String emergencyName, String emergencyNumber) {
		
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.emergencyName = emergencyName;
		this.emergencyNumber = emergencyNumber;
	}
	
	//setters and getters for all values
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getMiddleName() {
		return middleName;
	}
	
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCity() {
		return city;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public String getState() {
		return state;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getZip() {
		return zip;
	}
	
	public void setZip(String zip) {
		this.zip = zip;
	}
	
	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	public String getEmergencyName() {
		return emergencyName;
	}
	
	public void setEmergencyName(String emergencyName) {
		this.emergencyName = emergencyName;
	}
	
	public String getEmergencyNumber() {
		return emergencyNumber;
	}
	
	public void setEmergencyNumber(String emergencyNumber) {
		this.emergencyNumber = emergencyNumber;
	}
	//method to build name
	public String buildFullName() {
		return (this.firstName + " " + this.middleName + " " + this.lastName);
	}
	//method to buildAddress
	public String buildAddress() {
		return (this.address + " " + this.city + " " + this.state + " " + this.zip);
	}
	//method to build emergency contact info
	public String buildEmergencyContact() {
		return (this.emergencyName + " " + this.emergencyNumber);
	}
	//tostring to print out patient info
	public String toString() {
		return ("Patient info:\n Name: " + buildFullName() + "\n Address: " + buildAddress() + "\n EmergencyContact: " + buildEmergencyContact() + "\n");
	}
	
}
