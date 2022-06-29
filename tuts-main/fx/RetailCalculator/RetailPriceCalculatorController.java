import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class RetailPriceCalculatorController {

    @FXML
    private AnchorPane mainAnchor;

    @FXML
    private TextField wholesaleCost;

    @FXML
    private Button computePrice;

    @FXML
    private TextArea markup;

    @FXML
    private Label markupLabel;

    @FXML
    private TextField outputField;

	@FXML
	private Label errorLabel;


	public void computeRetailPrice() {
		if (wholesaleCost.getText() != "" && markup.getText() != "") {
			errorLabel.setText("");
			double c = Double.parseDouble(wholesaleCost.getText());
			double m = Double.parseDouble(markup.getText());
			outputField.setText(String.format("KES %,.2f", c * (1 + m)));
		}
		else {
			errorLabel.setText("Error! Provide values in the fields");
		}
	}

}
