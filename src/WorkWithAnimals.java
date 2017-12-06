public class WorkWithAnimals {

    public static void main(String[] args) {

        Dog rex = new Dog();

        rex.setName("Rex");
        System.out.println(rex.getName());

        rex.digHole();

        rex.setWeight(-1);


        // NB:  Everything is passed by value inside Java.
        int randNum = 10;

        rex.changeVar(randNum);

        System.out.println("randNum after method call: " + randNum);

        // NB: Objects on the other hand are passed by references

        /*
          This is a reference to the object that is being passed.
          Any changes to this object will affect this object across all your code.
         */
        changeObjectname(rex);
        System.out.println("Dog name after method call: " + rex.getName());


    }

    /*
    Any methods that are in a class but are not tied to an object must be labelled static.
    Every single object that is created from this class are all going to have the
    same static method and static variables
     */
    public static void changeObjectname(Dog rex) {
        rex.setName("Henderson");

    }


}
