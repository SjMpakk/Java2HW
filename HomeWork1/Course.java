package HomeWork1;

public class Course {
    private Obstacle[] obstacles;

    public Course(Obstacle... obstacles) {
        this.obstacles = obstacles;
    }

    void doIt(Team team) {
        Competitor[] competitors = team.getCompetitors();
        if(competitors.length == 0) {
            System.out.println("В команде нет никого");
            return;
        }
        for (Competitor c: competitors) {
            for (Obstacle o:obstacles) {
                team.setResult(o.doIt(c));
                if(!c.isOnDistance()) {
                    break;
                }
            }
        }
    }
}