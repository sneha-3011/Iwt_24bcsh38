package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Display {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://192.168.1.17/cse_db";
		String username = "24bcsh38";
		String password = "24bcsh38";
		String name,department;
		int age,roll_no;
		float cgpa;
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con!= null){
			System.out.println("Connection established successfully");
		    }
			String qry="SELECT * FROM STUDENT";
			
			PreparedStatement stmt=con.prepareStatement(qry);
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt("roll_no"));
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("age"));
				System.out.println(rs.getString("department"));
				System.out.println(rs.getFloat("cgpa"));
				
			}
			stmt.close();
			con.close();
			} catch (Exception e){
			System.out.println(e);
			}


	}

}
