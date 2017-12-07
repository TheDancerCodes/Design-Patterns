package oop_concepts;

/*
  This file brings all the functionality of the other classes together
 */
public class WorkWithAnimals {

    int justANum = 10;

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
        System.out.println("oop_concepts.Dog name after method call: " + rex.getName());


        // Create oop_concepts.Cat & oop_concepts.Dog Object with the super class:
        // Refer to sub-classes by their super class type.
        Animal doggy = new Dog();
        Animal kitty = new Cat();

        // NB: Even though they are both OOP_Concepts.Animal objects, they automatically call the right method defined inside
        // their individual classes.
        System.out.println("Doggy says: " + doggy.getSound());
        System.out.println("Kitty says: " + kitty.getSound());

        // By referring to sub-classes by their super class type, we can create arrays that have OOP_Concepts.Animal objects.
        Animal[] animals = new Animal[4];
        animals[0] = doggy;
        animals[1] = kitty;

        //TODO: We can cycle through each using a for-each block instead.
        System.out.println("Doggy says: " + animals[0].getSound());
        System.out.println("Kitty says: " + animals[1].getSound());

        // You can send OOP_Concepts.Animal objects for processing inside a method
        speakAnimal(doggy);

        // NB: You can't reference methods or fields that are not in OOP_Concepts.Animal <super class>
        // *Method digHole() is undefined for the type OOP_Concepts.Animal*
        //doggy.digHole();
        // You can still use it by casting it to become a oop_concepts.Dog object.
        ((Dog)doggy).digHole();


        // NB: You can't use non-static variables/ methods in a static function.
        // *Non-static field 'justANum' cannot be referenced from a static context*
        //System.out.println(justANum);


        // NB: You can't call a non-static methods inside a static method.
        // *Non-static method 'sayHello' cannot be referenced from a static context*
        //sayHello();


        // NB: You cannot call a private method even if you define it inside a subclass.
        // *'bePrivate' has private access in 'oop_concepts.Dog'*
        // rex.bePrivate();

        // Accessing a private method using a public method accessPrivate()
        rex.accessPrivate();


        // oop_concepts.Rhino object
        Rhino rhino = new Rhino();
        rhino.setName("Timon");
        System.out.println(rhino.getName());


    }

    /*
    Any methods that are in a class but are not tied to an object must be labelled static.
    Every single object that is created from this class are all going to have the
    same static method and static variables
     */
    public static void changeObjectname(Dog rex) {
        rex.setName("Henderson");

    }

    public static void speakAnimal(Animal randAnimal) {

        System.out.println("OOP_Concepts.Animal says: " + randAnimal.getSound());
    }

    public void sayHello() {
        System.out.println("Hello");
    }

}
