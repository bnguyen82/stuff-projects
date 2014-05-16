package design.database.mysql;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;


import design.database.manager.DBManager;
import domain.cache.Item;
import domain.cache.impl.Clothe;

public class MySQLManager implements DBManager {
	private String dbURL;
	private String userName;
	private String password;
	Connection con;
	public MySQLManager() {
		dbURL="jdbc:mysql://localhost:3306/design";
		userName="root";
		password="123";
	}
	
	@Override
	public Item find(String code) {
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			con = DriverManager.getConnection(dbURL, userName, password);
			PreparedStatement state = con.prepareStatement("select * from clothe where code = ?");
			state.setString(1, code);
			state.execute();
			ResultSet result = state.getResultSet();
			Item item = new Clothe();
			while (result.next()){
				item.setId(result.getInt(1));
				item.setCode(result.getString(2));
				item.setName(result.getString(3));
				item.setPrice(result.getString(4));
				item.setProvider(result.getString(5));
				item.setCountry(result.getString(6));
			}
			return item;
		}
		catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		finally{
			if (con!=null){
				try {
					con.close();
				}
				catch (Exception e) {
					// TODO: handle exception
				}
			}
		}
	}

}
