package com.globallogic.Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBconnection {
public static Connection connect() throws Exception
{
	
	Class.forName(DBvalues.DRIVER_ADDRESS);
	Connection con=DriverManager.getConnection(DBvalues.URL,DBvalues.USERNAME,DBvalues.PASSWORD);
	return con;
}
}
