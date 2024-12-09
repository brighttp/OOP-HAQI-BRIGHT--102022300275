import java.io.IOException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

public class LoginController {

    @FXML
    private PasswordField passwordPF;

    @FXML
    private TextField usernameTF;

    @FXML
    void loginBT(ActionEvent event) throws IOException {
        String username = usernameTF.getText();
        String password = passwordPF.getText();

        Parent InventoryController = FXMLLoader.load(getClass().getResource("ListeningBarMain.fxml"));
        Scene InventoryScene = new Scene(InventoryController);
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        
        if (username.equals("Admin") && password.equals("123")) {
            stage.setScene(InventoryScene);
            stage.show();
        } else {
            Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Username atau password salah");
            alert.setContentText("Silahkan cek kembali username dan password anda");
            alert.showAndWait();
        }
    }

}
