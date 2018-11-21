package HomeWork1;

public class Water extends Obstacle {
    private int distance;

    public Water(int distance) {
        this.distance = distance;
    }

    @Override
    String doIt(Competitor competitor) {
        return competitor.swim(distance);
    }
}
