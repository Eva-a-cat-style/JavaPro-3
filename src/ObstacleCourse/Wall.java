package ObstacleCourse;

public class Wall implements Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    public boolean overcome(Participant participant) {
        System.out.println("Participant " + participant.getName() +
                " tries to jump over " + height + " m");
        return participant.jump(height);
    }
}
