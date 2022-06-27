module com.kevin.javafxdemo2 {
    requires javafx.controls;
    requires javafx.fxml;
    requires kotlin.stdlib;


    opens com.kevin.javafxdemo2 to javafx.fxml;
    exports com.kevin.javafxdemo2;
}