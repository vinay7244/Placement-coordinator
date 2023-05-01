import java.sql.*;
public class model {
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
	 		rs = st.executeQuery("select count(*) as cou from jobs");
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
		rk=st.executeQuery("select * from jobs");
		arr[0][0]="cName";
		arr[0][1]="Role";
		arr[0][2]="JD";
		arr[0][3]="Branch";
		arr[0][4]="Stipend";
		arr[0][5]="Cutoff";
		arr[0][6]="Status";
		int i=1;
		while(rk.next())
		{
			arr[i][0]=rk.getString("cName");
			arr[i][1]=rk.getString("role");
			arr[i][2]=rk.getString("jd");
			arr[i][3]=rk.getString("branch");
			arr[i][4]=rk.getString("stipend");
			arr[i][5]=rk.getString("cutoff");
			arr[i][6]=rk.getString("status");
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
	public void query(String x)
	{
		System.out.println(x);
		int a=Integer.parseInt(x);
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
	 		PreparedStatement stmt=conn.prepareStatement("update jobs set status=0 where stipend<?");
	 		stmt.setInt(1,a);
	 		int r=stmt.executeUpdate();
		}catch(SQLException e)
		{
			System.out.println(e);
		}
	}
	
	public int size1()
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
	 		rs = st.executeQuery("select count(*) as cou from jobs where status=1");
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
	
public String[][] connect1(int x)
	{
	System.out.println(x);
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
		rk=st.executeQuery("select * from jobs where status=1");
		arr[0][0]="cName";
		arr[0][1]="Role";
		arr[0][2]="JD";
		arr[0][3]="Branch";
		arr[0][4]="Stipend";
		arr[0][5]="Cutoff";
		arr[0][6]="Status";
		int i=1;
		while(rk.next())
		{
			arr[i][0]=rk.getString("cName");
			arr[i][1]=rk.getString("role");
			arr[i][2]=rk.getString("jd");
			arr[i][3]=rk.getString("branch");
			arr[i][4]=rk.getString("stipend");
			arr[i][5]=rk.getString("cutoff");
			arr[i][6]=rk.getString("status");
			System.out.println(arr[i][0]+" "+arr[i][1]);
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
 		rs = st.executeQuery("select count(*) as cou from jobs where status=0");
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

public String[][] connect2(int x)
{
System.out.println(x);
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
	rk=st.executeQuery("select * from jobs where status=0");
	arr[0][0]="cName";
	arr[0][1]="Role";
	arr[0][2]="JD";
	arr[0][3]="Branch";
	arr[0][4]="Stipend";
	arr[0][5]="Cutoff";
	arr[0][6]="Status";
	int i=1;
	while(rk.next())
	{
		arr[i][0]=rk.getString("cName");
		arr[i][1]=rk.getString("role");
		arr[i][2]=rk.getString("jd");
		arr[i][3]=rk.getString("branch");
		arr[i][4]=rk.getString("stipend");
		arr[i][5]=rk.getString("cutoff");
		arr[i][6]=rk.getString("status");
		System.out.println(arr[i][0]+" "+arr[i][1]);
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
