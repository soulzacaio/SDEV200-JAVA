import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class MainSceneController
{

    @FXML
    private ImageView Canada;

    Image canImg = new Image(getClass().getResourceAsStream("ca.gif"));

    @FXML
    private ImageView China;
    Image chiImg = new Image(getClass().getResourceAsStream("china.gif"));

    @FXML
    private ImageView UK;
    Image UKImg = new Image(getClass().getResourceAsStream("uk.gif"));

    @FXML
    private ImageView USA;
    Image USImg = new Image(getClass().getResourceAsStream("us.gif"));

}
