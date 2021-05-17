package Lesson1;

public class Robot extends Creature {
    public Robot ( String name, int age, String color ) {
        super(name, age, color);
    }
    public class Robot extends Creature implements CanRun {
        private int runningSpeed;

        @Override
        public void voice() {
            System.out.println("Робот говорит голосом Алисы");
        }

        public Robot(String name, int age, String color) {
            super(name, age, color);
        }

        public int getRunningSpeed() {
            return runningSpeed;
        }

        public void setRunningSpeed(int runningSpeed) {
            this.runningSpeed = runningSpeed;
        }

        public double run(int speed) {
            System.out.println("Я робот я бегу");
            return speed / runningSpeed;
        }
        public class Robot extends Creature implements CanJump {
            private int jumpingHeight;

            public int getJumpingHeight() {
                return jumpingHeight;
            }

            public void setJumpingHeight(int jumpingHeight) {
                this.jumpingHeight = jumpingHeight;
            }

            public double jump(int jump) {
                System.out.println("Я робот я прыгаю");
                return jump / jumpingHeight;
            }
    }

