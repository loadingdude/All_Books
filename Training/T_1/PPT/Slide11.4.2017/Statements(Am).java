public class Statements{
	public static void main(String[] args){
		int x=30;
		int y=10;
		char grade='C';


	//IF Statement

	if(x>20){
		System.out.println("this is if statement");
	}

	
	//If-else Statement

	if(x<20){
		System.out.println("this is if statement");
	}else {
		System.out.println("this is else statement");
	}


	//If...else if...else Statement

	if(x==10){
		System.out.println("value of x is 10");
	}else if(x==20){
		System.out.println("value of x is 20");
	}else if(x==30){
		System.out.println("value of x is 30");
	}else {
		System.out.println("this is else statement");
	}


	//Nested if Statement

	if(x==30){
		if(y==10){
		System.out.println("x=30 and y=10");
		}
	}
	


	//Switch Statement

	switch(grade){
		case 'A':
			System.out.println("Execellent");
			break;
		case 'B':
		case 'C':
			System.out.println("well done");
			break;
		case 'D':
			System.out.println("you passed");
			break;
		case 'F':
			System.out.println("better try again");
			break;
		default:
			System.out.println("Invalid grade");
		}
		System.out.println("your grade is" +grade);


	//while condition

	while(x<40){
		System.out.println("value of x:" +x);
		x++;
	}
}
}