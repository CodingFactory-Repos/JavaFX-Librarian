module me.loule.librarian {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.librarian to javafx.fxml;
    exports me.loule.librarian;
}