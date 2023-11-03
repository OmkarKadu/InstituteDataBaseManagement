package package2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBC_Staff {
	
	Connection con;
	PreparedStatement pstmt=null;
	Statement stmt=null;
	ResultSet result;
	
	public JDBC_Staff(){
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
	
	public int insertData(String FirstName, String LastName,long PhoneNumber,String Address,String Gender,String DateOfBirth,String Education, String Department) {
		int status=0;
		
		try {
			pstmt=con.prepareStatement("insert into Staff_data values(default,?,?,?,?,?,?,?,?)");
//			pstmt.setInt(1, 0);
			pstmt.setString(1, FirstName);
			pstmt.setString(2, LastName);
			pstmt.setLong(3, PhoneNumber);
			pstmt.setString(4, Address);
			pstmt.setString(5, Gender);
			pstmt.setString(6, DateOfBirth);
			pstmt.setString(7, Education);
			pstmt.setString(8, Department);
			
			
			
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
			result=stmt.executeQuery("select * from Staff_data");
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
			result=stmt.executeQuery("select * from Staff_data where SerialNo = "+ serialNumber);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return result;
	}
	
	
	public int insertUpdate(int serialNo ,String FirstName, String LastName,long PhoneNumber,String Address,String Gender,String DateOfBirth,String Education, String Department) {
		int status=0;
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement=con.prepareStatement("update Staff_data set FirstName =? , LastName =?, PhoneNumber=?, Address=?, Gender=?, DateOfBirth=?, Qualification=?,Department=? where serialNo = ?");
			preparedStatement.setString(1, FirstName);
			preparedStatement.setString(2, LastName);
			preparedStatement.setLong(3, PhoneNumber);
			preparedStatement.setString(4, Address);
			preparedStatement.setString(5, Gender);
			preparedStatement.setString(6, DateOfBirth);
			preparedStatement.setString(7, Education);
			preparedStatement.setString(8, Department);
			preparedStatement.setInt(9, serialNo);
			
			status=preparedStatement.executeUpdate();
			System.out.println("-------------" + status + "--------------");
		
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return status;
	}
	
	public int deleteData(int SerialNo) {
		int status=0;
		
		try {
			pstmt=con.prepareStatement("delete from Staff_data where SerialNo=" + SerialNo);
			
			status=pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		return status;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
