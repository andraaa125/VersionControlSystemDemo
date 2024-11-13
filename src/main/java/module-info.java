module org.example.versioncontrolsystemdemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.versioncontrolsystemdemo to javafx.fxml;
    exports org.example.versioncontrolsystemdemo;
}