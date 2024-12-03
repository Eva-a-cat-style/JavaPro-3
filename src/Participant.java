public interface Participant {
    String getName();
    int getRunLimit();
    int getJumpLimit();
    boolean run(int distance);
    boolean jump(int height);
}
