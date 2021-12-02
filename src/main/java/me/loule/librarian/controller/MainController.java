package me.loule.librarian.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class MainController {

    @FXML
    private MenuItem Fichier;

    @FXML
    private MenuItem Quitter;

    @FXML
    private Button Supprimer;

    @FXML
    private TableView<?> Tableau;

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

}
