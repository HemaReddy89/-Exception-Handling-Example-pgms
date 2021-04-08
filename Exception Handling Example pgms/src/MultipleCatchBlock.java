
public class MultipleCatchBlock {

	public static void main(String[] args) {
		
	    try{    
            String s=null;  
            System.out.println(s.length());  //Null Pointer Exception is not handled here
           }    
           catch(ArithmeticException e)  
              {  
               System.out.println("Arithmetic Exception occurs");  
              }    
           catch(ArrayIndexOutOfBoundsException e)  
              {  
               System.out.println("ArrayIndexOutOfBounds Exception occurs");  
              }    
           catch(Exception e)  
              {  
               System.out.println("Parent Exception occurs");  
              }             
           System.out.println("rest of the code");  
           
           
           
           
//           catch(Exception e){System.out.println("common task completed");}    
//	      catch(ArithmeticException ae){System.out.println("task1 is completed");}    
//	    catch(ArrayIndexOutOfBoundsException aioe){System.out.println("task 2 completed");}    
          
           
}  

	}


