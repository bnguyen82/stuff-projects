package cache;

import domain.cache.Item;

public interface ItemCache {
	
	
	public void addItem(Item item);
	
	public Item getItem(String code);
}
