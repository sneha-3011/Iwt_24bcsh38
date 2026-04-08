package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class Update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://192.168.1.17/cse_db";
		String username = "24bcsh38";
		String password = "24bcsh38";
		int roll_no;
		float cgpa;
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter cgpa to update");
		float newcgpa=sc.nextFloat();
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con!= null){
			System.out.println("Connection established successfully");
		    }
			String qry="UPDATE STUDENT SET cgpa=? WHERE roll_no=?";
			
			PreparedStatement stmt=con.prepareStatement(qry);
			stmt.setFloat(1, newcgpa);
			stmt.setInt(2, 1);
			int i=stmt.executeUpdate();
			if(i==1) {
				System.out.println("Updated");
			}
			stmt.close();
			con.close();
			} catch (Exception e){
			System.out.println(e);
			}


	}

}
