
public class CatchingMultipleException {

	public static void main(String[] args) {
	    	try {
			 
		    // divide by Zero(Arithmetic exception)
		    int result = 19/0;
		    System.out.println(result);
		    
		    // checking length on NULL String(null pointer exception )
		    String str = null;
		    System.out.println("Lenght of the String : "
                    + str.length());
 
		    
		    // trying to assign a integer value at 10th place for a int[] of 5
			int a[]=new int[5];  
			a[10]=50; //ArrayIndexOutOfBoundsException  
			
			//NumberFormatException
			String s = "India";
			int i = Integer.parseInt(s);
			System.out.println("Converted integer : " + i);
			
	    	}
	 
	    	catch (NullPointerException|ArrayIndexOutOfBoundsException|NumberFormatException|ArithmeticException ex) {
	    	  
	    		 System.out.println("Exception :" + ex.getMessage());
	    	  
	    	}

	}

}
