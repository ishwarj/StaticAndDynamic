package combineStaticDynamic;

import java.sql.*;
import java.util.Scanner;

public class CombineDynamic {
	
	public void insert() {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the Sid: ");
		int Sid=scanner.nextInt();

		System.out.println("Enter the Sname: ");
		String Sname=scanner.next();
		
		System.out.println("Enter the Smark: ");
		int Smark=scanner.nextInt();
		
		System.out.println("Enter the Sclass: ");
		int Sclass=scanner.nextInt();
		
		Connection connection=null;
		PreparedStatement statement=null;
		String url="jdbc:mysql://localhost:3306/Employee";
		String query="insert into student values(?,?,?,?)";
		try {
			connection=DriverManager.getConnection(url, "root", "root");
			statement=connection.prepareStatement(query);
			statement.setInt(1, Sid);
			statement.setString(2, Sname);
			statement.setInt(3, Smark);
			statement.setInt(4, Sclass);
			
			int result=statement.executeUpdate();
			if (result !=0) {
				System.out.println(result+"No of row affected");
				System.out.println("data inserted successfully");
			}
		} catch (Exception e) {// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}	         
	public void update() {
		
				Scanner scanner=new Scanner(System.in);
				System.out.println("Enter Sid of Student: ");
				int Eid=scanner.nextInt();
				System.out.println("Enter name of Student: ");
				String Ename=scanner.next();
				
				String dburl="jdbc:mysql://localhost:3306/Employee?user=root&password=root";
				String query="update emp set Eid=? where Ename=?";
			
				Connection connection=null;
				PreparedStatement prepared =null;
				try {
					connection=DriverManager.getConnection(dburl);
			    	prepared=connection.prepareStatement(query);
			    	
			    	prepared.setInt(1, Eid);
			    	prepared.setString(2, Ename);
			    	
			    	int result=prepared.executeUpdate();
			    	if(result !=0) {
			    		System.out.println(result +"  No of row affected");
			    	}
			    	
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	}
	public void delete() {
	Scanner scanner=new Scanner(System.in);
	//System.out.println("Enter the Eid: ");
	//int Eid=scanner.nextInt();

	System.out.println("Enter the Sname: ");
	String Job=scanner.next();

	Connection connection=null;
	PreparedStatement statement=null;

	String dburl="jdbc:mysql://localhost:3306/employee?user=root&password=root";
	String query="delete from Student where Sname=?";
	try {
		connection=DriverManager.getConnection(dburl);
		statement=connection.prepareStatement(query);
		
		statement.setString(1, Job);
		int result=statement.executeUpdate();
		if(result !=0) {
			System.out.println(result+" No of row affected");
			System.out.println("Data deleted successfully");
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}
	}

