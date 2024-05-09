public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("John", 30);
        Person person2 = new Person("John", 30);
        Person person3 = new Person("Alice", 25);

        System.out.println("Person1: " + person1);
        System.out.println("Person2: " + person2);
        System.out.println("Person3: " + person3);

        System.out.println("Person1 equals Person2: " + person1.equals(person2));
        System.out.println("Person1 equals Person3: " + person1.equals(person3));
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Person)) return false;
        Person other = (Person) obj;
        return this.age == other.age && this.name.equals(other.name);
    }

    public String toString() {
        return "Person{name='" + name + "', age=" + age + '}';
    }
}