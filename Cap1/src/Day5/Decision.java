package Day5;

public class Decision 
{

	public static void main(String[] args) 
	{
		int x = 5,y=7;
          if(x != 5)
          {
        	  System.out.println("Value of x is not 5");
        	  
          }
          else
          {
          System.out.println("Value of x is 5");
          }
          if(x >= y)
          {
       	   System.out.println("true");
          }
          else
          {
       	   System.out.println("false");
          }
          int ageOfBoy = 36;
  		int ageOfGirl = 25;

  		if ((ageOfBoy >= 21) && (ageOfGirl >= 18)) 
  		{
  			System.out.println("ready to get married!");
  		} 
  		else 
  		{
  			System.out.println("Wait for it kiddo!");
  		}

	}
}
