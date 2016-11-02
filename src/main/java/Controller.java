import javafx.fxml.FXML;

import java.awt.*;
import java.io.IOException;
import java.net.URISyntaxException;

public class Controller extends Component {

    @FXML
    public javafx.scene.control.TextArea areaTxt;

    @FXML
    public javafx.scene.control.TextArea areaConvert;

    @FXML
    public javafx.scene.control.TextArea areaConvert2;

    @FXML
    public javafx.scene.control.TextArea areaDataTest;


    public void onClickConvert() throws IOException {

        String txt = areaTxt.getText();
        areaConvert2.setText(JobConvert.numToTxt(txt));
        areaConvert.setText(JobConvert.infoPart());

    }

    public void onClickTest() throws IOException, URISyntaxException {

        areaDataTest.setText(DataTest.startTest("test.xls"));

    }

}

