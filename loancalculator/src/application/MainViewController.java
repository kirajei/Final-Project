package application;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;



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
	
    @FXML
    private AnchorPane pane1;

    @FXML
    private AnchorPane pane2;
    
    @FXML
    private TextField principal;

    @FXML
    private Label result_interest;
    
    @FXML
    private TextField simplerate;
    
    @FXML
    private TextField time_period;
    

	@Override
	public void initialize(URL url, ResourceBundle resourceBundle) {
			choicebox.getItems().addAll("Find the Loand Amount",	"Find the Simple Interest Rate");
			choicebox.setOnAction(this::getchoiceoption);
			
	}
	
	public void getchoiceoption(ActionEvent event) {
		int Selected = choicebox.getSelectionModel().getSelectedIndex();
		
		if(Selected == 0) {
			pane1.setVisible(true);
			pane2.setVisible(false);
		}
		if(Selected == 1) {
			pane1.setVisible(false);
			pane2.setVisible(true);
			
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
	 
	 public void Simple_Interest(ActionEvent event) {
		 
		 double p = Double.parseDouble(principal.getText());
		 double r = Double.parseDouble(simplerate.getText());
		 double t = Double.parseDouble(time_period.getText());
		 
		 double total_interest = (p * r * t) / 100;
		 result_interest.setText(Double. toString(total_interest));
	 }
	 
	 public void clearfield2(ActionEvent event) {
		 
		 principal.clear();
		 	simplerate.clear();
		 	time_period.clear();
		 	result_interest.setText("");
		 
		 
		 
	 }
	
}
