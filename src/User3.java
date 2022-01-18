import java.util.Comparator;

public class User3 implements Comparator<User3> {
    private int id;
    private int salary;
    private String name;

    public User2(int id, int salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
//    @Override
//    public int compareTo(User2 o) {
//        return 0;
//    }


    @Override
    public int compare(User3 o1, User3 o2) {
        if (o1.getSalary() > o2.getSalary()) {
            return -1;
        } else if (o1.getSalary() < o2.getSalary()) {
            return 1;
        } else
        return 0;
    }
}
