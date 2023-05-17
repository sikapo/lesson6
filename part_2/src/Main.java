import phonebook.Phonebook;
import phonebook.Record;

import java.util.ArrayList;

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

            //for some reason i cant use both "find" & "findAll" method at the same time
//            Record record = phonebook.find("DEN");
//            if (record!=null) {
//                System.out.println(record.getContactName() + ": " + record.getPhoneNumber());
//            }
//            else System.out.println("Contact not found");
//            }


        ArrayList<Record> match = phonebook.findAll("den");
        if (match != null) {
            for (Record i : match) {
                System.out.println(i.getContactName() + ": " + i.getPhoneNumber());
            }
        } else {
            System.out.println("Contact not found");
        }
    }
}