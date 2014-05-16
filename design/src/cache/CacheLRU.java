package cache;

import java.util.LinkedHashMap;

import domain.cache.Item;

public class CacheLRU extends LinkedHashMap<String, Item> {
	private int capacity;

	public CacheLRU(int capacity) {
		super(capacity, 1.1f, true);
		this.capacity = capacity;
	}
	@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<String, Item> eldest) {
		return size() > capacity;
	}

}
