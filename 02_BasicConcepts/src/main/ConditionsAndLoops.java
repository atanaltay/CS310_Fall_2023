package main;

public class ConditionsAndLoops {

	public static void main(String[] args) {

		// Conditions
		// operators: < > <= <=
		// logical operators: && and ||

		// if - else if - else

		int age = 50;

		if (age < 40) {
			System.out.println("Age is less than 40");
		} else if (age < 60) {
			System.out.println("Age is 40-60");
		} else {
			System.out.println("Age is greater than 60");
		}

		// switch

		switch (age) {
		case 30: {
			System.out.println("Age is 30");
			break;
		}
		case 40: {
			System.out.println("Age is 40");
			break;
		}

		default:
			System.out.println("In is none");
		}

		// && and || are short circuit operators
		//and -- or

		
		age = 20;
		
		if (age > 30 & ++age < 40) {
			System.out.println("Age is 30 - 40");
		}else {
			System.out.println("Condition doesn't hold");
		}

		System.out.println("Age is " + age);
		
		/*
		age = 20;
		
		if (age > 30 & ++age < 40) {
			System.out.println("Age is 30 - 40");
		}else {
			System.out.println("Condition doesn't hold");
		}

		System.out.println("Age is " + age);
		*/
	}
}
