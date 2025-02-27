module a213.feb27 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens a213.feb27 to javafx.fxml;
    exports a213.feb27;
}