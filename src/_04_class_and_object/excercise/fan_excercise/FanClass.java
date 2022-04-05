package _04_class_and_object.excercise.fan_excercise;

public class FanClass {
        private static final int SLOW = 1;
        private static final int MEDIUM = 2;
        private static final int FAST = 3;
        private int speed;
        private boolean on;
        private double radius;
        private String color;
        public FanClass(){
            this(1,false, 5, "blue");
        }
        public FanClass(int speed, boolean on, double radius, String color){
            this.speed = speed;
            this.on = on;
            this.radius = radius;
            this.color = color;
        }

        public int getSpeed() {
            return this.speed;
        }

        public void setSpeed(int speed) {
            this.speed = speed;
        }

        public boolean isOn() {
            return this.on;
        }

        public void setOn(boolean on) {
            this.on = on;
        }

        public double getRadius() {
            return this.radius;
        }

        public void setRadius(double radius) {
            this.radius = radius;
        }

        public String getColor() {
            return this.color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        @Override
        public String toString() {
            String str ="";
            if (isOn()){
                switch (getSpeed()){
                    case SLOW:
                        str = "slow";
                        break;
                    case MEDIUM:
                        str = "normal";
                        break;
                    case FAST:
                        str = "fast";
                        break;
                    default:
                        str="error";
                }
                return "Fan is on{" +
                        "speed=" + str +
                        ", on=" + on +
                        ", radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';
            }else {
                return "Fan is off{" +
                        "radius=" + radius +
                        ", color='" + color + '\'' +
                        '}';
            }
        }
    }
