package cache;

import design.database.manager.DBManager;
import domain.cache.Item;

public class ItemManager {
	private ItemCache cache;
	private DBManager dbManager;
	public ItemManager(){
		cache = new ItemCacheUnlimited();
	}
	public void setDBManager(DBManager dbManager){
		this.dbManager = dbManager;
	}
	public Item findItem(String code){
		if (cache.getItem(code)!=null) {
			return cache.getItem(code);
		}
		else {
			Item item = dbManager.find(code);
			cache.addItem(item);
			return item;
		}
			
	}
//	public Item findItem(String code){
//			Item item = dbManager.find(code);
//			cache.addItem(item);
//			return item;
//		
//	}
}
