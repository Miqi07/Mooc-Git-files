
import java.util.ArrayList;

public class SimpleCollection {

    private String name;
    private ArrayList<String> elements;

    public SimpleCollection(String name) {
        this.name = name;
        this.elements = new ArrayList<>();
    }

    public void add(String element) {
        this.elements.add(element);
    }

    public ArrayList<String> getElements() {
        return this.elements;
    }

  @Override
public String toString() {
    if (this.elements.isEmpty()) {
        return "The collection " + this.name + " is empty.";
    }

    // 1. Build the header part
    String printOutput = "The collection " + this.name + " has " + this.elements.size();
    
    // Check if it's "element" or "elements"
    if (this.elements.size() == 1) {
        printOutput = printOutput + " element:\n";
    } else {
        printOutput = printOutput + " elements:\n";
    }

    // 2. Build the list of names manually
    String elementsAsString = "";
    for (String element : this.elements) {
        elementsAsString = elementsAsString + element + "\n";
    }

    // 3. Put it all together
    return printOutput + elementsAsString;
}

}
