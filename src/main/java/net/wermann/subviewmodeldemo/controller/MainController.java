package net.wermann.subviewmodeldemo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import net.wermann.subviewmodeldemo.viewmodels.MainViewModel;

import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    @FXML
    private ListView<String> personListView;
    @FXML
    private TextField personNameField;

    private MainViewModel viewModel;

    public void addPerson() {
        String name = personNameField.getText().trim();
        if (!name.isEmpty()) {
            viewModel.addPerson(name);
            personNameField.clear();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        viewModel = new MainViewModel();
        personListView.setItems(viewModel.getPersonList());
    }

    public void printPerson(ActionEvent actionEvent) {
        String selectedPerson = personListView.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            viewModel.printPerson(selectedPerson);
        }
    }
}
