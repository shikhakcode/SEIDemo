
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

import com.demo.DeDup;

public class DeDupTest{
	
	public DeDup obj = new DeDup(); 	
    public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,
            4,9,3,20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
            13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

	@Test
    public void testEliminateArrayDuplicates() throws Exception {		
	 
	    int[] result = obj.eliminateArrayDuplicates(randomIntegers);
	    System.out.print( "Result array1 size: ");
	    if(result != null){
	    	System.out.println(result.length);
	    	
	    	// iterate to return unique values
		    for (Integer value : result) {
		        if (value != null) {
		            System.out.print( value+",");
		        }
		    }
	    }
	    
	    assertNotNull(result);
    }
	
	@Test
    public void testRemoveArrayDuplicates() throws Exception {

	    int[] result = obj.removeArrayDuplicates(randomIntegers);	
	    System.out.println( "Result array2 size: ");
	    if(result != null){
	    	System.out.println(result.length);
	    	
	    	// iterate to return unique values
		    for (Integer value : result) {
		        if (value != null) {
		            System.out.print( value+",");
		        }
		    }
	    }
	    
	    assertNotNull(result);
    }
	
	@Test
    public void testEliminateDuplicates() throws Exception {
	 
	    int[] result = obj.eliminateDuplicates(randomIntegers);
	    System.out.println( "Result array3 size: ");
	    if(result != null){
	    	System.out.println(result.length);
	    	
	    	// iterate to return unique values
		    for (Integer value : result) {
		        if (value != null) {
		            System.out.print( value+",");
		        }
		    }
	    }
	    
	    assertNotNull(result);
    }

}