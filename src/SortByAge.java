import java.util.List;
import java.util.Comparator;

public class SortByAge implements SortStrategy {

    @Override
    public void sort(List<Person> people) {
        people.sort(Comparator.comparingInt(Person::getAge));
    }
}
