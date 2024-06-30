

public class Week4CodingAssignment2 {

	public static void main(String[] args) {

		String [] names = new String[6];
		
		names[0] = "Sam";
		names[1] = "Tommy";
		names[2] = "Tim";
		names[3] = "Sally";
		names[4] = "Buck";
		names[5] = "Bob";
	
		int SumOflettersInNames = 0;
		for (int i = 0; i < names.length; i++) {
			SumOflettersInNames += names[i].length(); 
		}
		
		String nameSum = "";
		for (String name : names) {
			
			//System.out.println(String.concat(name));
			nameSum += name + " ";
			}
		System.out.println(nameSum);				
		System.out.println(SumOflettersInNames / names.length);	
		System.out.println(names[0]);
		System.out.println(names[names.length -1]);		
		
		//5 ???????
		//6 ???????
		
	
}	
	
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	

