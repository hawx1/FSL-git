/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package temprature.convert;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author 2701faiqbal
 */
public abstract class DemoButton extends Application {

    @Override
    public void start(Stage stage) {
        Button b1 = new Button("1");
        Button b2 = new Button("2");
        Button b3 = new Button("3");
        HBox hbox = new HBox(b1, b2, b3);
        Text text = new Text ("Hello");
        VBox vbox = new VBox(hbox, text);
        Scene scene = new Scene(vbox);
        stage.setScene(scene);
        stage.show();
        
        
        
    }
    
        
    
}
