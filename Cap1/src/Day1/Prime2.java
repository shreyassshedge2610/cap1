package Day1;

import java.util.*;

public class Prime2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a= sc.nextInt();
		int b=sc.nextInt();
		
		for(int i=a;i<=b;++i) {
			if (Primee(i))
				System.out.println(i);
		}
		
	}
	
	static boolean Primee (int n) 
	{
		
		if(n<2)
			return false;
		for (int i=2;i<n;++i) 
			if(n%i==0)
				return false;
			
		return true;
		
	}

}
