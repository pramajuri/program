package pemro.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;


public class MotorController {

    DBConn dbConn = new DBConn();

    @FXML
    private TableColumn<?, ?> hargaKolum;

    @FXML
    private TableColumn<?, ?> idKolom;

    @FXML
    private TableColumn<?, ?> jenisKolom;

    @FXML
    private TableColumn<?, ?> merkKolum;

    @FXML
    private TableColumn<?, ?> nopolKolum;

    @FXML
    private TableView<?> tblMotor;

    @FXML
    private TextField textHarga;

    @FXML
    private TextField textID;

    @FXML
    private TextField textJenis;

    @FXML
    private TextField textMerk;

    @FXML
    private TextField textNopol;

    @FXML
    void hapusAction(ActionEvent event) {

    }

    @FXML
    void keluarAction(ActionEvent event) {

    }

    @FXML
    void simpanAction(ActionEvent event) {
       dbConn.saveDB(textMerk.getText(), textJenis.getText(), textNopol.getText(), Integer.parseInt(textHarga.getText()));
    }

    @FXML
    void ubahAction(ActionEvent event) {

    }
}
