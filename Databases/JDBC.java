/*
	JAVA DATABASE CONNECTIVITY
	==========================
	~ to get a connection to a database, the static JDBC method DriverManager.getConnection(DatabaseURL) is called
	~ 'DatabaseURL' is a string known as the 'database URL'
	~ a 'database URL' lists the protocol that should be used to access the database, the database name & other items
				protocol:subprotocol:databaseName
	~ 'protocol' refers to the database protocol e.g. jdbc
	~ 'subprotocol' refers to the particular type of DBMS one is connecting to e.g. derby
	~ 'databaseName' refers to the database one is connecting to
	~ the getConnection method searches for and loads a JDBC driver that's compatible with the db specified by the url
	~ a 'JDBC driver' is a Java class designed to communicate with a specific DBMS
	~ each DBMS usually comes with its own JDBC driver
	~ when the getConnection method finds a compatible driver, it returns a Connection object (java.sql.Connection interface)
	~ if it fails, an SQlException is thrown
*/

import java.sql.*;

class JDBC {

	public static void main(String... sth) {
		try {
			Connection c = DriverManager.getConnection("jdbc:postgresql:mydb");
			System.out.println("Opened connection..");
			c.close();
			System.out.println("Connection closed.");
		} catch (SQLException e) {
			System.out.println(e);
		}
	}
}