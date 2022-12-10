package application;


import java.net.URL;
import java.text.DecimalFormat;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;



public class MainViewController implements Initializable {
	

	@FXML
	private ChoiceBox<String> choicebox;
	
	@FXML
    private Button clear1;

    @FXML
    private TextField interest_rate;

    @FXML
    private TextField loan_amount;

    @FXML
    private TextField no_months;

    
    @FXML
    private Button calc1;
    
    @FXML
    private Label result_yearly;
	

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
			choicebox.getItems().addAll("Find the Loand Amount",	"Find the Interest Rate", "Find the Number of Months" ,"Find the Monthly Payment");
			choicebox.setOnAction(this::getchoiceoption);
			
	}
	
	public void getchoiceoption(ActionEvent event) {
		int Selected = choicebox.getSelectionModel().getSelectedIndex();
		
		if(Selected == 0) {
			System.out.println("0");
			
			
		}
		if(Selected == 1) {
			System.out.println("1");
			
		}
		if(Selected == 2) {
			System.out.println("2");
			
		}
		if(Selected == 2) {
			System.out.println("3");
			
		}
	}
	 public void Monthly_Payment(ActionEvent event) {
		 
			double amount_loan =  Double.parseDouble(loan_amount.getText());
			double amount_interest = (Double.parseDouble(interest_rate.getText()) / 100) / 12;
			double no_of_month = Double.parseDouble(no_months.getText());
			
			double pmt = amount_loan * amount_interest /(1 - 1 / Math.pow(1 + amount_interest, no_of_month * 12));
			
			double number = Math.round(pmt * 100.0) / 100.0;
			
			
			result_yearly.setText(Double. toString(number));
			
		}
	 public void clearfield(ActionEvent event) {

		 	interest_rate.clear();

		 	loan_amount.clear();

		 	no_months.clear();

		 	result_yearly.setText("");

		 	

	 }
	
}
