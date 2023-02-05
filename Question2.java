package zoho.test;

import java.util.Scanner;

public class Question2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter array size");
		int n=sc.nextInt();
		System.out.println("enter"+n +"digit array elements");
        int a[]=new int[n];
        for (int i=0;i<n;i++) {
        	a[i]=sc.nextInt();
        	 }
        System.out.println("enter x value:");
        int x=sc.nextInt();
        System.out.println("enter y value:");
        int y=sc.nextInt();
        for (int i=0;i<a.length;i++) {
        	for (int j=x+1;j<y;j++) {
         if(a[i]==j) {
    	  System.out.println("output:"+a[i]);
      }
    	  
      }
	}


}
	}