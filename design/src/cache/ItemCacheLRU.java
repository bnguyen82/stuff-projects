package cache;

import java.util.Map;

import domain.cache.Item;

public class ItemCacheLRU implements ItemCache {
	private static final int MAX_CACHE = 50;
	private Map<String, Item> cache;
	public ItemCacheLRU() {
		cache = new CacheLRU(MAX_CACHE);
	}
	
	public void addItem(Item item){
		cache.put(item.getCode(), item);
	}
	
	public Item getItem(String code){
		return cache.get(code);
	}
}
