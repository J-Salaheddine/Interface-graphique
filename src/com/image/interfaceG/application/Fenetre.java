package com.image.interfaceG.application;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Fenetre extends Application{

	private Button cross;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launch(args);

	}
	
	@Override
	public void start(Stage stage) throws Exception {
	//	stage.initStyle(StageStyle.UNDECORATED);
		
		cross = new Button();
		
		
		cross.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent arg0) {
				stage.close();
			}
		});
		
		VBox root = new VBox();
		root.getChildren().add(cross);
		
		Scene scene = new Scene(root, 840,576);
		stage.setScene(scene);
		stage.setTitle("sdlsdfg");
		
		scene.getStylesheets().add("AppStyle.css");
		
		stage.show();		
	}

}
