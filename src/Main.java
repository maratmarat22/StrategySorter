import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        List<Person> people = new ArrayList<>();

        people.add(new Person("Charlie", 40, "Professor"));
        people.add(new Person("Marat", 20, "Bachelor"));
        people.add(new Person("Alice", 30, "Doctor"));
        people.add(new Person("Artem", 20, "Bachelor"));
        people.add(new Person("Bob", 20, "Bachelor"));
        people.add(new Person("Victoria", 20, "Bachelor"));

        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите тип сортировки");
        System.out.println("1. По возрасту");
        System.out.println("2. По имени");
        System.out.println("3. По уч. степени");
        char c = sc.next().charAt(0);

        Sorter sorter = new Sorter();

        switch (c) {
            case '1':
                sorter.setStrategy(new SortByAge());
                break;
            case '2':
                sorter.setStrategy(new SortByName());
                break;
            case '3':
                sorter.setStrategy(new SortByDegree());
                break;
            default: main(args);
        }

        sorter.sortPeople(people);
        System.out.println("Sorted by 'your choice' people: " + people);

        System.out.println();

        sorter.setStrategy(new SortByName());
        sorter.sortPeople(people);
        System.out.println("Sorted by name people: " + people);

    }
}