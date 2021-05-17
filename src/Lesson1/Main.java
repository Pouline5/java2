package Lesson1;

public class Main {
    public static void main ( String[] args ) {
        Human human1 = new Human("Петр", 35);
        human1.setAge(human1.getAge() - 38);
        System.out.println(human1);
        human1.checkAge();

        Creature creature = new Cat();
        Creature.voice();

        Robot robot = new Robot("R2D2", 23, "silver");
        Cat cat = new Cat("Мурчик", 15, "полосатый");
        if (creature instanceof Cat) {
        ((Cat) creature).setWild(true);
    }
        Treadmill[] treadmill = {new Treadmill(50), new Treadmill(20), new Treadmill(10)};

        Cat cat1 = new Cat("Кот", 10, "рыжий");
        Cat1.setRunningSpeed(11);
        Human.setRunningSpeed(20);
        Robot.setRunningSpeed(50);

        double catTime = 0;
        double humanTime = 0;
        double robotTime = 0;
        for (Treadmill: treadmill) {
            catTime = catSpeed + cat1.run(treadmill.getSpeed());
            human1Time = human1Speed + human1.run(treadmill.getSpeed());
            robotTime = robotSpeed + robot.run(pool.getSpeed());
        }

        CanRun[] canRuns = {cat1, human1, robot};

        for (Treadmill pool: treadmill) {
            for (CanRun runner: canRun) {
                runner.run(treadmill.getSpeed());
            }
        }

        System.out.println("Скорость кота:" + catSpeed);
        System.out.println("Скорость человека:" + human1Speed);
        System.out.println("Скорость робота:" + robotSpeed);

    }
    Wall[] wall = {new Wall(100), new Wall(10), new Wall(1)};

        Cat1.setJumpingHeight(10);
        Human.setJumpingHeight(2);
        Robot.setJumpingHeight(100);

    double catHeight = 0;
    double human1Height = 0;
    double robotHeight = 0;
        for (Wall: wall) {
        catHeight = catHeight cat1.jump(wall.getHeight());
        human1Height = human1Height + human1.jump(wall.getHeight());
        robotHeight = robotHeight + robot.jump(wall.getHeight());
    }

    CanJump[] canJumps = {cat1, human1, robot};

        for (Wall wall: wall) {
        for (CanJump jumper: canJumps) {
            jumper.jump(wall.getHeight());
        }
    }

        System.out.println("Высота кота:" + catHeight);
        System.out.println("Высота человека:" + human1Height);
        System.out.println("Высота робота:" + robotHeight);

}
