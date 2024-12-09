import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class InventoryController {

    @FXML
    private TableColumn<Album, String> albumNameColumn;

    @FXML
    private TableView<Album> albumTBL;

    @FXML
    private TableColumn<Album, String> artistColumn;

    @FXML
    private TableColumn<Album, Integer> availableColumn;

    @FXML
    private TableColumn<Album, Integer> totalColumn;

    @FXML
    private TextField judulAlbumTF;

    @FXML
    private TextField jumlahRentedTF;

    @FXML
    private TextField jumlahTotalTF;

    @FXML
    private TextField namaArtisTF;

    private ObservableList<Album> albumList;

    @FXML
    public void initialize() {
        // Initialize TableView columns
        albumNameColumn.setCellValueFactory(new PropertyValueFactory<>("albumName"));
        artistColumn.setCellValueFactory(new PropertyValueFactory<>("artist"));
        availableColumn.setCellValueFactory(new PropertyValueFactory<>("available"));
        totalColumn.setCellValueFactory(new PropertyValueFactory<>("total"));

        // Initialize album list
        albumList = FXCollections.observableArrayList();
        albumTBL.setItems(albumList);
    }

    @FXML
    void tambahBT(ActionEvent event) {
        try {
            String albumName = judulAlbumTF.getText();
            String artist = namaArtisTF.getText();
            int total = Integer.parseInt(jumlahTotalTF.getText());
            int rented = Integer.parseInt(jumlahRentedTF.getText());

            if (rented > total) {
                showAlert(Alert.AlertType.ERROR, "Input Error", "Rented albums cannot exceed total albums.");
                return;
            }

            int available = total - rented;

            // Add new album to the list
            Album newAlbum = new Album(albumName, artist, total, available, rented);
            albumList.add(newAlbum);

            // Clear text fields
            clearTextFields();

            // Show success alert
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album added successfully!");
        } catch (NumberFormatException e) {
            showAlert(Alert.AlertType.ERROR, "Input Error", "Please enter valid numbers for total and rented.");
        }
    }

    @FXML
    void hapusBT(ActionEvent event) {
        Album selectedAlbum = albumTBL.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            albumList.remove(selectedAlbum);
            showAlert(Alert.AlertType.INFORMATION, "Success", "Album removed successfully!");
        } else {
            showAlert(Alert.AlertType.ERROR, "Selection Error", "Please select an album to delete.");
        }
    }

    @FXML
    void updateBT(ActionEvent event) {
        Album selectedAlbum = albumTBL.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            try {
                selectedAlbum.setAlbumName(judulAlbumTF.getText());
                selectedAlbum.setArtist(namaArtisTF.getText());
                int total = Integer.parseInt(jumlahTotalTF.getText());
                int rented = Integer.parseInt(jumlahRentedTF.getText());

                if (rented > total) {
                    showAlert(Alert.AlertType.ERROR, "Input Error", "Rented albums cannot exceed total albums.");
                    return;
                }

                selectedAlbum.setTotal(total);
                selectedAlbum.setRented(rented);
                selectedAlbum.setAvailable(total - rented);

                albumTBL.refresh();
                showAlert(Alert.AlertType.INFORMATION, "Success", "Album updated successfully!");
            } catch (NumberFormatException e) {
                showAlert(Alert.AlertType.ERROR, "Input Error", "Please enter valid numbers for total and rented.");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Selection Error", "Please select an album to update.");
        }
    }

    @FXML
    void rentBT(ActionEvent event) {
        Album selectedAlbum = albumTBL.getSelectionModel().getSelectedItem();
        if (selectedAlbum != null) {
            if (selectedAlbum.getAvailable() > 0) {
                selectedAlbum.setRented(selectedAlbum.getRented() + 1);
                selectedAlbum.setAvailable(selectedAlbum.getAvailable() - 1);
                albumTBL.refresh();
                showAlert(Alert.AlertType.INFORMATION, "Success", "Album rented successfully!");
            } else {
                showAlert(Alert.AlertType.ERROR, "Rent Error", "No available albums to rent.");
            }
        } else {
            showAlert(Alert.AlertType.ERROR, "Selection Error", "Please select an album to rent.");
        }
    }

    private void showAlert(Alert.AlertType alertType, String title, String message) {
        Alert alert = new Alert(alertType);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(message);
        alert.showAndWait();
    }

    private void clearTextFields() {
        judulAlbumTF.clear();
        namaArtisTF.clear();
        jumlahTotalTF.clear();
        jumlahRentedTF.clear();
    }
}
