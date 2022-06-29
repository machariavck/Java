import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Coffee {

	// static {
		
	// 	try {
	// 		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
	// 	} catch (Exception e) {
	// 		System.out.println("Something's wrong at the beginnning");
	// 	}
	// }
	

	public static void main(String... sth) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();

			Connection conn = null;
			
			try {
				conn = DriverManager.getConnection("jdbc:mysql://localhost/javafirstdb","root","konjugate");
				System.out.println("Connection was successful");
			} catch (Exception e) {
				System.out.println(e);
			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}
}