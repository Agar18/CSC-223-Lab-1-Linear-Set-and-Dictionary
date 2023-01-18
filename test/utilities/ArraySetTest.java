package utilities;

import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.* ;
import org.junit.jupiter.api.Test;

class ArraySetTest
{

	@Test
	void testAddE()
	{
		ArraySet <Integer> a = new ArraySet <Integer>();
		
		a.add(5);
		a.add(2);
		a.add(1);
		a.add(3);
		
		assertEquals(4,a.size());
		
		assertEquals("[5, 2, 1, 3]", a._list.toString());
		
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
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]", a._list.toString());
		
		ArraySet <Integer> c = new ArraySet <Integer>();
		
		c.addAll(b);
		
		assertEquals(4,b.size());
		
		assertEquals("[5, 6, 7, 8]", c._list.toString());
		
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
		
		a.addAll(b);
		
		a.retainAll(b);
		
		assertEquals(4,a.size());
		
		assertEquals("[5, 6, 7, 8]",a._list.toString());
		
		ArraySet <Integer> c = new ArraySet <Integer>();
		
		c.addAll(a);
		
		c.retainAll(a);
		
		assertEquals("[5, 6, 7, 8]",c._list.toString());
		
		
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
		
		a.add(1);
		a.add(2);
		a.add(3);
		a.add(4);
		
		b.add(5);
		b.add(6);
		b.add(7);
		b.add(8);
		
		a.addAll(b);
		
		a.removeAll(b);
		
		assertEquals("[1, 2, 3, 4]",a._list.toString());
		
		
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
		
		a.addAll(3, b);
		
		assertEquals("[1, 2, 3, 5, 6, 7, 8, 4]", a._list.toString());
		
		ArraySet <Integer> c = new ArraySet <Integer>();
		
		c.addAll(0, b);
		
		assertEquals("[5, 6, 7, 8]", c._list.toString());
		
		
		
		
		
		
		
		
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
		
		assertTrue(a.isEmpty());
		
		
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
		
		assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]",a._list.toString());

		
		a.removeAll(b);
		
		assertEquals(4,a.size());
		
		assertEquals("[1, 2, 3, 4]",a._list.toString());
	}
	
	@Test
	void Sublist() 
	{
		
	ArraySet <Integer> a = new ArraySet <Integer>();
	
	a.add(1);
	a.add(2);
	a.add(3);
	a.add(4);
	a.add(5);
	
	assertEquals("[1, 2, 3]",a.subList(0, 3).toString());
	
	ArraySet <Integer> b = new ArraySet <Integer>();
	
	b.add(6);
	b.add(7);
	b.add(8);
	b.add(9);
	b.add(10);
	
	a.addAll(b);
	
	assertEquals("[1, 2, 3, 4, 5, 6, 7, 8]",a.subList(0, 8).toString());
	
	assertEquals("[]",a.subList(0, 0).toString());


	
	
}
}
