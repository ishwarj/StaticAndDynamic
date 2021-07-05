package combineStaticDynamic;

import java.sql.*;

public class CombineStatic {

		public void insert() {
		Connection connection=null;
		Statement statement=null;
		String url1="jdbc:mysql://localhost:3306/employee?user=root&password=root";
		String query1="insert into Student values(001,'gauri',50,10)";
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(url1);
		 statement=connection.createStatement();
		int result=statement.executeUpdate(query1);
		if(result !=0) {
			System.out.println(result+"no of row affected");
			System.out.println("Data inserted successfully");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
		}
		public void update() {
		Connection connection=null;
		Statement statement=null;
		String url1="jdbc:mysql://localhost:3306/employee?user=root&password=root";
		String query1="update student set Sid=02 where Sname='gauri'";
	   try {
		Class.forName("com.mysql.jdbc.Driver");
		connection=DriverManager.getConnection(url1);
		 statement=connection.createStatement();
		int result=statement.executeUpdate(query1);
		if(result !=0) {
			System.out.println(result+"no of row affected");
			System.out.println("Data updated successfully");
		}
	} catch (Exception e) {
		e.printStackTrace();
	}
	}
		public void delete() {

		Connection connection=null;
		 Statement statement=null;
		 String url2="jdbc:mysql://localhost:3306/employee?user=root&password=root";
		 String query2="delete from student where Sname='gauri'";
		try {
			Class.forName("com.mysql.jdbc.Driver");
	 connection=DriverManager.getConnection(url2);
	   statement=connection.createStatement();
	  int result=statement.executeUpdate(query2);
	  if(result !=0) {
		   System.out.println(result+"  rows are affected ");
		   System.out.println("Data Deleted succuseefully");
	  }
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if (connection !=null) {
					connection.close();
				}
				if(statement !=null) {
					statement.close();
				}
			}catch(Exception e) {
				System.out.println("_________");
			}
		}
		}
	}

