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
    public ArrayList<Record> findAll(String name){
        ArrayList<Record> match = new ArrayList<>();
        for (Record record: contacts) {
            if (record.getContactName().equalsIgnoreCase(name)) {
                match.add(record);
            }
        }
        return match.isEmpty() ? null: match;
    }
}

