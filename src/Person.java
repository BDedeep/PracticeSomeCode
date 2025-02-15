import java.security.PublicKey;
import java.sql.SQLOutput;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static class Encapsulation {
        public static void main(String[] args) {
            Person p1 = new Person("John", 24);

            p1.show();
            p1.setName("kiran");
            p1.setAge(27);

            System.out.println(p1.getName() + " " + p1.getAge());
            p1.setAge(-40);
        }
    }
}
