package com.Dianti.jdbc.Factory;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface jdbcConnection {

	public ResultSet Selectfind (String sql)throws SQLException;

	public Connection getConnection();

	void close();
}
