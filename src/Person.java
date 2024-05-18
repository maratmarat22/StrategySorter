// Класс, представляющий объект, который будет сортироваться
public class Person {
    private String name;
    private int age;
    private String degree;

    public Person(String name, int age, String degree) {
        this.name = name;
        this.age = age;
        this.degree = degree;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDegree() {
        return degree;
    }

    @Override
    public String toString() {
        return "\nPerson {" +
                "name = " + name +
                ", age = " + age +
                ", degree = " + degree;
    }
}
