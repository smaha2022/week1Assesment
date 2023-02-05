package zoho.test;
import java.util.Scanner;


public class quetion4 {
	
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 
	 String s1  =sc.nextLine();
	 String s2 = sc.nextLine();
	 for(int i=0;i<s1.length();i++)
	 {
		 for(int j=0;j<s2.length();j++) 
		 {
			 int offset=(int)s2.charAt(j)-(int)'a'+1;
			 System.out.print((char)('a' + (s1.charAt(i)-'a' + offset )%26));
			 i++;
	        }
	        
        }
	}

}
