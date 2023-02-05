package zoho.test;

public class SnakeMatrix {

	public static void main(String[] args) {
		 int n = 4,m = 1 ,x=0,space=4;
		    for (int i=0;i<n/2;i++) {
		    	 for(int l=0;l<space;l++)
		           {
		        	 System.out.print("  ");
		        	 
		           }
		    	   space--;
		           m=x+1;
		    	
		           for(int k=0;k<n;k++)
		           {
		        	 System.out.print(m+++" ");  
		           }
		           m=(m-1);
		           m=m+n;
		           x=m;
		        System.out.println();
		        for(int l=0;l<space;l++)
		           {
		        	 System.out.print("  ");
		        	 
		           }
		    	 space--;
		        for(int k=0;k<n;k++)
		           {
		        	 System.out.print(m--+" ");  
		           }
		        m=x+1;
		        System.out.println();
		      
		    }
		  
				
		  }
		
		     
		    
		  
		  }

