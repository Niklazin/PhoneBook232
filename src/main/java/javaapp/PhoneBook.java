package javaapp;

import asg.cliche.Command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by javacourses on 15.03.2017..
 */
public class PhoneBook {
    private List<Record> recordList = new ArrayList<>();

    @Command
    public void create(String name, String phone, String email, String phones) {


        Record r = new Record();
        r.setName(name);
        r.setPhone(phone);
        r.setEmail(email);

        recordList.add(r);

    }

    @Command
    public List<Record> list() {
        return recordList;
    }

    @Command
    public void addPhone(int id, String phone) {
        for (Record r : recordList) {
            if (r.getId() == id) ;
            {
                r.addPhones(phone);
                break;
            }


        }
    }
}
