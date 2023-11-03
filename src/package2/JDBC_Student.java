package package2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Student {
	
	Connection con;
	PreparedStatement pstmt=null;
	Statement stmt=null;
	ResultSet result;
	int SerialNo=1;
	
	public JDBC_Student(){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			System.out.println("Got Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		 con = null;
		try {
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/fullstack","root","root");
			System.out.println("Got Connection");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public int insertData(String FirstName, String LastName,long PhoneNumber,String Address,String Gender,String DateOfBirth,String Education, String Subject1, String Subject2) {
		int status=0;
//		while(SerialNo==getRow()) {
		try {
			pstmt=con.prepareStatement("insert into Student_data values(default,?,?,?,?,?,?,?,?,?)");
//			pstmt.setInt(1, 0);
			pstmt.setString(1, FirstName);
			pstmt.setString(2, LastName);
			pstmt.setLong(3, PhoneNumber);
			pstmt.setString(4, Address);
			pstmt.setString(5, Gender);
			pstmt.setString(6, DateOfBirth);
			pstmt.setString(7, Education);
			pstmt.setString(8, Subject1);
			pstmt.setString(9, Subject2);
			
			
			status=pstmt.executeUpdate();
			

			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return status;
	}
	
	
	public ResultSet getTable() {
		
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			result=stmt.executeQuery("select * from Student_data");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return result;
	}
	
	public ResultSet getRow(int serialNumber) {
		
		try {
			stmt=con.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        try {
			result=stmt.executeQuery("select * from Student_data where SerialNo = "+ serialNumber);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
	
	public int insertUpdate(String FirstName, String LastName,long PhoneNumber,String Address,String Gender,String DateOfBirth,String Education, String Subject1, String Subject2) {
		int status=0;
		
		try {
			pstmt=con.prepareStatement("update Student_data set FirstName =? , LastName =?, PhoneNumber=?, Address=?, Gender=?, DateOfBirth=?, Education=?, Subject_1=?, Subject_2=?");
			pstmt.setString(1, FirstName);
			pstmt.setString(2, LastName);
			pstmt.setLong(3, PhoneNumber);
			pstmt.setString(4, Address);
			pstmt.setString(5, Gender);
			pstmt.setString(6, DateOfBirth);
			pstmt.setString(7, Education);
			pstmt.setString(8, Subject1);
			pstmt.setString(9, Subject2);
			status=pstmt.executeUpdate();
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public int deleteData(int SerialNo) {
		int status=0;
		
		try {
			pstmt=con.prepareStatement("delete from Student_data where SerialNo = " + SerialNo);
			status=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
