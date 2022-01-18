public class User2 implements Comparable <User2>{
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
    public int compareTo(User2 o) {
        return salary;
    }
}
