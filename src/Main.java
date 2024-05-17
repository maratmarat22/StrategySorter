import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Charlie", 40));
        people.add(new Person("Marat", 20));
        people.add(new Person("Alice", 30));
        people.add(new Person("Artem", 20));
        people.add(new Person("Bob", 20));
        people.add(new Person("Victoria", 20));

        Sorter sorter = new Sorter(new SortByName());
        sorter.sortPeople(people);
        System.out.println("Sorted by name: " + people);

        sorter.setStrategy(new SortByAge());
        sorter.sortPeople(people);
        System.out.println("Sorted by age: " + people);
    }
}