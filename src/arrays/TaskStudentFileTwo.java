package arrays;

public class TaskStudentFileTwo {
	

	
	public static int [] extractNum(String name) {
	int count = 0;
	for (int i = 0; i < name.length(); i++) {
		if(47 < name.charAt(i) && name.charAt(i) < 58) {
			count++;
		}
	}
	
	int [] nums = new int[count];
	int countNums = 0;
	for (int j = 0; j < name.length(); j++) {
		if(47 < name.charAt(j) && name.charAt(j) < 58) {
			
			nums[countNums] = Integer.parseInt(name.charAt(j) + "");;
			countNums++;
		}
	}
	return nums;	
		
	}

	
}
