
import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

import com.demo.DeDup;

public class DeDupTest{

	public DeDup obj = new DeDup();

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34,
			86, 25, 43, 2, 1, 10000, 11, 16, 19, 1, 18, 4, 9, 3, 20, 17, 8, 15,
			6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17,
			16, 3, 6, 19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17,
			10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public int[] orderedIntegers = { 1, 2, 34, 25, 45, 3, 26, 85, 4, 86, 43, 10000,
			11, 16, 19, 18, 9, 20, 17, 8, 15, 6, 5, 10, 14, 12, 13, 7 };
	
	public int[] unorderedIntegers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12,
			13, 14, 15, 85, 17, 16, 19, 86, 18, 20, 25, 26, 34, 43, 10000, 45 };

	@Test
	public void testEliminateArrayDuplicates() throws Exception {

		int[] result = obj.eliminateArrayDuplicates(randomIntegers);
		assertArrayEquals(orderedIntegers, result);
	}

	@Test
	public void testRemoveArrayDuplicates() throws Exception {

		int[] result = obj.removeArrayDuplicates(randomIntegers);
		assertArrayEquals(orderedIntegers, result);
	}

	@Test
	public void testEliminateDuplicates() throws Exception {

		int[] result = obj.eliminateDuplicates(randomIntegers);
		assertArrayEquals(unorderedIntegers, result);
	}

}