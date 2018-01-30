
import static java.awt.Color.blue;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 2701faiqbal
 */
public class PaneDemo extends Application   {

    @Override
    public void start(Stage stage)  {
        Button buttonOK = new Button("OK");
        Text text = new Text("THIS IS TEXT");
        text.setFill(Color.BLUE);
        TextField textField = new TextField();
        //        
        FlowPane pane = new FlowPane(buttonOK);
        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.show();
        
    }
    
    public static void main(String[] args) {
        Application.launch(args);
    
    }
}
