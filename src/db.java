import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class db {
	String driver = "com.mysql.jdbc.Driver";
	public Connection con;
	public Statement st;
	public ResultSet resultSet;
	public void open() throws Exception{
		Class.forName(driver);
		this.con = DriverManager.getConnection("jdbc:mysql://localhost/facebook?useUnicode=yes&characterEncoding=UTF-8", "root", "");
		this.st = con.createStatement();
	}
	public void insertuser(String str1,String str2,String str3,String str4,String str5) throws SQLException
	{
	    ResultSet resultSet = st.executeQuery("SELECT * FROM user");
	    int count = 0;
	    while(resultSet.next())
	    {
	    	count ++;
	    }
	    debug(""+count);
		resultSet = st.executeQuery("SELECT * FROM user where username="+"'"+str2+"'");
	    if(resultSet.next()){
	        
	       // String rowcount = resultSet.getString(3);
	       // debug(rowcount);
	        }else {
	        	//debug("Nothing");
	        	int val = st.executeUpdate("INSERT user VALUES('"+count +"','"+ str2 +"','"+ str3 +"','"+ str4 +"','"+ str5 + "')");
	        }
	}
	public void InsertGroup(String str1,String str2,String str3,String str4,String str5) throws SQLException
	{
		debug("InsertGroup = " + str2);
	    ResultSet resultSet = st.executeQuery("SELECT * FROM groups");
	    int count = 0;
	    while(resultSet.next())
	    {
	    	count ++;
	    }
	    debug(""+count);
		resultSet = st.executeQuery("SELECT * FROM groups where username="+"'"+str2+"'");
	    if(resultSet.next()){
	        
	       // String rowcount = resultSet.getString(3);
	       // debug(rowcount);
	        }else {
	        	//debug("Nothing");
	        	int val = st.executeUpdate("INSERT groups VALUES('"+count +"','"+ str2 +"','"+ str3 +"','"+ str4 +"','"+ str5 + "')");
	        }
	}
	public String getuser( ) throws SQLException
	{
	    ResultSet resultSet = st.executeQuery("SELECT * FROM user where p1='str3'");
	    int count = 0;
	    if(resultSet.next())
	    {
	    	count ++;
		        String rowcount = resultSet.getString(2);
		        
		        debug(rowcount);
		        return rowcount;
	    }
	    return "null";
	}
	public String getgroup( ) throws SQLException
	{
	    ResultSet resultSet = st.executeQuery("SELECT * FROM groups where p1='null'");
	    int count = 0;
	    if(resultSet.next())
	    {
	    	count ++;
		        String rowcount = resultSet.getString(2);
		        
		      //  debug(rowcount);
		        return rowcount;
	    }
	    return "null";
	}
	public void updateuserp1( String user,String p1) throws SQLException
	{
//		UPDATE table_name
//		SET column1 = value1, column2 = value2...., columnN = valueN
//		WHERE [condition];
	    st.execute("UPDATE user SET p1='"+p1+"' where username='"+user+"'");
	    

	}
	public void updategroupp1( String user,String p1) throws SQLException
	{
//		UPDATE table_name
//		SET column1 = value1, column2 = value2...., columnN = valueN
//		WHERE [condition];
	    st.execute("UPDATE groups SET p1='"+p1+"' where username='"+user+"'");
	    

	}
	public void updateuserp2( String user,String p1) throws SQLException
	{
//		UPDATE table_name
//		SET column1 = value1, column2 = value2...., columnN = valueN
//		WHERE [condition];
	    st.execute("UPDATE user SET p1='"+p1+"' where username='"+user+"'");
	    

	}
  public static void main(String[] argv) throws Exception {
	  db mdb = new db();
	  mdb.open();
	  String username =  mdb.getgroup();
//	  String [] username2 = username.split( "\\?" );
//	  String [] username3 = username2[0].split( "/" );
//	  String [] username4 = username3[3].split( "\\." );
	  debug(username);
	  mdb.updategroupp1(username, "Joned");
	  //hi.updateuserp1(username);
  }
	public static void debug(String str)
	{
		System.out.println(str);
	}
}