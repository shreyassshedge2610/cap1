package Day1;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		
		for (int i =a;i<=b;++i) {
			String c= null;
			if (i<=1)
				continue;
			if (i==2) {
				System.out.println(i);
				continue;}
			for (int i2=2;i2<i;++i2) {
				if (i%i2==0) {
					 c= "False";
					break;	
				}	else {
					 c= "True";
//					System.out.println(i);
//					System.out.println("hiirrr");
					}
			}
			if (c=="True")
				System.out.println(i);
		}

	}

}
