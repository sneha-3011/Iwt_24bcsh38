package mypack;
import java.sql.*;

public class Create {

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
				String query="CREATE TABLE STUDENT("+
			                   "roll_no INTEGER PRIMARY KEY, "+
						        "name VARCHAR(50), "+
			                   "age INTEGER, "+
						        "department VARCHAR(30), "+
			                   "CGPA NUMERIC(4,2))";
				Statement stmt=con.createStatement();
				stmt.execute(query);
				System.out.println("Table created");
				stmt.close();
				con.close();
				} catch (Exception e){
				System.out.println(e);
				}
		
		}

}
