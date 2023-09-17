package x;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class InsertJdbc {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bankingapp","root","root");
			PreparedStatement stmt=con.prepareStatement("insert into customer values(?,?,?,?,?,?,?)");
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter ID:");
			int id=sc.nextInt();
			System.out.print("Enter First Name:");
			String F_name=sc.next();
			System.out.print("Enter Last Name:");
			String L_name=sc.next();
			System.out.print("Enter Mobile number:");
			String Mobile_no=sc.next();
			System.out.print("Enter PAN Number:");
			String PAN_no=sc.next();
			System.out.print("Enter Adhar Number:");
			String ADHAR_no=sc.next();
			System.out.print("Enter Date of Birth:");
			String Dob = sc.next();
			 stmt.setInt(1, id);
			 stmt.setString(2, F_name);
			 stmt.setString(3, L_name);
			 stmt.setString(4,Mobile_no);
			 stmt.setString(5, PAN_no);
			 stmt.setString(6, ADHAR_no);
			 stmt.setString(7,Dob);
			
			stmt.execute();
			stmt.close();
			con.close();
			
			System.out.println("Data Inserted Succesfully...");
		
		} catch (Exception e) {
			System.out.println(e);
		}
	}

	
}
