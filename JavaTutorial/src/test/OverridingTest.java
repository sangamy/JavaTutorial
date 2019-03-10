package test;

import library.OverridingChildClassDemo;
import library.OverridingParentClassDemo;

public class OverridingTest {

	public static void main(String[] args) {

		//Instantiation
		OverridingChildClassDemo obj = new OverridingChildClassDemo(); // Access all methods (child & parent)
		OverridingParentClassDemo obj2 = new OverridingChildClassDemo(); //Access only Child class (Selenium ex)
		// OverridingChildClassDemo obj3 =  new OverridingParentClassDemo(); //Illegal as child cannot hold parent
		OverridingParentClassDemo obj4 = new OverridingParentClassDemo(); // Access only Parent class methods

		obj.showThis();//child class method
		obj.add(); //child class overrides parent method //Overriding
		obj.sub();//Inheritence : Parent class
		obj.mul(); //Child class method
		obj.div(); //Child class method

		obj2.add(); //Overriding
		obj4.sub();

		obj.add(1, 2);
/*
		 WebDriver driver1 = new ChromeDriver();
         WebDriver driver2 = new FirefoxDriver();
         
         get(){
         }
         
   */
	}

}
