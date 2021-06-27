package FX;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


public class MainFX extends Application{

	
	private static Stage window;
	private Scene scene;
	public static void main(String[] args) {

	}

	@Override
	public void start(Stage arg0) throws Exception {
		window = new Stage();
		
		Parent root = FXMLLoader.load(getClass().getResource("Application.fxml"));
		
		scene = new Scene(root);
		scene.getStylesheets().add(getClass().getResource("Styles.css").toString());
		window.setScene(scene);
		window.setResizable(false);
		window.show();
	}

}
