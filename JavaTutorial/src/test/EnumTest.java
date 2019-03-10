package test;

import library.EnumDemo;
import library.EnumDemo.Operation;
import library.EnumDemo.States;
import library.EnumDemo.UserStatus;
/**
 * Enum Test
 * 
 * @author Sangam 
 */
public class EnumTest {

	public static void main(String[] args) {

		//Printing
		System.out.println(UserStatus.ACTIVE);

		//Calling
		double result = Operation.PLUS.calculate(1, 2);
		System.out.println(result); //3.0

		//Looping

		for (UserStatus status : UserStatus.values()) {
			System.out.println(status);
		}

		// States full form

		String op = States.AR.fullForm("AR");
		System.out.println(op);
	}

}
