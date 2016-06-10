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
import javafx.scene.transform.Shear;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class FxTransformationExample4 extends Application
{
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) 
	{
		// Create the Rectangles		
		Rectangle rectangle1 = new Rectangle(200, 100, Color.LIGHTGRAY);
		rectangle1.setStroke(Color.BLACK);
		Rectangle rectangle2 = new Rectangle(200, 100, Color.LIGHTGREEN);
		rectangle2.setStroke(Color.BLACK);
		
		// Create a Translation
		Translate translate = new Translate(100, 30);

		// Apply a Translation on Rectangle1 using the transforms sequence
		rectangle1.getTransforms().addAll(translate);
		
		// Apply a Translation on Rectangle2 using the transforms sequence
		rectangle2.getTransforms().addAll(translate);
		rectangle2.setOpacity(0.5);

		// Apply a Shear on Rectangle2
		Shear shear = new Shear(0.5, 0.5);
		rectangle2.getTransforms().addAll(shear);

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
		stage.setTitle("A Shear Transformation Example");
		// Display the Stage
		stage.show();
	}
}
