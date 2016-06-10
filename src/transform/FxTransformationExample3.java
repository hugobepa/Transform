/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transform;

/**
 *
 * @author hugo
 */
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class FxTransformationExample3 extends Application
{
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) 
	{
		// Create the Rectangles
		Rectangle rectangle1 = new Rectangle(200, 150, Color.LIGHTGRAY);
		rectangle1.setStroke(Color.BLACK);
		rectangle1.setOpacity(0.5);
		Rectangle rectangle2 = new Rectangle(200, 150, Color.GREEN);
		rectangle2.setStroke(Color.BLACK);

		// Create the Translations
		Translate translate1 = new Translate(200, 100);
		Translate translate2 = new Translate(100, 50);

		// Apply a Translation on Rectangle1
		rectangle1.getTransforms().addAll(translate2);
		
		// Apply a Translation on Rectangle2
		rectangle2.getTransforms().addAll(translate1);
		
		// Apply a Scale on Rectangle
		rectangle2.setScaleX(0.5);
		rectangle2.setScaleY(0.5);

		// Create the Pane
		Pane root = new Pane(rectangle1, rectangle2);
		// Set the size of the Pane
		root.setPrefSize(400, 300);
		// Set the Style-properties of the Pane
		root.setStyle("-fx-padding: 10;" +
				"-fx-border-style: solid inside;" +
				"-fx-border-width: 2;" +
				"-fx-border-insets: 5;" +
				"-fx-border-radius: 5;" +
				"-fx-border-color: blue;");
		
		// Create the Scene
		Scene scene = new Scene(root);
		// Add the Scene to the Stage
		stage.setScene(scene);
		// Set the Title of the Stage
		stage.setTitle("A Scale Transformation Example");
		// Display the Stage
		stage.show();
	}
}
