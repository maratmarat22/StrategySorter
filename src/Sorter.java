import java.util.List;

public class Sorter {

    private SortStrategy strategy;

    public Sorter(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(SortStrategy strategy) {
        this.strategy = strategy;
    }

    public void sortPeople(List<Person> people) {
        strategy.sort(people);
    }
}
