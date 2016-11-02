import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    public static Stage pa;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root;
        pa = primaryStage;
        root = FXMLLoader.load(getClass().getResource("Num.fxml"));
        pa.setTitle("NumReader");
        pa.setResizable(false);
        pa.setScene(new Scene(root, pa.getWidth(), pa.getHeight()));
        pa.show();

    }


}
