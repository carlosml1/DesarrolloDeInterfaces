package application;
	
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;


public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			/*Button btn = new Button("Click aqui");
			btn.setOnAction( new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent event) {
					System.out.println("Hola mundo");
				}
				
			});
			
			Label lb = new Label("Hola");
			
			StackPane panel = new StackPane();
			
			panel.setAlignment(lb,Pos.TOP_CENTER);
			
			panel.setAlignment(btn,Pos.CENTER);
			
			panel.getChildren().addAll(lb,btn);
			*/
			Button btn = new Button("Click aqui");
			Button btn2 = new Button("Click aqui o veras ");
			Button btn3 = new Button("peepomad");
			
			VBox panel = new VBox(15);
			panel.setPadding(new Insets(15));
			panel.getChildren().addAll(btn,btn2,btn3);
			panel.setAlignment(Pos.TOP_CENTER);
			
			Scene scene = new Scene(panel,400,300);
			primaryStage.setScene(scene);
			primaryStage.setTitle("Introduccion JavaFX");
			primaryStage.getIcons().add(new Image("/application/a.png"));
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
