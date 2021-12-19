package learning;

import java.util.ArrayDeque;


public class SortingUsingArrayDequeue {
	
ArrayDeque<Integer> d = new ArrayDeque<>();


  int a[] = {10,6,87,45,17,4};


  for(int i=0 ;i<a.lenght;i++)
   {
	if(i==0)
	{
		d.add(a[0]);
		break;
	}
	else if(a[i]>peekFirst())
	{
		d.addFirst(a[i]);
		break;
	}
	else if(a[i]<peekLast())
	{
		d.addLast(a[i]);
		break;
	}
	
	}

}

}
