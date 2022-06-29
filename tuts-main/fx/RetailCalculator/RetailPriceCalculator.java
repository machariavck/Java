
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class RetailPriceCalculator extends Application {

	@Override
	public void start(Stage stage) throws Exception {
		
		Parent parent = FXMLLoader.load(getClass().getResource("RetailCalculator.fxml"));
		Scene scene = new Scene(parent);

		stage.setTitle("Retail Price Calculator");
		stage.setScene(scene);
		stage.show();
	}


	public static void main(String[] sth) {
		launch(sth);
	}
}