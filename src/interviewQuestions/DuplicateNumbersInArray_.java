package interviewQuestions;

public class DuplicateNumbersInArray_ {
	public static void main(String[] args) {

		int[] nums = { 1, 2, 3, 1, 5, 6, 3, 4, 4 };

		String dublicatedNumbers = "";
		int count = 0;

		for (int i = 0; i < nums.length; i++) {
			for (int j = 0; j < nums.length; j++) {
				if (nums[i] == nums[j]) {
					count++;
				}
			}
			if (count >= 2 && !dublicatedNumbers.contains(nums[i] + ""))
				dublicatedNumbers += nums[i] + " ";
			count = 0;
		}

		System.out.println("Dublicated numbers are: " + dublicatedNumbers);

	}

}
