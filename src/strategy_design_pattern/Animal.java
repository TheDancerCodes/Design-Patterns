package strategy_design_pattern;

public class Animal {

    private String name;
    private int weight;
    private String sound;
    private String favFood;
    private double speed;

    /**
     * Instead of using an interface in a traditional way we use an instance variable that is a subclass
     * of the Flys interface.
     * <p>
     * <p>
     * Animal doesn't care what flyingType does, it just knows the behavior is available to its subclasses
     * <p>
     * <p>
     * This is known as Composition : Instead of inheriting an ability through
     * inheritance the class is composed with Objects with the right ability
     * <p>
     * Composition allows you to change the capabilities of objects at run time!
     */

    public Flys flyingType;


    // Name Setter & Getter function
    public void setName(String newName) {
        name = newName;
    }


    public String getName() {
        return name;
    }

    // Weight Setter & Getter function
    public void setWeight(int newWeight) {
        if (newWeight > 0) {
            weight = newWeight;
        } else {
            System.out.println("Weight must be greater than 0");
        }

    }

    public int getWeight() {
        return weight;
    }

    // FavFood Setter & Getter function
    public void setFavFood(String newFavFood) {
        favFood = newFavFood;
    }

    public String getFavFood() {
        return favFood;
    }

    // Speed Setter & Getter function
    public void setSpeed(double newSpeed) {
        speed = newSpeed;

    }

    public double getSpeed() {
        return speed;
    }

    // Sound Setter & Getter function
    public void setSound(String newSound) {
        sound = newSound;

    }

    public String getSound() {
        return sound;
    }

    /*
    * Why is this bad?
    * You never want to add any methods to a superclass if they do not pertain to any of the subclasses
    * You need to separate what is different between subclasses and their superclass.

    public void fly() {

        System.out.println("I'm flying!");
    }
    */


    // Animal pushes off the responsibility for flying to flyingType

    public String tryToFly() {
        return flyingType.fly();
    }

    // To be able to change the flyingType dynamically add the following method
    public void setFlyingAbility(Flys newFlyType) {

        // setting flyingType dynamically
        flyingType = newFlyType;
    }

}
