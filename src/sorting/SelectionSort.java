package sorting;

import java.util.Arrays;

public class SelectionSort {

	static void selectionSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min = i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[min])
				{
					min = j;
				}
			}
			// swapping
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;
		}
		
	}
	public static void main(String[] args) {
		
		int[] a = {20,12,10,15,2};
		int[] b = {41,29,52,25,36};
		SelectionSort.selectionSort(a);
		SelectionSort.selectionSort(b);
		
		System.out.println(Arrays.toString(a));
		System.out.println(Arrays.toString(b));
		
	}

}
