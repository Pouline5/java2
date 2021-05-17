package Lesson1;

public class Human extends Creature {

    public String getName () {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public int getAge () {
        return age;

    }

    public void setAge ( int age ) {
        this.age = age;
    }

    @Override
    public String toString () {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Human ( String name, int age ) {
        this.name = name;
        this.age = age;

    }
    public void checkAge () {
        if (age < 0)
            System.out.println("Вы пытаетесь ввести некорректное значение!");
        else
            System.out.println("true");
    }
    public int getRunningSpeed() {
        return runningSpeed;
    }

    public void setRunningSpeed(int runningSpeedSpeed) {
        this.runningSpeed = runningSpeedSpeed;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Human human = (Human) o;
        return age == human.age &&
                Objects.equals(name, human.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, color);
    }

    @Override
    public void voice() {
        System.out.println("Человек говорит о работе");
    }

    public double run(int Speed) {
        System.out.println("Человек пробежал");
        return Speed / runningSpeed;
    }
    public class Human extends Creature implements CanJump {
        private int jumpingHeight;

        public int getJumpingHeight() {
            return jumpingHeight;
        }

        public void setJumpingHeight(int jumpingHeight) {
            this.jumpingHeight = jumpingHeight;
        }

        public double jump(int jump) {
            System.out.println("Я человек я прыгаю");
            return jump / jumpingHeight;
        }
}
