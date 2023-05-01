import java.sql.*;
public class model_4 {
	Statement st;
	ResultSet rs,rk;
	int x;
	public int size()
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
		}
	     try {
	 		st = conn.createStatement();
	 		rs = st.executeQuery("select count(*) as cou from student");
	 		int x;
	 		if(rs.next())
	 		{
	 		x=Integer.parseInt(rs.getString("cou"));
	 		return x;
	 		}
	     }catch(SQLException a) 
	     {		
	 		System.out.println("no");
	 		a.printStackTrace();

	 	}
	     return 0;
	
		
	}
	public int size2()
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
		}
	     try {
	 		st = conn.createStatement();
	 		rs = st.executeQuery("select count(*) as cou from company");
	 		int x;
	 		if(rs.next())
	 		{
	 		x=Integer.parseInt(rs.getString("cou"));
	 		return x;
	 		}
	     }catch(SQLException a) 
	     {		
	 		System.out.println("no");
	 		a.printStackTrace();

	 	}
	     return 0;
	
		
	}
	public String[][] connect(int x)
	{
		String [][] arr=new String[x][7];
	Connection conn=null;
	try {
		String url="jdbc:mysql://localhost:3306/db";
		String user="root";
		String pass="";
        conn = DriverManager.getConnection(url, user, pass);
        System.out.println("Connected to MySQL database.");
	}catch (SQLException e) {
     System.out.println("Failed to connect to MySQL database: " + e.getMessage());
     
}
    try {
    	st=conn.createStatement();
		rk=st.executeQuery("select * from student");
		arr[0][0]="ID";
		arr[0][1]="Name";
		arr[0][2]="Password";
		arr[0][3]="CGPA";
		arr[0][4]="Year";
		arr[0][5]="Branch";
		arr[0][6]="Paced";
		int i=1;
		while(rk.next())
		{
			arr[i][0]=rk.getString("id");
			arr[i][1]=rk.getString("name");
			arr[i][2]=rk.getString("password");
			arr[i][3]=rk.getString("cgpa");
			arr[i][4]=rk.getString("year");
			arr[i][5]=rk.getString("branch");
			arr[i][6]=rk.getString("placed");
			//System.out.println(arr[i][0]+" "+arr[i][1]);
			i++;

			
		}
	    return arr;
		
	} catch (SQLException e) 
    {		
		System.out.println("no");
		e.printStackTrace();

	}
	String [][]a=new String[1][1];
	return a;
	}
	public String[][] connect2(int x)
	{
		String [][] arr=new String[x][2];
	Connection conn=null;
	try {
		String url="jdbc:mysql://localhost:3306/db";
		String user="root";
		String pass="";
        conn = DriverManager.getConnection(url, user, pass);
        System.out.println("Connected to MySQL database.");
	}catch (SQLException e) {
     System.out.println("Failed to connect to MySQL database: " + e.getMessage());
     
}
    try {
    	st=conn.createStatement();
		rk=st.executeQuery("select * from  company");
		arr[0][0]="Name";
		arr[0][1]="Password";
		int i=1;
		while(rk.next())
		{
			arr[i][0]=rk.getString("name");
			arr[i][1]=rk.getString("password");
			//System.out.println(arr[i][0]+" "+arr[i][1]);
			i++;

			
		}
	    return arr;
		
	} catch (SQLException e) 
    {		
		System.out.println("no");
		e.printStackTrace();

	}
	String [][]a=new String[1][1];
	return a;
	}

}
