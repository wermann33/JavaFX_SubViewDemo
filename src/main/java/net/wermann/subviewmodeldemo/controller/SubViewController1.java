package net.wermann.subviewmodeldemo.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import net.wermann.subviewmodeldemo.viewmodels.MainViewModel;

import java.net.URL;
import java.util.ResourceBundle;

public class SubViewController1 implements Initializable {
    @FXML
    private ListView<String> personListView1;
    @FXML
    private TextField personNameField1;

    private MainViewModel viewModel;

    public void addPerson() {
        String name = personNameField1.getText().trim();
        if (!name.isEmpty()) {
            viewModel.addPerson(name);
            personNameField1.clear();
        }
    }


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        viewModel = new MainViewModel();
        personListView1.setItems(viewModel.getPersonList());
    }
}
