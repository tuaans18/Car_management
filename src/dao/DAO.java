package dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class DAO {
	public static Connection con;
	
	public DAO(){
		if(con == null){
			String dbUrl = "jdbc:mysql://localhost:3306/hoadon?autoReconnect=true&useSSL=false";

			try { 
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection (dbUrl, "root", "01679395761Aa");
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
	}
}
