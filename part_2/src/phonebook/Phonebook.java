package phonebook;

import java.util.ArrayList;

public class Phonebook {
    ArrayList<Record> contacts = new ArrayList<>();
    public void add(Record record){
        contacts.add(record);

    }

    public Record find(String name) {

        for (Record record : contacts) {
            if (record.getContactName().equalsIgnoreCase(name)) {
                return record;
            }
        }
        return null;
    }
}

