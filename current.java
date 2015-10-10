//testing varargs
public class current {
	public static void main(String[] params) {
		numbers(1, 2, 3);		
	}
	
	private static void numbers(int...nums) {
		System.out.println(nums.length);
		for (int number : nums) {
			System.out.println(number);
		}		
	}
}