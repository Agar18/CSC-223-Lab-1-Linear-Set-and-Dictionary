package utilities;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.* ;
import org.junit.jupiter.api.Test;

class ArraySetTest
{
	@Test
	void testArraySetCollectionOfE()
	{
		
	}

	@Test
	void testAddE()
	{
		ArraySet <Integer> a = new ArraySet <Integer>();
		
		a.add(5);
		a.add(2);
		a.add(1);
		a.add(3);
		
		assertEquals(4,a.size());
		
		//assertEquals(12, a.toArray());
		
		ArraySet <Integer> b = new ArraySet <Integer>();
		
		assertEquals(0,b.size());
		
		
		
		
	}

	@Test
	void testAddAllCollectionOfQextendsE()
	{
		ArraySet <Integer> a = new ArraySet <Integer>();
		ArraySet <Integer> b = new ArraySet <Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
	
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		a.addAll(b);
		
		assertEquals(8,a.size());
		
		//assertEquals([1, 2, 3, 4, 5, 6, 7, 8], a.toArray());
		
		ArraySet <Integer> c = new ArraySet <Integer>();
		
		c.addAll(b);
		
		assertEquals(4,b.size());
		
	}

	@Test
	void testRetainAll()
	{
		ArraySet <Integer> a = new ArraySet <Integer>();
		ArraySet <Integer> b = new ArraySet <Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
	
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		a.retainAll(a);
		
		assertEquals(4,a.size());
		
	}

	@Test
	void testRemoveAll()
	{
		ArraySet <Integer> a = new ArraySet <Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		a.removeAll(a);
		
		assertEquals(0,a.size());
		
		ArraySet <Integer> b = new ArraySet <Integer>();
		
		b.removeAll(b);
		
		assertEquals(0,a.size());
		
		
	}

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
		ArraySet <Integer> a = new ArraySet <Integer>();
		ArraySet <Integer> b = new ArraySet <Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		a.addAll(b);
		
		assertTrue("[1, 2, 3, 4, 5, 6, 7, 8]", a.addAll(b));
		
		
		
		
	}
	
	@Test
	void removeAll()
	{
		ArraySet <Integer> a = new ArraySet <Integer>();
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		a.removeAll(a);
		
		assertEquals(0,a.size());
		
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		ArraySet <Integer> b = new ArraySet <Integer>();
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		a.addAll(b);
		
		assertEquals(8,a.size());
		
		a.removeAll(b);
		
		assertEquals(4,a.size());
		
		
	}
}
