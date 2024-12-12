package ObstacleCourse;

public class RunningTrack implements Obstacle {
    private int distance;

    public RunningTrack(int distance) {
        this.distance = distance;
    }

    @Override
    public boolean overcome(Participant participant) {
        System.out.println("Participant " + participant.getName() +
                " tries to run a distance of " + distance + " m");
        return participant.run(distance);
    }
}

