import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class KilometerConverterController {

    @FXML
    private Label label_enter_distance;

    @FXML
    private Button button_convert_to_miles;

    @FXML
    private TextField text_field_input;

    @FXML
    private Label label_print_message;

	@FXML
    private ToggleGroup ColorGroups;


	public void initialize() {
		//	an optional method called when FXML is loaded; used to perform some initialization
	}

	public void printSth() {
		label_print_message.setText("Good evening");
	}



	//	event listener for the button_convert_to_miles
	public void convertToMiles() {
		final double CONVERSION_FACTOR = 0.6214;

		//	get km from the text_field_input
		String s = text_field_input.getText();

		//	convert to miles
		double miles = Double.parseDouble(s) * CONVERSION_FACTOR;

		//	display the converted distance
		label_print_message.setText(s + " kilometers are " + miles + " miles");
	}

}
