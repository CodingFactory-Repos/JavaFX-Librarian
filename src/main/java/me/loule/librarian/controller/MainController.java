package me.loule.librarian.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.text.Text;
import me.loule.librarian.model.BookModel;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private TableView<BookModel> tbData;

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

    @FXML
    private TextArea textAreaSummary;

    @FXML
    private TextField textFieldAuthor;

    @FXML
    private TextField textFieldColumn;

    @FXML
    private TextField textFieldParution;

    @FXML
    private TextField textFieldRow;

    @FXML
    private TextField textFieldTitle;

    @FXML
    private Button buttonAddBook;

    @FXML
    private Button buttonDeleteBook;

    @FXML
    private Text textLogs;

    @FXML
    private MenuItem menuItemQuit;

    int lastBookSelected = -1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // Initialize the table
        tableColumTitle.setCellValueFactory(new PropertyValueFactory<>("TableColumTitle"));
        tableColumAuthor.setCellValueFactory(new PropertyValueFactory<>("TableColumAuthor"));
        tableColumSummary.setCellValueFactory(new PropertyValueFactory<>("TableColumSummary"));
        tableColumColumn.setCellValueFactory(new PropertyValueFactory<>("TableColumColumn"));
        tableColumRow.setCellValueFactory(new PropertyValueFactory<>("TableColumRow"));
        tableColumParution.setCellValueFactory(new PropertyValueFactory<>("TableColumParution"));

        tbData.setItems(BookModels); // Show defaults books

        buttonAddBook.setOnMouseClicked(event -> { // On click add a new book
            if(textFieldTitle.getText().isEmpty() || textFieldAuthor.getText().isEmpty() || textFieldParution.getText().isEmpty() || textFieldRow.getText().isEmpty() || textFieldColumn.getText().isEmpty() || textAreaSummary.getText().isEmpty()) {
                textLogs.setText("Veuillez remplir tous les champs");
            } else if(!textFieldColumn.getText().matches("[0-9]+") || !textFieldRow.getText().matches("[0-9]+") || !textFieldParution.getText().matches("[0-9]+")) {
                textLogs.setText("Veuillez remplir les champs avec des nombres");
            } else if(Integer.parseInt(textFieldRow.getText()) < 1 || Integer.parseInt(textFieldRow.getText()) > 7) {
                textLogs.setText("Veuillez remplir les champs avec des nombres entre 1 et 7");
            } else if(Integer.parseInt(textFieldColumn.getText()) < 1 || Integer.parseInt(textFieldColumn.getText()) > 5) {
                textLogs.setText("Veuillez remplir les champs avec des nombres entre 1 et 5");
            } else {
                if(lastBookSelected != -1) { // If a book is selected
                    // Edit lastBookSelected
                    BookModels.get(lastBookSelected).setTableColumTitle(textFieldTitle.getText());
                    BookModels.get(lastBookSelected).setTableColumAuthor(textFieldAuthor.getText());
                    BookModels.get(lastBookSelected).setTableColumSummary(textAreaSummary.getText());
                    BookModels.get(lastBookSelected).setTableColumColumn(Integer.parseInt(textFieldColumn.getText()));
                    BookModels.get(lastBookSelected).setTableColumRow(Integer.parseInt(textFieldRow.getText()));
                    BookModels.get(lastBookSelected).setTableColumParution(Integer.parseInt(textFieldParution.getText()));

                    // Update text
                    textLogs.setText("Le livre " + textFieldTitle.getText() +  " a bien été modifié");

                    // Reset all textFields
                    textFieldTitle.setText("");
                    textFieldAuthor.setText("");
                    textAreaSummary.setText("");
                    textFieldColumn.setText("");
                    textFieldRow.setText("");
                    textFieldParution.setText("");

                    // Reset lastBookSelected
                    lastBookSelected = -1;

                    // Show changements
                    tbData.refresh();
                } else { // If no book is selected
                    // Add a new book
                    BookModels.add(new BookModel(textFieldTitle.getText(), textFieldAuthor.getText(), textAreaSummary.getText(), Integer.parseInt(textFieldColumn.getText()), Integer.parseInt(textFieldRow.getText()), Integer.parseInt(textFieldParution.getText())));
                    textLogs.setText("Le livre " + textFieldTitle.getText() +  " a bien été créer");
                }
            }
        });

        tbData.setOnMouseClicked(event -> { // On click select a book
            // Show selected book
            BookModel selectedBook = tbData.getSelectionModel().getSelectedItem();
            textFieldTitle.setText(selectedBook.getTableColumTitle());
            textFieldAuthor.setText(selectedBook.getTableColumAuthor());
            textAreaSummary.setText(selectedBook.getTableColumSummary());
            textFieldColumn.setText(String.valueOf(selectedBook.getTableColumColumn()));
            textFieldRow.setText(String.valueOf(selectedBook.getTableColumRow()));
            textFieldParution.setText(String.valueOf(selectedBook.getTableColumParution()));

            // Get book index
            lastBookSelected = tbData.getSelectionModel().getSelectedIndex();
        });

        buttonDeleteBook.setOnMouseClicked(event -> { // On click delete a book
            if(lastBookSelected != -1) { // If a book is selected
                BookModels.remove(lastBookSelected);
                lastBookSelected = -1;
                textLogs.setText("Le livre a bien été supprimé");
            }
        });

        // On menuItemQuit click, close the application
        menuItemQuit.setOnAction(event -> {
            System.exit(0);
        });
    }

    private ObservableList<BookModel> BookModels = FXCollections.observableArrayList(
            new BookModel("Le Temps des Tempêtes", "Nicolas Sarkozy", "C'est la météo", 1, 2, 2020),
            new BookModel("La France n'a pas dit son dernier mot", "Éric Zemmour", "Dans la tête d'Eric Zemmour. Journal d'une autobiographie politique.", 1, 2, 2021),
            new BookModel("L’Avenir en commun", "Jean-Luc Melenchon", "Ce livre réunit trois discours prononcés par Jean-Luc Mélenchon, Mathilde Panot et Eric Coquerel à l’Assemblée nationale, le lundi 29 mars 2021. Il s’agissait de rejeter le projet de loi prétendument issu de la convention citoyenne pour le climat. Ce moment de débat parlementaire a été l’occasion pour Jean-Luc Mélenchon de ramasser la pensée écologique insoumise dans une prise de parole.", 1, 2, 2021)
    );

}