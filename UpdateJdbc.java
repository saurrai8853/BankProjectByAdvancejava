package x;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingapp","root","root");
			PreparedStatement stmt=con.prepareStatement("update customer set dob=? where id=?");
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter ID:");
			int id=sc.nextInt();
			System.out.println("Enter Date of birth:");
		    String dob=sc.next();
		    stmt.setString(1, dob);
		    stmt.setInt(2, id);
		    stmt.execute();
		    stmt.close();
		    con.close();
		    System.out.println("Data Updated Sucessfully");
		} catch (Exception e) {
			System.out.println(e);
		}

	}

}
