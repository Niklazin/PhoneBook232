package javaapp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by javacourses on 15.03.2017..
 */
public class Record {
    private static int count = 0;
    private int id;
    private String name;
    private String phone;
    private String email;
    private final List<String> phones = new ArrayList<>();


    public Record() {
        count++;
        id = count;
    }

    public int getId() {
        return id;
    }

    public String getEmail() {
        return email;
    }

    public List<String> getPhones() {
        return phones;
    }

    public void addPhones(String... phones) { //Метод для добавления номеров
        this.phones.addAll(Arrays.asList(phones));

    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {

        return id + ") " + name + " " + phone + " " + email;

    }
}
