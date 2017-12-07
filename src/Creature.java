/*
  This is the Abstract Class.
  This is all about being able to use the power of Polymorphism to create subclasses from all
  the classes that you may.
 */

abstract public class Creature {

    protected String name;
    protected int weight;
    protected String sound;


    /*
      Every method you make inside this class that you mark as abstract have to be overridden.
      However, NOT all methods inside an abstract class have to be abstract.
     */

    public abstract void setName(String newName);
    public abstract String getName();

    public abstract void setWeight(double newWeight);
    public abstract double getWeight();



}
