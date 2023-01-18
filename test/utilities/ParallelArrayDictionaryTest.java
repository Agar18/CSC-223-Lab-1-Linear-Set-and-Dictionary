package utilities;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.* ;
import org.junit.jupiter.api.Test;

class ParallelArrayDictionaryTest
{
	@Test
	void testParallelArrayDictionary()
	{
		//test one
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
		ParallelArrayDictionary<String, Integer> a = new ParallelArrayDictionary<String, Integer>();
		a.put("Khalid", 100);
		a.put("James", 200);
		a.put("John", 300);
		a.put("Jack", 400);
		ParallelArrayDictionary<String, Integer> a2 = new ParallelArrayDictionary<String, Integer>();
		a2.putAll(a);
		assertEquals(a.size(), a2.size());
		assertEquals(a.get("Jack"), a2.get("Jack"));
		
		//Test Two
		ParallelArrayDictionary<String, Integer> b = new ParallelArrayDictionary<String, Integer>();
		b.put("Apple", 2);
		b.put("Banana", 1);
		b.put("Orange", 3);
		b.put("Mango", 5);
		ParallelArrayDictionary<String, Integer> b2 = new ParallelArrayDictionary<String, Integer>();
		b2.putAll(b);
		assertEquals(b.size(), b2.size());
		assertEquals(b.get("Banana"), b2.get("Banana"));
		
		//Test Three
		ParallelArrayDictionary<String, String> c = new ParallelArrayDictionary<String, String>();
		c.put("Asia", "first");
		c.put("Africa", "Second");
		c.put("North America", "Third");
		ParallelArrayDictionary<String, String> c2 = new ParallelArrayDictionary<String, String>();
		c2.putAll(c);
		assertEquals(c.size(), c2.size());
		assertEquals(c.get("Asia"), c2.get("Asia"));
		

	}

	@Test
	void testClear()
	{
		ParallelArrayDictionary<String, Integer> a = new ParallelArrayDictionary<String, Integer>();
		a.put("Khalid", 100);
		a.put("James", 200);
		a.put("John", 300);
		a.put("Jack", 400);
		assertEquals(4,a.size());
		a.clear();
		assertEquals(0,a.size());
		
		//Test Two
		ParallelArrayDictionary<String, String> b = new ParallelArrayDictionary<String, String>();
		b.put("Johson", "Wall");
		b.put("James", "Harden");
		b.put("John", "Watson");
		b.put("Jack", "Reager");
		assertEquals(4,b.size());
		b.clear();
		assertEquals(0,b.size());
		
		//Test Three
		ParallelArrayDictionary<String, Integer> c = new ParallelArrayDictionary<String, Integer>();
		c.put("A", 100);
		c.put("B", 80);
		c.put("C", 70);
		c.put("D", 60);
		assertEquals(4,c.size());
		c.clear();
		assertEquals(0,c.size());
	}
}
