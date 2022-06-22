package Bai7;

public class Teacher {
    private String name;
    private int age;
    private String hometown;
    private int id;
    private double salary;
    private double bonus;
    private double penalty;
    private double finalIncome;

    public Teacher() {
    }

    public Teacher(String name, int age, String hometown, int id, double salary, double bonus, double penalty, double finalIncome) {
        this.name = name;
        this.age = age;
        this.hometown = hometown;
        this.id = id;
        this.salary = salary;
        this.bonus = bonus;
        this.penalty = penalty;
        this.finalIncome = finalIncome;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHometown() {
        return hometown;
    }

    public void setHometown(String hometown) {
        this.hometown = hometown;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getPenalty() {
        return penalty;
    }

    public void setPenalty(double penalty) {
        this.penalty = penalty;
    }

    public double getFinalIncome() {
        return finalIncome;
    }

    public void setFinalIncome(double finalIncome) {
        this.finalIncome = finalIncome;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", hometown='" + hometown + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", bonus=" + bonus +
                ", penalty=" + penalty +
                ", finalIncome=" + finalIncome +
                '}';
    }
}
