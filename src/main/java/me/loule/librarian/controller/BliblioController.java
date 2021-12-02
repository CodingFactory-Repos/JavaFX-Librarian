package me.loule.librarian.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import me.loule.librarian.module.User;

import java.net.URL;
import java.util.ResourceBundle;

public class BliblioController implements Initializable {

        @FXML
        private TableColumn<User, String> ColumnAuteur;

        @FXML
        private TableColumn<User, String> ColumnColonne;

        @FXML
        private TableColumn<User, String> ColumnParution;

        @FXML
        private TableColumn<User, String> ColumnRangee;

        @FXML
        private TableColumn<User, String> ColumnResume;

        @FXML
        private TableColumn<User, String> ColumnTitre;

        @FXML
        private MenuItem Fichier;

        @FXML
        private MenuItem Quitter;

        @FXML
        private Button Supprimer;

        @FXML
        private TableView <User> TableTableau;

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
                ColumnTitre.setCellValueFactory(new PropertyValueFactory<User, String>("Titre"));
                ColumnResume.setCellValueFactory(new PropertyValueFactory<User, String>("Resume"));
                ColumnRangee.setCellValueFactory(new PropertyValueFactory<User, String>("Rangee"));
                ColumnParution.setCellValueFactory(new PropertyValueFactory<User, String>("Parution"));
                ColumnColonne.setCellValueFactory(new PropertyValueFactory<User, String>("Colonne"));
                ColumnAuteur.setCellValueFactory(new PropertyValueFactory<User, String>("Auteur"));



        }

        @FXML
        void submit(ActionEvent event) {
                User user = new User(txtAuteur.getText(),
                        (txtColonne.getText()),
                        (txtResume.getText()),
                        (txtParution.getText()),
                        (txtRangee.getText()),
                        (txtTitre.getText()));
                ObservableList<User> users = TableTableau.getItems();
                users.add(user);
                TableTableau.setItems(users);
        }

        @FXML
        void removeUser(ActionEvent event){
                int selectedID = TableTableau.getSelectionModel().getSelectedIndex();
                TableTableau.getItems().remove(selectedID);
        }








}
