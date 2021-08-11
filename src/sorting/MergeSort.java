package sorting;

import java.util.Arrays;

public class MergeSort {

	static void merge(int[] a, int l, int m, int r)
	{
		int n1 = m-l+1;
		int n2 = r-m;
		
		int L[] = new int[n1];
		int M[] = new int[n2];
		
		for(int i=0;i<n1;i++)
		{
			L[i] = a[l+i];
		}
		for(int i=0;i<n2;i++)
		{
			M[i] = a[m+1+i];
		}
		
		int i=0,j=0,k=l;
		
		while(i<n1 && j<n2)
		{
			if(L[i] <= M[j])
			{
				a[k] = L[i];
				i++;
			}
			else
			{
				a[k]=M[j];
				j++;
			}
			k++;
		}
		
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=M[j];
			j++;
			k++;
		}
		
	}
	static void divide(int[] a, int l, int r)
	{
		if(l<r)
		{
			int m = (l+r)/2;
			divide(a,l,m);
			divide(a,m+1,r);
			
			merge(a,l,m,r);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {20,12,10,15,2};
		MergeSort.divide(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
