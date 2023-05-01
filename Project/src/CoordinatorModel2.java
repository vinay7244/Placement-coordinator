import java.sql.*;
public class CoordinatorModel2 {
	public boolean createEntry(String name,String password)
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
		 String query = "Insert into company values(?,?)";
		try (PreparedStatement stmt = conn.prepareStatement(query)) {
	    //stmt.setInt(1,id);
	    stmt.setString(1,name);
	    stmt.setString(2,password);
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


