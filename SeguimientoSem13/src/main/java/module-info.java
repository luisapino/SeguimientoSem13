module com.example.seguimientosem13 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.seguimientosem13 to javafx.fxml;
    exports com.example.seguimientosem13;
    exports com.example.seguimientosem13.Control;
    opens com.example.seguimientosem13.Control to javafx.fxml;
}