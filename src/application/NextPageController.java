package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class NextPageController {
	Stage applicationStage;
	
    @FXML
    void goToPage(ActionEvent event) {
    	Scene mainScene = applicationStage.getScene();
    	
    	HBox newPage = new HBox();
    	
    	Button goBack = new Button("Go Back");
    	goBack.setOnAction(doneEvent -> applicationStage.setScene(mainScene));
    	
    	newPage.getChildren().addAll(goBack);    	
    	Scene nextPage = new Scene(newPage);    	
    	applicationStage.setScene(nextPage);

    	
    	
    }

}
