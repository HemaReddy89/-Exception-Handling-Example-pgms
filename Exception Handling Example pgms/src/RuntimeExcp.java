
public class RuntimeExcp {

	public static void main(String[] args) {
		
  
		try {
			 
		    // divide by Zero(Arithmetic exception)
		    int result = 19/0;
		    System.out.println(result);
		    
		}
		catch(ArithmeticException aex) {
			
	    System.out.println("ArithmeticException :" + aex.getMessage());
		}
		
     	
		
		 finally {
	            // finally block always gets executed
	            // for code clean-up activities
	 
	            System.out.println("finally block always gets executed");
	            
	        }
		
	}
	

}
