package main;

public class ArrayExample {

	
	public static void main(String[] args) {
		
		//Array instantiation
		int[] nums = new int[3];
		
		nums[0] = 3;
		nums[1] = 4;
		nums[2] = 5;
		//nums[4] = 5;
		
		System.out.println(nums[2]);
		
		int[] nums2 = {2,3,4,5,10,10,1,3,4423};
		
		System.out.println(nums[2]);
		
		nums[2] = 100;
		
		System.out.println(nums[2]);
		
		
		for (int i = 0; i < nums2.length; i++) {
			System.out.println("Number is " + nums2[i]);
		}
		
		//Enhanced for loop, foreach loop
		
		for(int num: nums2) {
			System.out.println("Curent num is : " + num);
		}
		
		String[] names = new String[] {"ali","veli"};
		
		for (String name : names) {
			System.out.println(name);
		}
		
	}
	
	
}
