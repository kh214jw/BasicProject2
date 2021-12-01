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

public class MenuController implements Initializable{

	private Stage PrimaryStage;

	@FXML private Button americano_AddButton;
	@FXML private Button cafelatte_AddButton;
	@FXML private Button vanillalatte_AddButton;
	@FXML private Button whitemocha_AddButton;
	@FXML private Button peachicetea_AddButton;
	@FXML private Button grapefruitade_AddButton;
	@FXML private Button strawberryyogurt_AddButton;
	@FXML private Button cheesecake_AddButton;
	@FXML private Button chocolatecake_AddButton;
	@FXML private Button strawberrycake_AddButton;
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
		americano_AddButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
		/*		if(americano_AddButton != null){
					
				}
				*/
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지"); 
				alert.setContentText("아메리카노 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				americano_AddButton.setOnAction(event->alert.show());		
			}			
		});
		
		cafelatte_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("카페라떼 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				cafelatte_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		vanillalatte_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("바닐라라떼 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				vanillalatte_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		whitemocha_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("화이트모카 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				whitemocha_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		peachicetea_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("복숭아 아이스티 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				peachicetea_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		grapefruitade_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("자몽에이드 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				grapefruitade_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		strawberryyogurt_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("딸기요거트 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				strawberryyogurt_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		cheesecake_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("치즈케이크 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				cheesecake_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		chocolatecake_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("초콜릿케이크 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				chocolatecake_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		strawberrycake_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("상태메세지");
				alert.setContentText("딸기케이크 하나가 추가되었습니다.");
				alert.setHeaderText("추가된 메뉴");
				strawberrycake_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});		
	}
	

	public void setPmrimaryStage(Stage primaryStage) {
		PrimaryStage = primaryStage;
	}

}
 