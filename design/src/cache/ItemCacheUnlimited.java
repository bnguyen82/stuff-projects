package cache;

import java.util.HashMap;
import java.util.Map;

import domain.cache.Item;

public class ItemCacheUnlimited implements ItemCache {

	private static final int MAX_CACHE = 50;
	private Map<String, Item> cache;
	public ItemCacheUnlimited() {
		cache = new HashMap<String, Item>();
	}
	
	public void addItem(Item item){
		cache.put(item.getCode(), item);
	}
	
	public Item getItem(String code){
		return cache.get(code);
	}

}
