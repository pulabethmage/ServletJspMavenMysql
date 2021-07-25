package co.urbanraw.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import co.urbanraw.web.model.Books;

public class BooksDao {
	
	
	String url = "jdbc:mysql://localhost:3306/jspweb";
	String mysqluser = "root";
	String mysqlpass = "";

	
	public Books getBooks(int bid)
	{
		Books b = new Books();
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, mysqluser, mysqlpass);
			PreparedStatement pst = con.prepareStatement("select * from books_tbl where id="+bid);
		
			ResultSet rs = pst.executeQuery();
			
			if(rs.next())
			{
				b.setBid(rs.getInt("id"));
				b.setBname(rs.getString("book_name"));
				b.setAname(rs.getString("book_tuthr"));
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	
		
		return b;
	}
}
