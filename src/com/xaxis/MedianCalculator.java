package com.xaxis;

public class MedianCalculator {
	double median =0;
	/*static*/public double getMedianOfSortedArrays(int a[], int n, int b[], int m)
	{
		int min_index = 0, max_index = n, i = 0, j=0, median=0;
		while (min_index <= max_index)
		{
			i = (min_index + max_index) / 2;
			j = ((n + m + 1) / 2) - i;

			if (i < n && j > 0 && b[j - 1] > a[i])        
				min_index = i + 1;
			else if (i > 0 && j < m && b[j] < a[i - 1])        
				max_index = i - 1;
			else
			{
				if (i == 0)            
					median = b[j - 1];            

				else if (j == 0)            
					median = a[i - 1];            
				else           
					median = maximum(a[i - 1], b[j - 1]);            
				break;
			}
		}

		if ((n + m) % 2 == 1)
			return (double)median;
		if (i == n)
			return (median+b[j]) / 2.0;
		if (j == m)
			return (median + a[i]) / 2.0;
		return (median + minimum(a[i], b[j])) / 2.0;
	}

	static int maximum(int a, int b) 
	{
		return a > b ? a : b;
	}

	static int minimum(int a, int b) 
	{
		return a < b ? a : b; 
	}

	/*if want to open main, uncomment static block from above method
	 * public static void main (String[] args)
	{
		int ar1[] = {1,3};
		int ar2[] = {2};

		int n1 = ar1.length;
		int n2 = ar2.length;
		System.out.println(getMedianOfSortedArrays(ar1,n1, ar2, n2));
	} */

}
