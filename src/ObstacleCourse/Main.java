package ObstacleCourse;

public class Main {
    public static void main(String[] args) {
        // Масив учасників
        Participant[] participants = {
                new Human("Human", 500, 2),
                new Cat("Cat", 600, 9),
                new Robot("Robot", 1000, 1)
        };

        // Масив перешкод
        Obstacle[] obstacles = {
                new RunningTrack(400),
                new Wall(2),
                new RunningTrack(600),
                new Wall(3)
        };

        // Перевірка проходження
        for (Participant participant : participants) {
            boolean completed = true;
            for (Obstacle obstacle : obstacles) {
                if (!obstacle.overcome(participant)) {
                    System.out.println("The participant " + participant.getName() + " is eliminated.");
                    completed = false;
                    break;
                }
            }
            if (completed) {
                System.out.println("The participant " + participant.getName() +
                        " successfully completed the obstacle line!");
            }
            System.out.println("----------------------------------");
        }
    }
}