package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
* This class creates a ParallelArrayDictionary from the previous ArraySet class for keys and an ArrayList of values. This class
* also implements a map to help with this.
*
* <p>Bugs: (RemoveMethod)
*
* @author <Alex Gardner, Khalid Ismael>
* @date <1/18/2023>
*/

public class ParallelArrayDictionary<Key, Value> implements Map<Key,Value>
{

	
		protected ArraySet<Key> _keys;
		protected ArrayList<Value> _values;
		
		public ParallelArrayDictionary()
		{
			this (new ArraySet <Key>(), new ArrayList <Value>());
		}
		
		public ParallelArrayDictionary(ArraySet<Key> keys, ArrayList<Value> values)
		{
			_keys = keys;
			_values = values;
		}

	@Override
	public int size() {return _keys.size();
	}
	@Override
	public boolean isEmpty() {
		return _keys.isEmpty();
	}

	@Override
	public boolean containsKey(Object key) {
		return _keys.contains(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return _values.contains(value);
	}

	@Override
	public Value get(Object key) {
		return _values.get(_keys.indexOf(key));
	}

	@Override
	public Value put(Key key, Value value) {
		if(_keys.contains(key))
		{
	
			_values.set(_keys.indexOf(key),value);		
		}
		
		else
		{
			_keys.add(key);
			_values.add(value);
		}
		
		return _values.get(_keys.indexOf(key));
		
	}

	@Override
	public Value remove(Object key) {
		return _values.remove(_keys.indexOf(key));
		
	}

	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		//loop through the map to get key and value saperately
		for(Entry<? extends Key, ? extends Value> entry : m.entrySet()) {
			//put keys and values to their arraysets
			put(entry.getKey(), entry.getValue());
		}
		
	}
	
	@Override
	public void clear() {
		_keys.clear();
		_values.clear();
		
	}

	@Override
	public Set<Key> keySet() {
		//new Arrayset to store the keys
		ArraySet<Key> newKeys = new ArraySet<Key>();
		//loop through the keys
		for(int i = 0; i< _keys.size()-1; i++) {
			//add the keys to the new arrayset newKeys
			newKeys.add(_keys.get(i));
		}
		return newKeys;
	}

	@Override
	public Collection<Value> values() {
		//new Arrayset to store the values
		ArraySet<Value> newValue = new ArraySet<Value>();
		//loop through the values 
		for(int i = 0; i< _values.size()-1; i++) {
			//add the values to the new arrayset newValue
			newValue.add(_values.get(i));
		}
		return newValue;
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {
		//create java hash_map set to store the keys and values
		HashMap<Key, Value> hash_map = new HashMap<Key, Value>();
		//loop through the set to get index of the arrayset
		for(int i = 0; i<= _values.size()-1; i++) {
			//store both the keys and the value to the hash_map
			hash_map.put(_keys.get(i), _values.get(i));
		}
		//return the entrySet of hash_map
		return hash_map.entrySet();
	}

}
