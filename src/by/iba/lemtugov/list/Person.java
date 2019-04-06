package by.iba.lemtugov.list;

public class Person {
    String Name;
    String Phone;
    String email;

    public Person() {
    }

    public Person(String name, String phone, String email) {
        Name = name;
        Phone = phone;
        this.email = email;
    }

    public Person(Person person) {
        Name = person.Name;
        Phone = person.Phone;
        email = person.email;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", Phone='" + Phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }


}
