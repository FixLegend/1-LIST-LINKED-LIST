package p;

public class TestList {
    public static void main(String[] args) {
        ListLinked<Integer> integerList = new ListLinked<>();
        integerList.insertLast(10);
        integerList.insertLast(20);
        integerList.insertLast(30);
        System.out.println("Lista de enteros:");
        System.out.println("Longitud de la lista: " + integerList.length());
        System.out.println("Elementos de la lista:");
        for (int i = 0; i < integerList.length(); i++) {
            System.out.println(integerList.get(i));
        }
        System.out.println();
        ListLinked<String> stringList = new ListLinked<>();

        System.out.println("Lista de cadenas:");
        System.out.println("Longitud de la lista: " + stringList.length());
        System.out.println("Elementos de la lista:");
        for (int i = 0; i < stringList.length(); i++) {
            System.out.println(stringList.get(i));
        }
        System.out.println();
        ListLinked<Person> personList = new ListLinked<>();
        personList.insertLast(new Person("Juan", "Perez", 30));
        personList.insertLast(new Person("Maria", "Gonzalez", 25));
        System.out.println("Lista de personas:");
        System.out.println("Longitud de la lista: " + personList.length());
        System.out.println("Elementos de la lista:");
        for (int i = 0; i < personList.length(); i++) {
            Person person = personList.get(i);
            System.out.println("Nombre: " + person.getFirstName() + ", Apellidos: " + person.getLastName() + ", Edad: " + person.getAge());
        }
    }
}
