package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class LoanCalculatorController {
	Stage applicationStage;


	 @FXML
	 private Label label;
		
	
    @FXML
    private BorderPane mainPane;
	
	
	
    @FXML
    void goToLA(ActionEvent event) {
    	Scene mainScene = applicationStage.getScene();
    	
    	HBox newPage = new HBox();
    	
    	Button goBack = new Button("Go Back");
    	goBack.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
    	newPage.getChildren().addAll(goBack);    	
    	Scene nextPage = new Scene(newPage);    	
    	applicationStage.setScene(nextPage);
    	

    }

    @FXML
    void goToIR(ActionEvent event) {
    	System.out.println("You clicked me");
    	FxmlLoader object = new FxmlLoader();
    	Pane view = object.getPage("LoanAmount");
    	mainPane.setCenter(view);
    }

    @FXML
    void goToNM(ActionEvent event) {

    }

    @FXML
    void goToMP(ActionEvent event) {

    }

}

