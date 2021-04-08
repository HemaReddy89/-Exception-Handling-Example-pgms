
public class NestedTryCatchBlockExceptionNotHandled {

	public static void main(String[] args) {
		
		 // Outer try-catch block
        try {
 
            System.out.println("Outer try-catch block");
 
            // nested inside finally block
            try {
                // Inner try-catch block
 
                String str = null;
                System.out.println("Lenght of string is : "
                        + str.length());
            }
            catch(NumberFormatException nfex) {
                System.out.println(nfex.toString()); // there is no corresponding catch-block 
            }
          }  
        catch(NullPointerException npex) {
            System.out.println(npex.toString());
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
        finally {
            // finally block always gets executed
            System.out.println("finally block"
                    + " always gets executed");
        }
	}

}
