/*
  This is the Interface.
  An Interface is a class with ONLY abstract methods.
 */
public interface Living {

    // NB: The methods don't contain the word `abstract` because they are abstract by default.

    public void setName(String newName);
    public String getName();

    public void setHeight(double newHeight);
    public double getHeight();

    public void setWeight(double newWeight);
    public double getWeight();

    public void setFavFood(String newFood);
    public String getFavFood();

    public void setSpeed(double newSpeed);
    public double getSpeed();

    public void setSound(String newSound);
    public String getSound();



}
