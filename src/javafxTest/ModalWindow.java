package javafxTest;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ModalWindow extends Application {

   @Override
   public void start(final Stage primaryStage) {

      Button button = new Button();
      button.setText("Open a phone entry form");

      button.setOnAction(new EventHandler<ActionEvent>() {

         @Override
         public void handle(ActionEvent event) {

            Label phoneLabel = new Label("Entering new phone information");

            StackPane secondaryLayout = new StackPane();
            secondaryLayout.getChildren().add(phoneLabel);

            Scene secondScene = new Scene(secondaryLayout, 230, 100);

            // New window (Stage)
            Stage newWindow = new Stage();
            newWindow.setTitle("New Phone Entry");
            newWindow.setScene(secondScene);

            // Specifies the modality for new window.
            newWindow.initModality(Modality.WINDOW_MODAL);

            // Specifies the owner Window (parent) for new window
            newWindow.initOwner(primaryStage);

            // Set position of second window, related to primary window.
            newWindow.setX(primaryStage.getX() + 200);
            newWindow.setY(primaryStage.getY() + 100);

            newWindow.show();
         }
      });

      StackPane root = new StackPane();
      root.getChildren().add(button);

      Scene scene = new Scene(root, 450, 250);

      primaryStage.setTitle("JavaFX Open a new Window (o7planning.org)");
      primaryStage.setScene(scene);
      primaryStage.show();
   }

   public static void main(String[] args) {
      launch(args);
   }

}