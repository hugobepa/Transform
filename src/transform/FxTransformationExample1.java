/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package transform;

/**
 *https://examples.javacodegeeks.com/desktop-java/javafx/javafx-transformation-example/?utm_source=dlvr.it&utm_medium=twitter
 *http://zetcode.com/gui/javafx/events/
 * https://books.google.es/books?id=Wb8ICAAAQBAJ&pg=PA288&lpg=PA288&dq=rect+setOnMouseClicked&source=bl&ots=_8hETIg30_&sig=P8wPxaGglBxFxVWpkleDH2RFaK8&hl=es&sa=X&ved=0ahUKEwjNiqiQxp3NAhUJXRoKHTRPAXoQ6AEIQjAD#v=onepage&q=rect%20setOnMouseClicked&f=false
 * @author hugo
 */

import java.beans.EventHandler;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.transform.Translate;
import javafx.stage.Stage;
import javafx.scene.input.MouseEvent;

public class FxTransformationExample1 extends Application
{
    Rectangle rectangle1 = new Rectangle(100, 50, Color.LIGHTGRAY);
	public static void main(String[] args) 
	{
		Application.launch(args);
	}
	
	@Override
	public void start(Stage stage) 
	{
		// Create the Rectangles
		
		rectangle1.setStroke(Color.BLACK);
		Rectangle rectangle2 = new Rectangle(100, 100, Color.YELLOW);
		rectangle2.setStroke(Color.BLACK);
		Rectangle rectangle3 = new Rectangle(180, 100, Color.STEELBLUE);
		rectangle3.setStroke(Color.BLACK);
		
		// Apply a Translation on Rectangle1 using the transforms sequence
		Translate translate1 = new Translate(50, 40);
		rectangle1.getTransforms().addAll(translate1);
                //crear evento al apretar click
               rectangle1.setOnMouseClicked(e->handleMouseClicked(e));
		
        
              
          
     
		// Apply a Translation on Rectangle2 using the transforms sequence
		Translate translate2 = new Translate(100, 80);
		rectangle2.getTransforms().addAll(translate2);

		// Apply a Translation on Rectangle3 using the translateX and translateY proeprties
		rectangle3.setTranslateX(180);
		rectangle3.setTranslateY(70);
		
		// Create the Pane
		Pane root = new Pane(rectangle1, rectangle2, rectangle3);
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
		// Set the title of the Stage
		stage.setTitle("A Translation Transformation Example");
		// Display the Stage
		stage.show();		

    
	}
        //damos accion  evento
    private void handleMouseClicked(MouseEvent e) {
       rectangle1.setStroke(Color.RED);
    }
}

