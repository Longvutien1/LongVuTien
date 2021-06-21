package frontend;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Exercise1 {

	public static void main(String[] args) throws SQLException {
//		Bước 1: Khởi tạo tham số để thực hiện mở conection
		String url = "jdbc:mysql://localhost:3306/java";
		String username = "root";
		String password = "root";
		
//		Bước 2: kết nối với database
		Connection connection = DriverManager.getConnection(url, username,password);
//		
		System.out.println("Đăng nhập thành công !!");
		
//		tạo đối tượng statement
		Statement statement =  connection.createStatement();
		
//		tao đối tượng result để hứng kq
		ResultSet resultSet = statement.executeQuery("select * from `user`");
		while (resultSet.next()) {
			System.out.print("\nId: "+resultSet.getString("id" ));
			System.out.print("\tName: "+resultSet.getString("Name"));
			
		}
		
////		insert
////		tạo đối tượng prestatement 
//		String sql = "INSERT INTO `User`(Id, `Name`) VALUES ( ?, ? )";
//		
//		PreparedStatement preparablesStatement = connection.prepareStatement(sql);
//		
////		gán giá trị vào ? ở sql
//		preparablesStatement.setInt(1, 8);
//		preparablesStatement.setString(2, "Bruno");
//		
////		tạo biến để hứng kq
//		int affectedRows  =preparablesStatement.executeUpdate();
//		
////		in ra màn hình kq
//		System.out.println("\nĐã thêm "+affectedRows + " bản ghi");
//		connection.close();
	
		
//		update 
////		tạo đối tượng prestatement 
//		String sql = "UPDATE `User` Set `Name` = ? Where id = ?";
//		
//		PreparedStatement preparablesStatement = connection.prepareStatement(sql);
//		
////		gán giá trị vào ? ở sql
//		preparablesStatement.setString(1, "Bruno Đẹp Zai22");
//		preparablesStatement.setInt(2, 5);
//		
////		tạo biến để hứng kq
//		int affectedRows  =preparablesStatement.executeUpdate();
//		
////		in ra màn hình kq
//		System.out.println("\nĐã UPDATE "+affectedRows + " bản ghi");
//		connection.close();
		
		
//		delete
//		tạo đối tượng prestatement
		String sql = "DELETE from `User` WHERE id = ?;";
		
		PreparedStatement preparablesStatement = connection.prepareStatement(sql);
		
//		gán vào giá trị ở sql
		preparablesStatement.setInt(1, 1);
//		tạo biến để hứng kq
		int affectedRows = preparablesStatement.executeUpdate();
		System.out.println("\nĐã Delete "+affectedRows+ " bản ghi");
		connection.close();
	}
	
}
