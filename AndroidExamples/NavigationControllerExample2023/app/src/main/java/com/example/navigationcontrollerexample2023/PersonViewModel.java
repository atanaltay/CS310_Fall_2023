package com.example.navigationcontrollerexample2023;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PersonViewModel extends ViewModel {


    MutableLiveData<Person> personData =
            new MutableLiveData<>();


    public MutableLiveData<Person> getPersonData() {
        return personData;
    }

    public void setPersonData(Person p) {
        this.personData.setValue(p);
    }
}
