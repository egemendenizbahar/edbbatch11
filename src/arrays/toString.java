package arrays;



public class toString {
	
//			TASK
//	1.Write a program ToString. 
//	2.Declare and assign 23,23,34,56,342,23.
//	Write a program that prints out same as toString format.
//	Flow: [23,23,34,45,342,2]
	
	public static void main(String[] args) {
		
		int[] nums = {23,23,34,56,342,2};
		String result = "[";
		
		for(int i=0; i < nums.length; i++) { 
			if(i==nums.length-1) {
				result += nums[i] + "]";						
			}else {
				result += nums[i] + ", ";
			}
		} 
	
	System.out.println(result);

}
}
			
	