package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.* ;
import org.junit.jupiter.api.Test;

class ParallelArrayDictionaryTest
{
	@Test
	void testParallelArrayDictionary()
	{
		ParallelArrayDictionary<String, Integer> a = new ParallelArrayDictionary<String, Integer>();
		
		a.put("one", 1);
	
		assertEquals(1,a.size());
		
		a.put("one", 2);
		
		assertEquals(1,a.size());
		
	}

	@Test
	void testGet()
	{
		ParallelArrayDictionary<String, Integer> a = new ParallelArrayDictionary<String, Integer>();
		
		a.put("one", 1);
		
		assertEquals(1,a.get("one"));
		
		a.put("one", 5);
		
		assertEquals(5,a.get("one"));
		
		a.put("two", 5);
		
		assertEquals(5,a.get("two"));
		
	}

	@Test
	void testPut()
	{
		ParallelArrayDictionary<String, Integer> a = new ParallelArrayDictionary<String, Integer>();

		a.put("one", 1);
		
		assertEquals(1,a.get("one"));
		
		a.put("one", 5);
		
		assertEquals(5,a.get("one"));
		
		a.put("two", 5);
		
		assertEquals(5,a.get("two"));
	}

	@Test
	void testRemove()
	{
		ParallelArrayDictionary<String, Integer> a = new ParallelArrayDictionary<String, Integer>();

		a.put("one", 1);
		
		assertEquals(1,a.get("one"));
		
		a.put("one", 5);
		
		assertEquals(5,a.get("one"));
		
		a.put("two", 5);
		
		assertEquals(5,a.get("two"));
		
		a.remove("two");
		
	}

	@Test
	void testPutAll()
	{
	}

	@Test
	void testClear()
	{
	}
}
