package net.wermann.subviewmodeldemo.viewmodels;

import javafx.collections.ObservableList;
import net.wermann.subviewmodeldemo.models.PersonModel;

public class MainViewModel {
    private PersonModel model;

    public MainViewModel() {
        model = new PersonModel();
    }

    public ObservableList<String> getPersonList() {
        return model.getPersonList();
    }

    public void addPerson(String person) {
        model.addPerson(person);
    }

    public void printPerson(String selectedPerson) {
        System.out.println("Selected Person: " + selectedPerson);
    }

    public void deletePerson(String selectedPerson) {
        model.deletePerson(selectedPerson);
    }
}
