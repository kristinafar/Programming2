package csu.mod3.edu;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.time.LocalDate; 
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.io.PrintWriter;
import java.awt.Color;
import java.io.FileOutputStream;
import java.io.IOException;


public class MenuPractice extends Application {

	 @Override
	    public void start (Stage primaryStage) {
		
		LocalDate curDate = LocalDate.now();
		LocalTime curTime = LocalTime.now();
		DateTimeFormatter forDate = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		DateTimeFormatter forTime = DateTimeFormatter.ofPattern("HH:mm:ss");
		String formattedDate = curDate.format(forDate);
		String formattedTime = curTime.format(forTime);
		 
	    Menu myMenu = new Menu("Menu");
	    CustomMenuItem item1 = new CustomMenuItem(new Label("Current Date"));
	    CustomMenuItem item2 = new CustomMenuItem(new Label("Print Log"));
	    CustomMenuItem item3 = new CustomMenuItem(new Label("Change background"));
	    CustomMenuItem item4 = new CustomMenuItem(new Label("Exit Program"));
	    
	    myMenu.getItems().add(item1);
	    myMenu.getItems().add(item2);
	    myMenu.getItems().add(item3);
	    myMenu.getItems().add(item4);
	    
        MenuBar topBar = new MenuBar();

        topBar.getMenus().add(myMenu);
        
        TextField myText = new TextField("Welcome.");
        myText.setEditable(true);
        myText.setPrefColumnCount(35);
        
        VBox vbox = new VBox(topBar);
        HBox hbox = new HBox(myText);
        vbox.getChildren().add(hbox);
        Scene myScene = new Scene(vbox, 400, 200);
        
        item1.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                myText.setText("Today is " + formattedDate + " and the time is " + formattedTime + ".");
               
                
            }
        });
        
        item2.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                try {
            	FileOutputStream exportStream = new FileOutputStream("/Users/krist/Documents/Log.txt");
                PrintWriter myWriter = new PrintWriter(exportStream);               
                myWriter.print(myText.getText());
                myWriter.close();
                Alert alert = new Alert(AlertType.INFORMATION, "Log generated.");
                alert.showAndWait();
                } catch (IOException e) {
                	Alert alert = new Alert(AlertType.INFORMATION, "Failed to export.");
                    alert.showAndWait();
				}
            }
        });
        
        item3.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            	Random rand = new Random();
        		int g = rand.nextInt(250);
				vbox.setStyle("-fx-background-color:rgb(" + 0 + "," + g + "," + 0 + ")");
				myText.setText("RGB Code: 0," + g +",0");            }
        });
        
        item4.setOnAction((EventHandler<ActionEvent>) new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
            	 Platform.exit();
            }
        });
        
        
	    primaryStage.setScene(myScene);
	    primaryStage.setTitle("Grid & Pane");
	    primaryStage.show();
	    
	    }
 
	    public static void main(String[] args) throws IOException {
	        launch(args);
	    }
	    
	   
	}

