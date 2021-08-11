package sorting;

import java.util.Arrays;

public class InsertionSort {

	static void insertionSort(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int ele = a[i];
			int index= i-1;
			
			while(index>=0 && ele<a[index])
			{
				a[index+1] = a[index];
				index--;
			}
			a[index+1]=ele;
		}
	}
		
	public static void main(String[] args) {
		int[] a = {20,12,10,15,2};
		InsertionSort.insertionSort(a);
		System.out.println(Arrays.toString(a));

	}

}
