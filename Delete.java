package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Delete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://192.168.1.17/cse_db";
		String username = "24bcsh38";
		String password = "24bcsh38";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no to delete record");
	    int newroll=sc.nextInt();
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con!= null){
			System.out.println("Connection established successfully");
		    }
			String qry="DELETE FROM STUDENT WHERE roll_no=?";
			
			PreparedStatement stmt=con.prepareStatement(qry);
			stmt.setInt(1, newroll);
			int i=stmt.executeUpdate();
			if(i>0) {
				System.out.println("Record deleted");
			}
			stmt.close();
			con.close();
			} catch (Exception e){
			System.out.println(e);
			

	}

	}
}
