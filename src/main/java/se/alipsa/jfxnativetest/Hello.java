package se.alipsa.jfxnativetest;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Hello extends Application {

  public static void main(String[] args) {
    launch(args);
  }

  @Override
  public void start(Stage stage) {
    BorderPane root = new BorderPane();
    Label label = new Label("Hello world");
    root.setCenter(label);
    Scene scene = new Scene(root, 800, 600);
    stage.setTitle("Alipsa Image Oracle");
    stage.setScene(scene);
    stage.sizeToScene();
    stage.show();
  }
}
