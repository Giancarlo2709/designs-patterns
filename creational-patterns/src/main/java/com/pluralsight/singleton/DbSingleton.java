package com.pluralsight.singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Objects;

public class DbSingleton {
	
	private static volatile DbSingleton instance = null;
	private static volatile Connection conn = null;
	
	private DbSingleton() {
		
		try {
			DriverManager.registerDriver(new org.apache.derby.jdbc.EmbeddedDriver());
		} catch(SQLException e) {
			e.printStackTrace();
		}
		
		if(Objects.nonNull(conn)) {
			throw new RuntimeException("Use getConnection() method to create");
		}
		
		if(Objects.nonNull(instance)) {
			throw new RuntimeException("Use getInstance() method to create");
		}
	}
	
	public static DbSingleton getInstance() {
		if(Objects.isNull(instance)) {
			synchronized (DbSingleton.class) {
				if(Objects.isNull(instance)) {
					instance = new DbSingleton();
				}
			}			
		}
		
		return instance;
	}
	
	public static Connection getConnection() {
		if(Objects.isNull(conn)) {
			synchronized (DbSingleton.class) {
				if(Objects.isNull(conn)) {
					try {
						String dbUrl = "jdbc:derby:memory:codejava/webdb;create=true";
						conn = DriverManager.getConnection(dbUrl);
					} catch(SQLException e) {
						e.printStackTrace();
					}
				}
			}
		}
		
		return conn;
	}

}
