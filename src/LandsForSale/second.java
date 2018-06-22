package LandsForSale;
import java.sql.DriverManager;
import com.mysql.jdbc.Connection;
public class second {
	public static void main(String[] args) {
		Connection con = null;
		try {
			con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/lurrak1","root","123456");
		
			if(con != null) {
				System.out.println("connected successfully to database");
			}
		
		} catch(Exception e) {
			System.out.println("not connected to database");
		}
	}
}
