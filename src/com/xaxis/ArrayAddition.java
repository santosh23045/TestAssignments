package com.xaxis;

public class ArrayAddition {
	 /*static*/public int[] targetTwoSum(int[] nums, int target) {
		int []resultarray=new int[2];
		for (int i=0;i<nums.length-1;i++){
			for(int k=1;k<nums.length;k++)
			{
				if(target==nums[i]+nums[k])
				{
					resultarray[0]=nums[i];
					resultarray[1]=nums[k];
				}
			}
		}
		return resultarray;
	}
	 /*if want to open main, uncomment static block from above method
	*public static void main(String[] args) {
		int[] arrayInt = {2, 7, 11, 15};
		int target = 9;
		System.out.println(Arrays.toString(targetTwoSum(arrayInt, target)));
	}*/
}
