package com.Dianti.jdbc.Factory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.context.ApplicationContext;

import com.Dianti.Springutil.ApplicationContextUitl;

public class SqlserverjdbConnectionimp  implements jdbcConnection{

	
	public static  Connection conn=null;
	static{
    	ApplicationContext Context = ApplicationContextUitl.getApplicationContextlzy();
    	BasicDataSource bean = (BasicDataSource)Context.getBean("sqlserverdataSource");
    	try {
			conn=bean.getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}
	public ResultSet Selectfind(String sql) throws SQLException {
		PreparedStatement stmt = (PreparedStatement) conn.prepareStatement(sql);
		ResultSet rs = stmt.executeQuery();

		return rs;
	}

	public Connection getConnection() {
		// TODO Auto-generated method stub
		return conn;
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}
