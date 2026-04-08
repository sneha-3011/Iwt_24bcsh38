package mypack;
import java.sql.*;

public class Connect {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{
				String driver = "org.postgresql.Driver";
				String url = "jdbc:postgresql://192.168.1.17/cse_db";
				String username = "24bcsh38";
				String password = "24bcsh38";
				Class.forName(driver);
				Connection con = DriverManager.getConnection(url, username, password);
				if(con!= null){
				System.out.println("Connection established successfully");
			    }
				} catch (Exception e){
				System.out.println(e);
				}
		
		}

}


