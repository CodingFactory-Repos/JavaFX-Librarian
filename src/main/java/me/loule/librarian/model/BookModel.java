package me.loule.librarian.model;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class BookModel {

    private SimpleStringProperty tableColumTitle;
    private SimpleStringProperty tableColumAuthor;
    private SimpleStringProperty tableColumSummary;
    private SimpleIntegerProperty tableColumColumn;
    private SimpleIntegerProperty tableColumRow;
    private SimpleIntegerProperty tableColumParution;

    public BookModel(String title, String author, String summary, int column, int row, int parution) {
        this.tableColumTitle = new SimpleStringProperty(title);
        this.tableColumAuthor = new SimpleStringProperty(author);
        this.tableColumSummary = new SimpleStringProperty(summary);
        this.tableColumColumn = new SimpleIntegerProperty(column);
        this.tableColumRow = new SimpleIntegerProperty(row);
        this.tableColumParution = new SimpleIntegerProperty(parution);
    }

    public String getTableColumTitle() {
        return tableColumTitle.get();
    }

    public SimpleStringProperty tableColumTitleProperty() {
        return tableColumTitle;
    }

    public void setTableColumTitle(String tableColumTitle) {
        this.tableColumTitle.set(tableColumTitle);
    }

    public String getTableColumAuthor() {
        return tableColumAuthor.get();
    }

    public SimpleStringProperty tableColumAuthorProperty() {
        return tableColumAuthor;
    }

    public void setTableColumAuthor(String tableColumAuthor) {
        this.tableColumAuthor.set(tableColumAuthor);
    }

    public String getTableColumSummary() {
        return tableColumSummary.get();
    }

    public SimpleStringProperty tableColumSummaryProperty() {
        return tableColumSummary;
    }

    public void setTableColumSummary(String tableColumSummary) {
        this.tableColumSummary.set(tableColumSummary);
    }

    public int getTableColumColumn() {
        return tableColumColumn.get();
    }

    public SimpleIntegerProperty tableColumColumnProperty() {
        return tableColumColumn;
    }

    public void setTableColumColumn(int tableColumColumn) {
        this.tableColumColumn.set(tableColumColumn);
    }

    public int getTableColumRow() {
        return tableColumRow.get();
    }

    public SimpleIntegerProperty tableColumRowProperty() {
        return tableColumRow;
    }

    public void setTableColumRow(int tableColumRow) {
        this.tableColumRow.set(tableColumRow);
    }

    public int getTableColumParution() {
        return tableColumParution.get();
    }

    public SimpleIntegerProperty tableColumParutionProperty() {
        return tableColumParution;
    }

    public void setTableColumParution(int tableColumParution) {
        this.tableColumParution.set(tableColumParution);
    }
}