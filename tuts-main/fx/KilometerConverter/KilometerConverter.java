import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class KilometerConverter extends Application {

	@Override
	public void start(Stage stage) throws Exception {

		//load the fxml file
		Parent parent = FXMLLoader.load(getClass().getResource("KilometerConverter.fxml"));

		//build the scene
		Scene scene = new Scene(parent);

		//display window using the scene graph
		stage.setTitle("Kilometer Converter Application");
		stage.setScene(scene);
		stage.show();
	}
	public static void main(String[] sth) {
		launch(sth);
	}
}