import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        int value = 33;
        changeValue (value);
        System.out.println(value);

        //Task 2
        Integer val = 33;
        changeValue (val);
        System.out.println(val);

        //Task 3
        Integer [] integers = new Integer[] {3, 4};
        changeValue (integers);
        Arrays.toString(integers);
        System.out.println(Arrays.toString(integers));

        //Task 4
        Integer [] numbers = new Integer[] {3, 4};
        changeValue (numbers);
        Arrays.toString(numbers);
        System.out.println(Arrays.toString(numbers));

        //Task 5
        Person person = new Person ("Lyapis", "Trubetskoy");
        changePerson (person);
        System.out.println(person);

        person = new Person ("Lyapis", "Trubetskoy");
        changePerson1 (person);
        System.out.println(person);
    }

    static int changeValue (int value) {
        value = 22;
        return value; }

    static void changeValue (Integer value) {
        value = 22; }

    static void changeValue (Integer [] value){
        value = new Integer[] {1,2}; }

    static void changeValue1 (Integer [] value){
        value[0] = 99; }

    static void changePerson (Person person) {
        person = new Person ("Ilya", "Lagutenko"); }

    static void changePerson1 (Person person) {
        person.getName ("Ilya");
        person.getSurname ("Lagutenko"); }
}