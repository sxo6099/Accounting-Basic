/**
 * Created by Shane on 8/1/2017.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Observable;
import java.util.Observer;

public class GUImain extends Application {

    private BorderPane borderPane;
    private VBox test;

    public void start(Stage stage) {

        test = new VBox();
        //populate test with buttons
        for (int i = 0; i < 10; i++) {
            Button b = new Button(Integer.toString(i));
            b.setOnAction(new EventHandler<ActionEvent>() {
                @Override
                public void handle(ActionEvent event) {
                    int next = Integer.parseInt(b.getText());
                    b.setText(Integer.toString(next));
                }
            });
            test.getChildren().add(b);
        }


        Scene scene = new Scene(test, 1000, 1000);

        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();
    }
}