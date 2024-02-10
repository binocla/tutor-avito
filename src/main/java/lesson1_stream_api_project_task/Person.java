package lesson1_stream_api_project_task;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        setAge(age);
        setName(name);
    }

    public void setName(String name) {
        if (name.length() != 3) {
            System.out.println("Name is wrong!");
            System.exit(0);
        }
        this.name = name;
    }

    public void setAge(int age) {
        if (age < 0 || age > 110) {
            System.out.println("Возраст не актуален!");
            System.exit(0);
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

