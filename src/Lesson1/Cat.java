package Lesson1;

public class Cat extends Creature {
        private boolean isWild;
        private String name;
        private int age;
        private String color;

        @Override
        public void voice () {
                System.out.println("Мяу");
        }

        {
        public Cat( boolean isWild);
        }

        public boolean isWild () {
                return isWild;
        }

        public void setWild ( boolean wild ) {
                isWild = wild;
        }
        public class Cat extends Creature implements CanRun {
                private int runningSpeed;

                @Override
                public void voice() {
                        System.out.println("Кот мяукает");
                }

                public Cat(String name, int age, String color) {
                        super(name, age, color);
                }

                public int getRunningSpeed() {
                        return runningSpeed;
                }

                public void runningSpeed(int runningSpeed) {
                        this.runningSpeed = runningSpeed;
                }

                public double run(int speed) {
                        System.out.println("Я кот я бегу");
                        return speed / runningSpeed;

                        public class Cat extends Creature implements CanJump {
                                private int jumpingHeight;

                                public int getJumpingHeight() {
                                        return jumpingHeight;
                                }

                                public void setJumpingHeight(int jumpingHeight) {
                                        this.jumpingHeight = jumpingHeight;
                                }

                                public double jump(int jump) {
                                        System.out.println("Я кот я прыгаю");
                                        return jump / jumpingHeight;
                                }                }
}
