package test;

import static org.junit.jupiter.api.Assertions.*;
import static org.testng.Assert.assertEquals;

import java.util.Arrays;

import org.junit.jupiter.api.Test;

import com.xaxis.ArrayAddition;
import com.xaxis.MedianCalculator;
import com.xaxis.Uniquesubstring;

class TestAllAssignmentsWithJUnit {

	@Test
	public void testArrayAddition() {
		ArrayAddition arrayAddition= new ArrayAddition();
		int[] arrayInt = {2, 7, 11, 15};
		int target = 9;
		int[] arrayExpected = {2, 7};
		
		assertEquals(arrayAddition.targetTwoSum(arrayInt, target),arrayExpected);
		System.out.println(Arrays.toString(arrayAddition.targetTwoSum(arrayInt, target)));
	}

	@Test
	public void testMedianCalculator() {
		MedianCalculator medianCalculator= new MedianCalculator();
		int ar1[] = {1,3};
		int ar2[] = {2};

		int n1 = ar1.length;
		int n2 = ar2.length;
		double expectedValue = 2.0;
		
		assertEquals(medianCalculator.getMedianOfSortedArrays(ar1,n1,ar2,n2),expectedValue);
		System.out.println(medianCalculator.getMedianOfSortedArrays(ar1,n1,ar2,n2));
	}

	@Test
	public void testUniquesubstring() {
		Uniquesubstring uniquesubstring= new Uniquesubstring();
		String targetString = "abcbbbb";
		int expectedValue = 3;
		
		assertEquals(uniquesubstring.longestSubstringss(targetString),expectedValue);
		System.out.println(uniquesubstring.longestSubstringss(targetString));
	}

}
