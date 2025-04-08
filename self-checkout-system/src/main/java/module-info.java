module com.example.scs {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.scs to javafx.fxml;
    exports com.example.scs;
}