import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

public class Controller {

    @FXML
    private AnchorPane anchor;

    @FXML
    private Button label1;

    @FXML
    private Button label2;

    @FXML
    private Button label3;

    @FXML
    private Label outputLabel;

    @FXML
    private Label headerLabel;


	public void click1() {
		outputLabel.setText("Left");
	}

	public void click2() {
		outputLabel.setText("Right");
	}

	public void click3() {
		outputLabel.setText("Center");
	}
}
