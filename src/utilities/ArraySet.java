package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.Spliterator;

/**
* This class creates an ArraySet of values which will be used in the ParallelArrayDictionary implementation.
*
* <p>Bugs: (None found)
*
* @author <Alex Gardner, Khalid Ismael>
* @date <1/18/2023>
*/

public class ArraySet<E> implements List<E>, Set<E>
{
	protected ArrayList<E> _list;
	
	public ArraySet()
	{
		this(new ArrayList <E>());
	}

	public ArraySet(ArrayList<E> list) 
	{
		_list = list;
	}

	@Override
	public int size() {return _list.size();}

	@Override
	public boolean isEmpty() {return _list.isEmpty();}

	@Override
	public boolean contains(Object o) {return indexOf(o)!= -1;}

	@Override
	public Iterator<E> iterator() {
		return _list.iterator();
	}

	@Override
	public Object[] toArray() {
		return _list.toArray();
	}

	@Override
	public <T> T[] toArray(T[] a) {
		return _list.toArray(a);
	}

	@Override
	public boolean add(E e) 
	{
			//check if the element already exist
			if (this.contains(e))
				return false;
			int count = 0;
			while(count < _list.size() && !(_list.get(count).equals(e))) {
				count++;
			}
			
			_list.add(count, e);
			return true;
	}

	@Override
	public boolean remove(Object o) {
		return _list.remove(o);
	}

	@Override
	public boolean containsAll(Collection<?> c) {
		return _list.containsAll(c);
	}

	@Override
	public boolean addAll(Collection<? extends E> c) {
		return _list.addAll(c);
	}

	@Override
	public boolean addAll(int index, Collection<? extends E> c) {
		return _list.addAll(index, c);
	}

	@Override
	public boolean removeAll(Collection<?> c) {
		return _list.removeAll(c);
	}

	@Override
	public boolean retainAll(Collection<?> c) {
		return _list.retainAll(c);
	}

	@Override
	public void clear() {
		_list.clear();
	}

	@Override
	public E get(int index) {return _list.get(index);}

	@Override
	public E set(int index, E element) {
		return _list.set(index, element);
	}

	@Override
	public void add(int index, E element) {
		_list.add(index, element);
	}

	@Override
	public E remove(int index) {
		return _list.remove(index);
	}

	@Override
	public int indexOf(Object o) {return _list.indexOf(o);}

	@Override
	public int lastIndexOf(Object o) {
		return _list.lastIndexOf(o);
	}

	@Override
	public ListIterator<E> listIterator() {
		return _list.listIterator();
	}

	@Override
	public ListIterator<E> listIterator(int index) {
		return _list.listIterator(index);
	}

	@Override
	public List<E> subList(int fromIndex, int toIndex) {
		return _list.subList(fromIndex, toIndex);
	}

	@Override
	public Spliterator<E> spliterator() {
		return _list.spliterator();
	}

}
