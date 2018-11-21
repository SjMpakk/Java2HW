package HomeWork1;

public class Animal implements Competitor {
    String type;
    String name;
    int maxRunDistance;
    int maxJumpHeight;
    int maxSwimDistance;
    boolean onDistance;

    public boolean isOnDistance() {
        return onDistance;
    }

    public Animal(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
        this.type = type;
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
        this.maxSwimDistance = maxSwimDistance;
        this.onDistance = true;
    }

    public String run(int distance){
        if (distance <=maxRunDistance){
            return (type + " " + name + " " + " успешно справился с кроссом");
        } else {
            onDistance = false;
            return (type + " " + name + " " + " не смог преодолеть кросс");

        }
    }

    public String jump(int height){
        if (height <=maxJumpHeight){
            return (type + " " + name + " " + " успешно справился с препятствием");
        } else {
            onDistance = false;
            return (type + " " + name + " " + " не смог преодолеть препятствие");

        }
    }

    public String swim(int distance){
        if (maxSwimDistance == 0){
            onDistance = false;
            return (type + " " + name + " не умеет плавать");

        }
        if (distance <=maxSwimDistance){
            return (type + " " + name + " " + " успешно проплыл дистанцию");
        } else {
            onDistance = false;
            return (type + " " + name + " " + " не смог проплыть дистанцию");
        }
    }

    public void showResult(){
        System.out.println(type + " " + name + ": " + onDistance);
    }
}
