package strategy_design_pattern;


public class AnimalPlay {

    public static void main(String[] args) {

        Animal tusker = new Dog();
        Animal tukky = new Bird();

        System.out.println("Dog: " + tusker.tryToFly());
        System.out.println("Bird: " + tukky.tryToFly());

        // This allows dynamic changes for flyingType
        tusker.setFlyingAbility(new ItFlys());
        System.out.println("Dog: " + tusker.tryToFly());
    }
}
