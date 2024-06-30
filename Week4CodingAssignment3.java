
public class Week4CodingAssignment3 {

	public static void main(String[] args) {

	int n = 3;	
	String word = "Hello";	
	Repeat(word, n);
	String word2 = "Bye";
	Repeat(word2, n);
//**************************************************************************		
	String firstName = "Cool";
	String lastName = "Kid";
	System.out.println(fullName(firstName, lastName));
	
	String firstName1 = "Hot";
	String lastName1 = "Pot";
	System.out.println(fullName(firstName1, lastName1));
	
//**************************************************************************	
	
	int[] Array = {20,30,40,50,60};
	whatIsSum(Array);
	
	int[] Array1 = {1,1,1,1,1};
	whatIsSum(Array1);
// ***************************************************************************************************	
	}
	public static void Repeat(String Theword, int n) {
		System.out.println(Theword.repeat(n)); 	
	}
	
	public static String fullName(String firstName, String lastName) {
		return(firstName + " " + lastName);
		
	}
	public static boolean whatIsSum(int[] Array) {
		int sum = 0;
		for (int i = 0; i < Array.length; i++) {
			sum += Array[i];
		} if (sum > 100) {
			System.out.println("True");
		}
		else {
		System.out.println("False");
		
	}
		return false;
	
	}
	
	
	}

