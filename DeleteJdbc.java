package x;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingapp","root","root");
			PreparedStatement stmt=con.prepareStatement("delete from customer where id=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			stmt.setInt(1, id);
			stmt.execute();
			stmt.close();
			con.close();
			System.out.println("Data Deleted Succesfully....");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
