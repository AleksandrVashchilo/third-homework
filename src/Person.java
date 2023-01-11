
public abstract class Person {
    private String name;
    private int age;
    private int height;
    private int weight;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }


    public Person(String name, int age, int height, int weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public Person() {
    }

    public void info() {
        System.out.println(name + " " + age + " " + height + " " + weight);
    }

    public void work() {
        if (age < 18 || age > 70) {
            System.out.println("отдыхаю дома");
        } else {
            System.out.println("работаю");
        }
    }


    public abstract void die();
}
