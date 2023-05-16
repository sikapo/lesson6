package phonebook;

public class Record {
    private String contactName;
    private String phoneNumber;

    public Record(String name, String number) {
        this.contactName = name;
        this.phoneNumber = number;
    }

    public String getContactName() {
        return contactName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

}
