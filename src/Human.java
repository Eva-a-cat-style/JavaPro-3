public class Human implements Participant {
        private String name;
        private int runLimit;
        private int jumpLimit;

    public Human(String name, int runLimit, int jumpLimit) {
            this.name = name;
            this.runLimit = runLimit;
            this.jumpLimit = jumpLimit;
        }

        @Override
        public String getName() {
            return name;
        }

        @Override
        public int getRunLimit() {
            return runLimit;
        }

        @Override
        public int getJumpLimit() {
            return jumpLimit;
        }

        @Override
        public boolean run(int distance) {
            if (distance <= runLimit) {
                System.out.println(name + " ran the distance " + distance + " m");
                return true;
            } else {
                System.out.println(name + " did not ran the distance " + distance + " :( ");
                return false;
            }
        }

        @Override
        public boolean jump(int height) {
            if (height <= jumpLimit) {
                System.out.println(name + " jump over " + height + " m");
                return true;
            } else {
                System.out.println(name + " did not jump over " + height + " :(");
                return false;
            }
        }
}
