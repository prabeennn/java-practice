package jdbcdemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/University" ,"root","1234");
		Statement st= con.createStatement();
		st.execute("create table Student(id int,name varchar(20), age int)");
		System.out.println("table created successfully");

	}

}
