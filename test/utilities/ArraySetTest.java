package utilities;

import static org.junit.jupiter.api.Assertions.*;
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
		
	}

	@Test
	void testRetainAll()
	{
		
	}

	@Test
	void testRemoveAll()
	{
		
	}

	@Test
	void testAddAllIntCollectionOfQextendsE()
	{
		
	}
}
