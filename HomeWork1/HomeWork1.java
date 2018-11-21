package HomeWork1;

/**
 *
 * Java Home Work 1
 * @author Denisov Alexey
 * @version dated Nov 22, 2018
 */

public class HomeWork1 {
    public static void main(String[] args) {


        Course c = new Course(new Cross(400), new Wall(2), new Water(1));
        Team team = new Team("Команда", new Human("Боб"), new Cat("Барсик"), new Dog("Бобик"),
                new Dog("Полкан"));
        c.doIt(team);
        team.showResults();
    }
}
