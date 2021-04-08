
public class ExceptionMessagesPgm {

	public static void main(String[] args) {
		// Following are the different ways to handle exception messages in Java.
		
		 try {
	         int a = 0;
	         int b = 10;
	         int result = b/a;
	         System.out.println(result);

	      } catch(Exception e) {
	         System.out.println("toString(): " + e.toString());  //prints name and description of the exception.
	         System.out.println("getMessage(): " + e.getMessage()); // prints the description of the exception.
	         System.out.println("StackTrace: ");  
	         e.printStackTrace(); //prints name, description, complete stack trace including the line where exception occurred.
	      }

	}

}
