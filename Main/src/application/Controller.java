#인터페이스의 ActionEvent의 코드를 담고 있음. (현재 아메리카노의 "추가하기" 버튼을 눌렀을 경우에 시스템 메세지로 "추가 되었습니다."라는 메세지를 출력하는 것을 구현함.)

#다른 버튼도 눌렀을 때 구현 시킬 수 있도록 해야 함.

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
 
