
public class Week4CodingAssignment4 {

	public static void main(String[] args) {
	// 10 + 11 + 12. Write a method that takes an array of double and returns the average	
	//	of all the elements in the array.
		
double[] x = {20.11,30.22,40.33};
System.out.println(averageThatArray(x));

double[] y = {100.111, 100.2222, 100.333333};
System.out.println(averageThatArray(y));
	
System.out.println(A(x,y));

int grade = 40;
if (grade > 50) {
	System.out.println("you failed the course bad");
} else if (grade > 60) {
	System.out.println("Almost");
} else if (grade > 70) {
	System.out.println("Barley made it");
} else if(grade > 80) {
	System.out.println("Good job");
}
	
System.out.println("anyways, your grade is doubled, great job on scoring " + courseGrade(grade) + "%");

			
	}
 public static double averageThatArray(double[] x) {
	 double A = 0;
	 for (int i = 0; i < x.length; i++) {
		 A += x[i];
	 }
	 double avg = A / (x.length);
	return avg;
		 
 }
 public static boolean A(double[]z, double[]v) {
	 return(averageThatArray(z) > averageThatArray(v));
 }
 
 public static boolean willBuyDrink(boolean isHotOutSide, double moneyInPocket) {
	 return(isHotOutSide && moneyInPocket > 10.50);
	 
 }
 
 public static int courseGrade(int grade) {
	return grade * 2;
	 
}
}
