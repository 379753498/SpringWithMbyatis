package Dianti.Dianti_test;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.Dianti.jdbc.Factory.jdbcConnection;
import com.Dianti.jdbc.Factory.oraclejdbcConnectionimp;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws SQLException 
    {
    	jdbcConnection js= new oraclejdbcConnectionimp();
    	
    	ResultSet selectfind = js.Selectfind("select * from VTE_MAINT_UNIT");
    	
    	
    	while(selectfind.next())
    	{
    		System.out.println(selectfind.getString(2));
    	}
    
    }
}
