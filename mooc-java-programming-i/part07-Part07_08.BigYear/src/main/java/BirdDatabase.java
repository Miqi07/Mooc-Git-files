import java.util.ArrayList;

public class BirdDatabase {
    private ArrayList<Bird> birds = new ArrayList<>();

    public void add(String name, String latinName) {
        birds.add(new Bird(name, latinName));
    }

    public void observation(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                b.addObservation();
                return;
            }
        }
        System.out.println("Not a bird!");
    }

    public void printAll() {
        for (Bird b : birds) System.out.println(b);
    }

     public void printOne(String name) {
        for (Bird b : birds) {
            if (b.getName().equals(name)) {
                System.out.println(b);
                return;
            }
        }
    }
}