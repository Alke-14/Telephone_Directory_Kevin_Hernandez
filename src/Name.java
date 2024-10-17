
public class Name {
    private String firstName;
    private String lastName;

    public Name(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    @Override
    public String toString() {
        String name = firstName + " " + lastName;
        return name;
    }
    @Override
    public boolean equals(Object other) {
        Name obj = (Name) other;
        return firstName.equals(obj.firstName) && lastName.equals(obj.lastName);
    }
    @Override
    public int hashCode() {
        int firstNameHash = firstName.hashCode();
        int lastNameHash = lastName.hashCode();
        return firstNameHash + lastNameHash;
    }

}
