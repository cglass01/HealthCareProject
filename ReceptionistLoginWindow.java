package healthcareLook;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class ReceptionistLoginWindow {

	
	
	

	static AnchorPane anchLogin;
	static Stage receptionistLoginStage;
	
	public static void startLoginScreen() {
		
		FXMLLoader loadMain = new FXMLLoader();
		loadMain.setLocation(MainMenu.class.getResource("ReceptionistLogin.fxml"));
		try{
			anchLogin = (AnchorPane) loadMain.load();
		
		}
		catch(IOException ex1){
			
			ex1.printStackTrace();
			
		}
		receptionistLoginStage = new Stage();
		receptionistLoginStage.setTitle("Welcome to Healhcare Clinic!");
		Scene scene = new Scene(anchLogin);
		receptionistLoginStage.setScene(scene);
		receptionistLoginStage.show();
		
	}
	public static void stageClose(){
		receptionistLoginStage.close();
	}
}
