module me.loule.librarian {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens me.loule.librarian to javafx.fxml;
    exports me.loule.librarian;

    opens me.loule.librarian.controller to javafx.fxml;
    exports me.loule.librarian.controller;

    // opens me.loule.librarian.model to javafx.fxml;
    // exports me.loule.librarian.model;
}