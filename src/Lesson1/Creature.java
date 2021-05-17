package Lesson1;

public abstract class Creature {
    protected String name;
    protected int age;
    protected String color;

    public abstract void voice();

    public Creature ( String name, int age, String color ) {
        this.name = name;
        this.age = age;
        this.color = color;
    }
}
