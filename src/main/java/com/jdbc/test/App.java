package com.jdbc.test;

import java.sql.Connection;

import com.jdbc.config.Config;

public class App {

	public static void main(String[] args) {
		Config config = Config.getInstance();
		
		Connection connection = config.getConnection();
		
		if(connection != null) 
			System.out.println(" Connection established");
		else
			System.out.println(" Connection failed");
	}
}
