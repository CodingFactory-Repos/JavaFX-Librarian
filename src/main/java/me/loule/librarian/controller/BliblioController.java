package me.loule.librarian.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
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
        ObservableList<User> list = FXCollections.observableArrayList(
                new User("fre","frnuynfre","gkidg","frazfe","frfiujev","vvhjjhngr"),
                new User("frfee","frfnhfre","g,idg","ferfe","frpkfev","vvhhgvgr"),
                new User("frvee","frdvgfre","gdnujg","rfrfe","frfpoev","vvhfcdvgr"),
                new User("frsvre","ffbfrfre","gbthdg","ftrfe","frfooiev","vvdcfhgr"),
                new User("frbtre","frfre","gdgfrg","fryufe","frfoiev","vvhdcfdgr"),
                new User("frvre","fryjukfre","gdxedg","fuirfe","froifev","vvhxwsgr")


        );


        @Override
        public void initialize(URL url, ResourceBundle resourceBundle) {
                ColumnTitre.setCellValueFactory(new PropertyValueFactory<User, String>("ColumnTitre"));
                ColumnResume.setCellValueFactory(new PropertyValueFactory<User, String>("ColumnResume"));
                ColumnRangee.setCellValueFactory(new PropertyValueFactory<User, String>("ColumnRangee"));
                ColumnParution.setCellValueFactory(new PropertyValueFactory<User, String>("ColumnParution"));
                ColumnColonne.setCellValueFactory(new PropertyValueFactory<User, String>("ColumnColonne"));
                ColumnAuteur.setCellValueFactory(new PropertyValueFactory<User, String>("ColumnAuteur"));


                TableTableau.setItems(list);
        }
}