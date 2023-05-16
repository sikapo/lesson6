import phonebook.Phonebook;
import phonebook.Record;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add(new Record("Victor", "5345345"));
        phonebook.add(new Record("Vano", "383889"));
        phonebook.add(new Record("Daniil", "6637364"));
        phonebook.add(new Record("Sergey", "73854"));
        phonebook.add(new Record("Victor", "37573"));
        phonebook.add(new Record("Gleb", "2893"));
        phonebook.add(new Record("Sasha", "4574845"));
        phonebook.add(new Record("Den", "548434643"));
        phonebook.add(new Record("DEN", "36346347"));

        Record record = phonebook.find("DEN");
        if (record!=null) {
            System.out.println(record.getContactName() + ": " + record.getPhoneNumber());
        }
        else System.out.println("Contact not found");
    }

}