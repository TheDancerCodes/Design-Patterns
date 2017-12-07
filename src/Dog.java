public class Dog extends Animal {

    // A new method unique to a Dog
    public void digHole() {
        System.out.println("Dug a hole!");
    }

    // A constructor to initialize every object that is created
    public Dog() {

        // Reference the constructor file/ initializer for the super class <Animal>
        super();

        setSound("Bark");
    }


    public void changeVar(int randNum) {

        randNum = 12;
        System.out.println("randNum in method: " + randNum);
    }

    private void bePrivate() {

        System.out.println("In a private method");

    }

    public void accessPrivate() {
        // Can access information in private methods; What's the point? ¯\_(ツ)_/¯.
        bePrivate();

    }

}
