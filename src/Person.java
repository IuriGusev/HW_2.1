public class Person {
    private String name;
    private String surname;

    public Person (String name, String surname){
        this.name = name;
        this.surname = surname; }

    public String getName(String ilya) { return this.name; }

    public String getSurname(String lagutenko) { return this.surname; }

    @Override
    public String toString() { return name + surname; }
}

