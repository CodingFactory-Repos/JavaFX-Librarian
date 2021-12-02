package me.loule.librarian.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import me.loule.librarian.module.TableViews;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {

        @FXML
        private TableColumn<TableViews, String> ColumnAuteur;

        @FXML
        private TableColumn<TableViews, String> ColumnColonne;

        @FXML
        private TableColumn<TableViews, String> ColumnParution;

        @FXML
        private TableColumn<TableViews, String> ColumnRangee;

        @FXML
        private TableColumn<TableViews, String> ColumnResume;

        @FXML
        private TableColumn<TableViews, String> ColumnTitre;

        @FXML
        private MenuItem Fichier;

        @FXML
        private MenuItem Quitter;

        @FXML
        private Button Supprimer;

        @FXML
        private TableView<TableViews> TableTableau;

        @FXML
        private Button Valider;

        @FXML
        private TextField txtAuteur;

        @FXML
        private TextField txtColonne;

        @FXML
        private TextField txtParution;

        @FXML
        private TextField txtRangee;

        @FXML
        private TextArea txtResume;

        @FXML
        private TextField txtTitre;






    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}