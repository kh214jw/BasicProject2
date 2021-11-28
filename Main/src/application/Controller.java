package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller implements Initializable{
	
	private Stage PmrimaryStage;
	
	@FXML
	private Button americano_AddButton;
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		americano_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("아메리카노 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				americano_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
	}

	public void setPmrimaryStage(Stage pmrimaryStage) {
		PmrimaryStage = pmrimaryStage;
	}

}
 