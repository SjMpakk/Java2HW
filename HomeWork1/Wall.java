package HomeWork1;

public class Wall extends Obstacle {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    @Override
    String doIt(Competitor competitor) {
        return competitor.jump(height);
    }
}