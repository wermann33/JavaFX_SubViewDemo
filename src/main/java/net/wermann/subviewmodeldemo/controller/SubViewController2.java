package net.wermann.subviewmodeldemo.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import net.wermann.subviewmodeldemo.viewmodels.MainViewModel;

import java.net.URL;
import java.util.ResourceBundle;

public class SubViewController2 implements Initializable {
    @FXML
    private ListView<String> personListView2;
    @FXML
    private TextField personNameField2;

    private MainViewModel viewModel;

    public void addPerson() {
        String name = personNameField2.getText().trim();
        if (!name.isEmpty()) {
            viewModel.addPerson(name);
            personNameField2.clear();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        viewModel = new MainViewModel();
        personListView2.setItems(viewModel.getPersonList());
    }

    public void deletePerson(ActionEvent actionEvent) {
        String selectedPerson = personListView2.getSelectionModel().getSelectedItem();
        if (selectedPerson != null) {
            viewModel.deletePerson(selectedPerson);
        }
    }
}