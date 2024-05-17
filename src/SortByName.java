import java.util.List;
import java.util.Comparator;

public class SortByName implements SortStrategy {
    
    @Override
    public void sort(List<Person> people) {
        people.sort(Comparator.comparing(Person::getName));
    }
}
