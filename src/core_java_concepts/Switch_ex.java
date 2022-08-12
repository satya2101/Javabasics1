package core_java_concepts;

public class Switch_ex {

	public static void main(String[] args) {
		
		int ch=1;
		
		switch(ch)
		{
			case 1:System.out.println("today is Sunday");
				break;
			case 2:System.out.println("today is monday");
			break;
			case 3:System.out.println("today is tuesday");
			break;
			case 4:System.out.println("today is wednesday");
			break;
			case 5:System.out.println("today is thursday");
			break;
			case 6:System.out.println("today is friday");
			break;
			case 7:System.out.println("today is saturday");
			break;
			default: System.out.println("enter valid key");
			break;
		}
	}

}
