package com.jdbc.test;

import static org.junit.Assert.assertEquals;

import java.sql.Connection;
import java.sql.Statement;

import org.junit.Before;
import org.junit.Test;

import com.jdbc.config.Config;
import com.jdbc.service.StatementDB;

public class Testing {
	
	Connection connection;
	Config config;
	StatementDB statement;
	
	@Before
	public void initialization() {
		config = Config.getInstance();
		connection = config.getConnection();
		statement = new StatementDB(connection);
	}

	@Test
	public void testUpdateHappy() {
		statement.read();
		statement.update();
		
		assertEquals(statement.checkUpdate(), true);
	}
}
