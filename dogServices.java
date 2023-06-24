package services;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import DBConnection.connection;

public class dogServices {

	
	public static void insertDog(int id,String name) throws Exception {
		String query="insert into dog (did,name) values(?,?)";
		
		PreparedStatement pstmt=connection.con().prepareStatement(query);
		
		pstmt.setInt(1, id);
		pstmt.setString(2, name);
		
		pstmt.executeUpdate();
	}
	
	
	public static void deleteDog(int id) throws Exception {
		String query="delete from dog where did=?";
		
		PreparedStatement pstmt=connection.con().prepareStatement(query);
		
		pstmt.setInt(1, id);
		
		pstmt.executeUpdate();
	}
	
	
	public static void updatedog(int id,String name) throws Exception {
		String query="update dog set name=? where did=?";
		
		PreparedStatement pstmt=connection.con().prepareStatement(query);
		pstmt.setInt(2, id);
		pstmt.setString(1, name);
		
		pstmt.executeUpdate();
	}
	
	public static void showdogs() throws Exception{
		
		String query="select * from dog";
		
		Statement stmt=connection.con().createStatement();
		ResultSet set=stmt.executeQuery(query);
		
		while(set.next()) {
		int id=	set.getInt(1);
		String name=set.getString(2);
		
		System.out.println(id+"  "+name);
		System.out.println("-----========-------");
		}
	}
}
