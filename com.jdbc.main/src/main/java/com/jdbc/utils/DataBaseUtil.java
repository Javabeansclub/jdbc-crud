package com.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataBaseUtil {
	private static final String DRIVER_PATH="com.mysql.cj.jdbc.Driver";
	private static final String DataBase_URL="jdbc:mysql://localhost:3306/demoemp";
	private static final String USER ="root";
	private static final String PSWD ="root123";
	public DataBaseUtil() {
		try {
			Class.forName(DRIVER_PATH);
		}catch(Exception e) {
			throw new RuntimeException("Something went wrong");
		}//catch
	}//endofconst
	public Connection getConnection()
			throws SQLException{
		return DriverManager.getConnection(DataBase_URL,USER,PSWD);
		
	}

}
