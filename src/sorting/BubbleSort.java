package sorting;

import java.util.Arrays;

public class BubbleSort {

	static void bubbleSort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp = a[j];
					a[j] = a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[] a = {20,12,10,15,2};
		BubbleSort.bubbleSort(a);
		System.out.println(Arrays.toString(a));

	}

}
