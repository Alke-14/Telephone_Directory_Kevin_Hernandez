import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TelephoneDirectory {
    private Map<Name, String> phoneBook;

    public TelephoneDirectory() {
        phoneBook = new HashMap<Name, String>();
    }
    public void readFile(Scanner data) {
        String firstName = "";
        String lastName = "";
        String phoneNumber = "";

        while (data.hasNext()) {
            firstName = data.next();
            lastName = data.next();
            phoneNumber = data.next();
            Name name = new Name(firstName, lastName);
            phoneBook.put(name, phoneNumber);
        }
    }

    public void writeFile(PrintWriter data) {
        for (Map.Entry<Name, String> entry : phoneBook.entrySet()) {
            data.write(entry.getKey() + " " + entry.getValue());
            data.write("\n");
        }
        data.flush();
    }
    public String getPhoneNumber(Name personName) {
        return phoneBook.get(personName);
    }
    public String getPhoneBook() {
        String listNames = "";
        for (Map.Entry<Name,String> contact: phoneBook.entrySet()) {
            String name = contact.getKey() + " " + contact.getValue();
            listNames += name + "\n";
        }
        return listNames;
    }
    public void addPhoneNumber(Name personName, String phoneNumber) {
        phoneBook.put(personName, phoneNumber);
    }
    public void removePhoneNumber(Name personName) {
        phoneBook.remove(personName);
    }
}
