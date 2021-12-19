package learning;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int a[] = {6,3,4,8,2,8,5};
	int n = a.length;
	boolean isSwap = true;
	for(int i= 0; i<n-1;i++)
		
	{
		for(int j=0;j<n-1;j++)
		{
			if(a[j+1]<a[j])
			{
				int temp= a[j+1];
				a[j+1]= a[j];
				a[j]= temp;
				isSwap = false;
			}
			
		}
		if(isSwap==true)break;
		
		
	}
	for(int item: a)
	{
		System.out.print
		(item+" ");
	}
	
	
	}

}
