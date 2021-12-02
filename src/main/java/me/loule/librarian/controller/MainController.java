package me.loule.librarian.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import me.loule.librarian.model.BookModel;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TableView<Object> tbData;

    @FXML
    public TableColumn<BookModel, Integer> tableColumTitle;

    @FXML
    public TableColumn<BookModel, String> tableColumAuthor;

    @FXML
    public TableColumn<BookModel, String> tableColumSummary;

    @FXML
    public TableColumn<BookModel, String> tableColumColumn;

    @FXML
    public TableColumn<BookModel, String> tableColumRow;

    @FXML
    public TableColumn<BookModel, String> tableColumParution;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        tableColumTitle.setCellValueFactory(new PropertyValueFactory<>("TableColumTitle"));
        tableColumAuthor.setCellValueFactory(new PropertyValueFactory<>("TableColumAuthor"));
        tableColumSummary.setCellValueFactory(new PropertyValueFactory<>("TableColumSummary"));
        tableColumColumn.setCellValueFactory(new PropertyValueFactory<>("TableColumColumn"));
        tableColumRow.setCellValueFactory(new PropertyValueFactory<>("TableColumRow"));
        tableColumParution.setCellValueFactory(new PropertyValueFactory<>("TableColumParution"));

        tbData.setItems(BookModels); // Show defaults books

        BookModels.add(new BookModel("test", "test", "test", 1, 1, 1)); // Add a new book

        BookModels.remove(0); // Remove the first book
        BookModels.remove(BookModels.size() - 1); // Remove the last book
    }

    private ObservableList<Object> BookModels = FXCollections.observableArrayList(
        new BookModel("Le Temps des Tempêtes", "Nicolas Sarkozy", "C'est la météo", 1, 2, 2020),
        new BookModel("La France n'a pas dit son dernier mot", "Éric Zemmour", "Dans la tête d'Eric Zemmour. Journal d'une autobiographie politique.", 1, 2, 2021),
        new BookModel("L’Avenir en commun", "Jean-Luc Melenchon", "Ce livre réunit trois discours prononcés par Jean-Luc Mélenchon, Mathilde Panot et Eric Coquerel à l’Assemblée nationale, le lundi 29 mars 2021. Il s’agissait de rejeter le projet de loi prétendument issu de la convention citoyenne pour le climat. Ce moment de débat parlementaire a été l’occasion pour Jean-Luc Mélenchon de ramasser la pensée écologique insoumise dans une prise de parole.", 1, 2, 2021)
    );

}