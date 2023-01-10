package utilities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

public class ParallelArrayDictionary<Key, Value> implements Map<Key,Value>
{

	
		protected ArraySet<Key> _keys;
		protected ArrayList<Value> _values;

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
		_values.add(_keys.indexOf(key), value);
		return _values.get(_keys.indexOf(key));
	}

	@Override
	public Value remove(Object key) {
		return _values.remove(_keys.indexOf(key));
	}

	@Override
	public void putAll(Map<? extends Key, ? extends Value> m) {
		for(Entry<? extends Key, ? extends Value> entry : m.entrySet()) {
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Collection<Value> values() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Entry<Key, Value>> entrySet() {
		// TODO Auto-generated method stub
		return null;
	}

}
