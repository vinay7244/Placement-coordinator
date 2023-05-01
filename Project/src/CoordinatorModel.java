import java.sql.*;
public class CoordinatorModel {
	public boolean createEntry(int id,String name,String password,float cgpa,int year,String branch,boolean placed)
	{
		Connection conn=null;
		try {
			String url="jdbc:mysql://localhost:3306/db";
			String user="root";
			String pass="";
	        conn = DriverManager.getConnection(url, user, pass);
	        System.out.println("Connected to MySQL database.");
		}catch (SQLException e) {
	     System.out.println("Failed to connect to MySQL database: " + e.getMessage());
	     return false;
	     
	}
		 String query = "Insert into student values(?,?,?,?,?,?,0)";
		try (PreparedStatement stmt = conn.prepareStatement(query)) {
	    stmt.setInt(1,id);
	    stmt.setString(2,name);
	    stmt.setString(3,password);
	    stmt.setFloat(4,cgpa);
	    stmt.setInt(5,year);
	    stmt.setString(6, branch);
    	int rows = stmt.executeUpdate();
	    try{
	    conn.close();
	    }
	    catch (SQLException e) {
	        System.out.println("Error closing: " + e.getMessage());
	        return false;
	    } 
	   
	

	}catch(SQLException e)
		{
		System.out.println(e);
		return false;
		}
	return true;
}
}


