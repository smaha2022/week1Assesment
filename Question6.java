package zoho.test;

public class Question6 {

	 public static void print(Object...args) {
		  for (Object arg : args) {
		      System.out.print(arg + " ");
		    }
		    System.out.println();
		  }

		  public static void main(String[] args) {
		    print(); 
		    print("hello"); 
		    print("we","are","from","Zsgs");
		  }
		

	}


