package Day5;

public class AllLoop {

	public static void main(String[] args) 
	{

	  // for loop
	  for(int i=1,j=1; i<10||j<10;i++,j++)
	  { 
		  j++;
		  System.out.println("i="+i+" and j="+j); 
	  }


	  // while loop 
		  int i1=1,j1=1;
		  while(i1<10 || j1<10)
		  { 
			  i1++; j1++;
		      System.out.println("i="+i1+" and j="+j1); 
		  }	
		
	// Do while loop
		int i2 = 1, j2 = 1;
		do {
			i2++;
			j2++;
			System.out.println("i=" + i2 + " and j=" + j2);
		    } while (i2 < 10 || j2 < 10);
	}
}
