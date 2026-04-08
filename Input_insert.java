package mypack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.*;
public class Input_insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://192.168.1.17/cse_db";
		String username = "24bcsh38";
		String password = "24bcsh38";
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter roll no:");
		int roll_no=sc.nextInt();
		System.out.print("Enter name:");
		String name=sc.nextLine();
		sc.nextLine();
		System.out.print("Enter age:");
		int age=sc.nextInt();
		sc.nextLine();
		System.out.print("Enter departemnt:");
		String department=sc.nextLine();
		System.out.print("Enter cgpa:");
		float cgpa=sc.nextFloat();
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con!= null){
			System.out.println("Connection established successfully");
		    }
			String qry="INSERT INTO STUDENT(roll_no,name,age,department,cgpa) VALUES(?,?,?,?,?)";
			
			PreparedStatement stmt=con.prepareStatement(qry);
			stmt.setInt(1, roll_no);
			stmt.setString(2,name);
			stmt.setInt(3,age);
			stmt.setString(4, department);
			stmt.setFloat(5,cgpa);
			int i=stmt.executeUpdate();
			if(i==1) {
				System.out.println("Record inserted");
			}
			stmt.close();
			con.close();
			} catch (Exception e){
			System.out.println(e);
			}


	}

}
