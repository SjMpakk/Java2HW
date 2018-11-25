package HomeWork1;

public class Human implements Competitor{
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Human(String name) {
        this.name = name;
        this.maxRunDistance = 5000;
        this.maxJumpHeight = 20;
        this.maxSwimDistance = 500;
        this.onDistance = true;
    }

    public String run(int distance){
        if (distance <=maxRunDistance){
            return (name + " " + " успешно справился с кросс");
        } else {
            onDistance = false;
            return (name + " " + " не смог преодолеть кросс");

        }
}

    public String jump(int height){
        if (height <=maxJumpHeight){
            return (name + " " + " успешно справился с препятствием");
        } else {
            onDistance = false;
            return (name + " " + " не смог преодолеть препятствие");

        }
    }

    public String swim(int distance){
        if (distance <=maxSwimDistance){
            return (name + " " + " успешно проплыл дистанцию");
        } else {
            onDistance = false;
            return (name + " " + " не смог проплыть дистанцию");

        }
    }

    public void showResult(){
        System.out.println(name + ": " + onDistance);
    }

}