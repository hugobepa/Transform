/*
 * // Create a Translation
Translate translate = new Translate(100, 40);

// Apply a Translation on Rectangle1 using the transforms sequence
rectangle1.getTransforms().addAll(translate);

// Apply a Translation on Rectangle2 using the transforms sequence
rectangle2.getTransforms().addAll(translate);
rectangle2.setOpacity(0.5);

// Apply a Translation on Rectangle3 using the transforms sequence
rectangle3.getTransforms().addAll(translate);
rectangle3.setOpacity(0.5);

//Apply Transformations to Rectangle2
rectangle2.setTranslateX(100);
rectangle2.setTranslateY(0);
rectangle2.setRotate(30);
rectangle2.setScaleX(1.2);
rectangle2.setScaleY(1.2);

// Apply Transformation to Rectangle3
rectangle3.getTransforms().addAll(new Scale(1.2, 1.2, 50, 25),
		new Rotate(30, 50, 25),new Translate(100, 0));
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
import javafx.scene.transform.Rotate;
import javafx.scene.transform.Scale;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;

public class FxTransformationExample5 extends Application
{
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) 
	{
		// Create the Rectangles
		Rectangle rectangle1 = new Rectangle(150, 100, Color.LIGHTGRAY);
		rectangle1.setStroke(Color.BLACK);
		Rectangle rectangle2 = new Rectangle(150, 100, Color.LIGHTBLUE);
		rectangle2.setStroke(Color.BLACK);
		Rectangle rectangle3 = new Rectangle(150, 100, Color.LIGHTCYAN);
		rectangle3.setStroke(Color.BLACK);
	
		// Create a Translation
		Translate translate = new Translate(100, 40);

		// Apply a Translation on Rectangle1 using the transforms sequence
		rectangle1.getTransforms().addAll(translate);
		
		// Apply a Translation on Rectangle2 using the transforms sequence
		rectangle2.getTransforms().addAll(translate);
		rectangle2.setOpacity(0.5);

		// Apply a Translation on Rectangle3 using the transforms sequence
		rectangle3.getTransforms().addAll(translate);
		rectangle3.setOpacity(0.5);
		
		//Apply Transformations to Rectangle2
		rectangle2.setTranslateX(100);
		rectangle2.setTranslateY(0);
		rectangle2.setRotate(30);
		rectangle2.setScaleX(1.2);
		rectangle2.setScaleY(1.2);
		
		// Apply Transformation to Rectangle3
		rectangle3.getTransforms().addAll(new Scale(1.2, 1.2, 50, 25),
				new Rotate(30, 50, 25),new Translate(100, 0));

		// Create the Pane
		Pane root = new Pane();
		// Set the size of the Pane
		root.setPrefSize(400, 300);
		// Add the Children to the Pane
		root.getChildren().addAll(rectangle1, rectangle2, rectangle3);
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
		stage.setTitle("A Multiple Transformations Example");
		// Display the Stage
		stage.show();		
	}
}

