package Day1;

import java.util.*;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		for (int i = 1;i<=10;++i) {
			System.out.printf("%d * %d = %d\n",num,i,num*i);
			
		}

	}

}
