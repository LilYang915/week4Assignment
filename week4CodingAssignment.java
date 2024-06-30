
public class week4CodingAssignment {

	public static void main(String[] args) {
		
		int [] ages = new int [8];
				ages[0] = 3;
				ages[1] = 9;
				ages[2] = 23;
				ages[3] = 64;
				ages[4] = 2;
				ages[5] = 8;
				ages[6] = 28;
				ages[7] = 93;
			System.out.println("In the ages[], [firstIndex] - [lastIndex] =" + (ages[0] - (ages[ages.length - 1])));
			
			int sum = 0;
			for (int i = 0; i < ages.length; i++) {
			sum += ages[i];
			}
			
			System.out.println("Average age in ages[]" + " = " + (sum/ages.length));
			
			 
			int [] ages2 = new int [9];
			ages2[0] = 100;
			ages2[1] = 90;
			ages2[2] = 80;
			ages2[3] = 70;
			ages2[4] = 60;
			ages2[5] = 50;
			ages2[6] = 40;
			ages2[7] = 30;
			ages2[8] = 20;
		System.out.println("In the ages2[], [firstIndex] - [lastIndex] = " + (ages2[0] - (ages2[ages2.length - 1])));	
			
		int sum2 = 0;
			for (int i = 0; i < ages2.length; i++) {
			sum2 += ages2[i];
			
			int A2 = 0;
			A2 = (sum2/ages2.length); 
			
			}
			
			System.out.println("Average age in ages2[]" + " = " + (sum2/ages2.length));			
}		
}			
	
	
	
	
	
	
	
	
	
	
	
	

			
			
			
			
			



