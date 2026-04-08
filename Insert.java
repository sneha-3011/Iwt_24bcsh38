package mypack;
import java.sql.*;
public class Insert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String driver = "org.postgresql.Driver";
		String url = "jdbc:postgresql://192.168.1.17/cse_db";
		String username = "24bcsh38";
		String password = "24bcsh38";
		try{
			Class.forName(driver);
			Connection con = DriverManager.getConnection(url, username, password);
			if(con!= null){
			System.out.println("Connection established successfully");
		    }
			Statement stmt=con.createStatement();
			String data1="INSERT INTO STUDENT VALUES(1,'SNEHA',23,'CSE',9.0)";
			String data2="INSERT INTO STUDENT VALUES(2,'SRI',24,'CSE',9.8)";
		    stmt.executeUpdate(data1);
		    stmt.executeUpdate(data2);
			System.out.println("Data inserted");
			con.close();
			} catch (Exception e){
			System.out.println(e);
			}


	}

}
