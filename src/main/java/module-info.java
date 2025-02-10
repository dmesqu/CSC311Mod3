module org.example.csc311mod3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.csc311mod3 to javafx.fxml;
    exports org.example.csc311mod3;
}