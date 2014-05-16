package design.database.manager;

import domain.cache.Item;


public interface DBManager {
	Item find(String code);
}
