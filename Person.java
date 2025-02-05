public class Person {
    private String name;
    private int age;
    private String gender;

    // Конструктор
    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // Метод для вывода информации о человеке
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }

    // Метод для увеличения возраста
    public void increaseAge() {
        age++;
    }

    // Метод для изменения имени
    public void changeName(String newName) {
        this.name = newName;
    }

    // Геттеры и сеттеры (опционально)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    // Основной метод для тестирования
    public static void main(String[] args) {
        Person person = new Person("Alice", 30, "Female");
        person.displayInfo();

        person.increaseAge();
        System.out.println("After increasing age:");
        person.displayInfo();

        person.changeName("Alicia");
        System.out.println("After changing name:");
        person.displayInfo();
    }
}


