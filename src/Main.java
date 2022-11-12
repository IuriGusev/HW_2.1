import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //Task 1
        // Присвоение значения переменной примитивного типа int 33. Измененяем значение переменной внутри метода ниже на 22.
        // При выводе на "печать" изменения значения на 22 не происходит, так как изменение проиходится за пределами main.
        // для присвоения нового значения следовало бы переменной присвоить значение метода changeValue (value);
        int value = 33;
        changeValue (value);
        System.out.println(value);

        //Task 2
        // Присвоение значения переменной ссылочного типа Interger 33. Измененяем значение внутри метода ниже на 22.
        // При выводе на "печать" изменения значения на 22 не происходит, так как изменение проиходится за пределами main.
        // Для присвоения нового значения следовало бы также переменной присвоить значение метода changeValue (val);
        Integer val = 33;
        changeValue (val);
        System.out.println(val);

        //Task 3
        // Присвоение значения массиву cсылочного типа Interger элементов 3 и 4. Измененяем значение массива внутри метода ниже на 1 и 2.
        // При выводе на "печать" изменения значения на 1 и 2 не происходит, так как изменение проиходится за пределами main и
        // новое значение из метода мы не используем.
        Integer [] integers = new Integer[] {3, 4};
        changeValue (integers);
        Arrays.toString(integers);
        System.out.println(Arrays.toString(integers));

        //Task 4
        // Присвоение эелементам 0 и 1 массива cсылочного типа Interger значений 3 и 4. Измененяем значение ячейки 0 массива внутри метода ниже на 99.
        // При выводе на "печать" происходит изменение значения 3 на 99, так как изменение проиходится внутри метода с реальным объектов и
        // новое значение элемента метода мы как раз и используем.
        Integer [] numbers = new Integer[] {3, 4};
        changeValue1 (numbers);
        Arrays.toString(numbers);
        System.out.println(Arrays.toString(numbers));

        //Task 5
        // Присвоение значений нового объекта класса Person. Измененяем значение объектов внутри метода ниже.
        // При выводе на "печать" изменения значения объектов не происходит, так как новое значение не используется.
        Person person = new Person ("Lyapis", "Trubetskoy");
        changePerson (person);
        System.out.println(person);

        // Task 6
        // Присвоение значения объектам класса Person. Измененяем значение объектов внутри метода ниже.
        // При выводе на "печать" изменения значения объектов происходит, так как новое значение уже используется в результате
        // изменения объекта по ссылке и использования сеттеров.
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
        person.setName("Ilya");
        person.setSurname ("Lagutenko"); }
}