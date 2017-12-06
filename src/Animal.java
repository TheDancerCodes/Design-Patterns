public class Animal {

    private String name;
    private int weight;
    private String sound;

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

    // Sound Setter & Getter function
    public void setSound(String newSound) {
        sound = newSound;

    }

    public String getSound() {
        return sound;
    }
}
