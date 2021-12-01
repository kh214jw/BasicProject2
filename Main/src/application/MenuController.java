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
				alert.setTitle("���¸޼���"); 
				alert.setContentText("�Ƹ޸�ī�� �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				americano_AddButton.setOnAction(event->alert.show());		
			}			
		});
		
		cafelatte_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("ī��� �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				cafelatte_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		vanillalatte_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("�ٴҶ�� �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				vanillalatte_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		whitemocha_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("ȭ��Ʈ��ī �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				whitemocha_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		peachicetea_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("������ ���̽�Ƽ �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				peachicetea_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		grapefruitade_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("�ڸ����̵� �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				grapefruitade_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		strawberryyogurt_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("������Ʈ �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				strawberryyogurt_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		cheesecake_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("ġ������ũ �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				cheesecake_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		chocolatecake_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("���ݸ�����ũ �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				chocolatecake_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});
		
		strawberrycake_AddButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				// TODO Auto-generated method stub
				Alert alert = new Alert(AlertType.INFORMATION);
				alert.setTitle("���¸޼���");
				alert.setContentText("��������ũ �ϳ��� �߰��Ǿ����ϴ�.");
				alert.setHeaderText("�߰��� �޴�");
				strawberrycake_AddButton.setOnAction(event -> alert.show());
				
			}
			
		});		
	}
	

	public void setPmrimaryStage(Stage primaryStage) {
		PrimaryStage = primaryStage;
	}

}
 