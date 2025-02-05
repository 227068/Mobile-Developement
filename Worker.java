public class Worker extends Person {
    private double salary;

    // Конструктор
    public Worker(String name, int age, String gender, double salary) {
        super(name, age, gender);
        this.salary = salary;
    }

    // Метод для вывода информации о работнике
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Salary: " + salary);
    }

    // Геттер и сеттер для зарплаты
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

