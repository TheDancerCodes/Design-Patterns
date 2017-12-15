/**
 * The interface is implemented by many other subclasses that allow for many types of flying
 * without effecting Animal, or Flys.
 * <p>
 * Classes that implement new Flys interface subclasses can allow other classes to use that code
 * eliminating code duplication
 * <p>
 * I'm decoupling : encapsulating the concept that varies; the behaviour of flying
 */

package strategy_design_pattern;

public interface Flys {

    String fly();

}

// Class used if the Animal can fly
class ItFlys implements Flys {

    public String fly() {
        return "Flying Sky High!";
    }
}

//Class used if the Animal can't fly
class CantFly implements Flys {

    public String fly() {
        return "I can't Fly!";
    }
}