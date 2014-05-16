package cache;

import design.database.manager.DBManager;
import design.database.mysql.MySQLManager;
import domain.cache.Item;

public class ClientTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DBManager dbManager = new MySQLManager();
		ItemManager manager = new ItemManager();
		manager.setDBManager(dbManager);
		System.out.println(System.currentTimeMillis());
//		Item item1 = manager.findItem("jn111");
//		Item item2 = manager.findItem("jn222");
//		Item item3 = manager.findItem("jn111");
//		Item item4 = manager.findItem("st322");
		for (int i=1; i< 101; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=51; i< 101; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=102; i< 202; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=152; i< 202; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=200; i< 301; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=251; i< 301; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=300; i< 401; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=351; i< 401; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=400; i< 501; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=451; i< 501; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=500; i< 601; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=551; i< 601; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=600; i< 701; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=651; i< 701; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=700; i< 801; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=751; i< 801; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=800; i< 901; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=851; i< 901; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=900; i< 1001; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		for (int i=951; i< 1063; i++){
			String itemCode = "j" + i;
			manager.findItem(itemCode);
		}
		
		System.out.println(System.currentTimeMillis());
		
	}

}
