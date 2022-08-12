package core_java_concepts;

public class Arithmatic_operationSwitch {

	public static void main(String[] args) {
		
		int a=10;
		int b=5;
		String ch="add";
		
		switch(ch)
		{
		case "add":System.out.println("additon of "+a+" and "+b+" is "+(a+b));
		break;
		case "sub":System.out.println("additon of "+a+" and "+b+" is "+(a-b));
		break;
		case "mul":System.out.println("additon of "+a+" and "+b+" is "+(a*b));
		break;
		default: System.out.println("enter valid key");
		break;
		}
	}

}
