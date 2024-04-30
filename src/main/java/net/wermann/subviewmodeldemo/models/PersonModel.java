package net.wermann.subviewmodeldemo.models;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class PersonModel {
    private ObservableList<String> personList;

    public PersonModel() {
        personList = FXCollections.observableArrayList();
    }

    public ObservableList<String> getPersonList() {
        return personList;
    }

    public void addPerson(String person) {
        personList.add(person);
    }

    public void deletePerson(String selectedPerson) {
        personList.remove(selectedPerson);
    }
}
