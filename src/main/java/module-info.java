module org.feodal.konwerter3 {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.feodal.konwerter3 to javafx.fxml;
    exports org.feodal.konwerter3;
}