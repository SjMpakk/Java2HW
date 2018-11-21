package HomeWork1;

public class Cross extends Obstacle {
    private int distance;

    public Cross(int distance) {
        this.distance = distance;
    }

    @Override
    String doIt(Competitor competitor) {
        return competitor.run(distance);
    }
}
