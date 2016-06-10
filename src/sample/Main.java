package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));

            /*Group root = new Group();

            Text txt = new Text();
            TextField nameFld = new TextField();
            Label lbl = new Label("Name: ");
            GridPane grid = new GridPane();




            Button btn = new Button();

            txt.setText("sup!");
            btn.setOnAction(event -> System.out.printf("sup  %s\n",nameFld.getText()));

            VBox box = new VBox();

            // box.getChildren().add(txt);
            //  box.getChildren().add(btn);



            txt.setFont(new Font("Papyrus",80));
            txt.setLayoutY(50);
            btn.setText("say sup!");

            //grid.setGridLinesVisible(true);
            grid.add(lbl, 0,0);
            grid.add(nameFld,1,0);
            grid.add(btn,1,1);

            grid.setHgap(20);


            box.getChildren().addAll(txt,grid);
            //root.getChildren().add(txt);
            //root.getChildren().add(btn);
            root.getChildren().add(box);
          */
        primaryStage.setTitle("Hello world App");
        primaryStage.setScene(new Scene(root, 250, 300));
        primaryStage.show();
    }


    public static void main(String[] args) {
        launch(args);
    }
}
