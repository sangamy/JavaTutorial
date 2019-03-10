package library;
/**
 * Constructor Demo
 * 
 * @author Sangam 
 */
public class ConstructorDemo {

	//Variable declaration
	String firstName;
	String middleName;
	String lastName;
	int age;
	double income;

	//Default Constructor
	public ConstructorDemo(){

		this.firstName = "Sangam";
		this.middleName = "E";
		this.lastName = "Yadagiri";
		this.age = 30;
		this.income = 55000.00;

	}

	//Parameterized Constructor

	public ConstructorDemo(String firstName, String middleName, String lastName, int age, double income){
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.age = age;
		this.income = income;
	}

	//Getter

	public String getFirstName() {
		return firstName;
	}

	//Setter

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

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getIncome() {
		return income;
	}

	public void setIncome(double income) {
		this.income = income;
	}


	public void display(){
		//Example Output: Sangam E Yadagiri aged 30 has income $55,000 per annum.

		System.out.println(firstName + " "+ middleName + " "+ lastName + " aged "+age + " has income $"+ income+ " per annum." );

	}




}
