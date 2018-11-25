package HomeWork1;

public interface Competitor {
    String run(int distance);
    String swim(int distance);
    String jump(int height);
    boolean isOnDistance();
    void showResult();
}
