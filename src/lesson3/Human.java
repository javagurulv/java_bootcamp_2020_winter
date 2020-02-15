package lesson3;

public class Human {

    private String name;
    private int age;
    private int codeNumber;

    public Human(String name, int age, int codeNumber) {
        this.name = name;
        this.age = age;
        this.codeNumber = codeNumber;
    }

    public void greed() {
        System.out.println("Hello, my name is " + name + ", I'm " + age + " years old...");
    }

    public int getCodeNumber() {
        return codeNumber;
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
}
