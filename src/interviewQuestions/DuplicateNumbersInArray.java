package interviewQuestions;

public class DuplicateNumbersInArray {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 1, 5, 6, 3 };

		int count = 1;

		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					System.out.println("Dublicated number " + count + " is: " + nums[i]);
					count++;
				}
			}

		}

	}

}
