module net.wermann.subviewmodeldemo {
    requires javafx.controls;
    requires javafx.fxml;


    opens net.wermann.subviewmodeldemo.controller to javafx.fxml;
    opens net.wermann.subviewmodeldemo.viewmodels to javafx.fxml;
    opens net.wermann.subviewmodeldemo.models to javafx.fxml;
    exports net.wermann.subviewmodeldemo;
}