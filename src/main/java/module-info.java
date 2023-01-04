module com.bra.bradesktop {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.bra.bradesktop to javafx.fxml;
    exports com.bra.bradesktop;
}