
import java.util.Scanner;
import java.io.File;
import java.nio.file.Paths;
import java.util.ArrayList;

public class RecipeManager {

    private ArrayList<Recipe> recipes;

    public RecipeManager() {

        this.recipes = new ArrayList<>();
    }

    public void loadRecipes(String file) {
        try (Scanner scan = new Scanner(Paths.get(file))) {
            while (scan.hasNextLine()) {
                String name = scan.nextLine();
                int time = Integer.parseInt(scan.nextLine());
                ArrayList<String> ingredients = new ArrayList<>();

                while (scan.hasNextLine()) {
                    String line = scan.nextLine();
                    if (line.isEmpty()) {
                        break; // We hit the space, stop this recipe's ingredients
                    }
                    ingredients.add(line);
                }

                recipes.add(new Recipe(name, time, ingredients));

            }

        } catch (Exception e) {
            System.out.println("File not found " + e.getMessage());
        }
    }

    public void printRecipe() {
        System.out.println("\nRecipes:");
        for (Recipe recipe : this.recipes) {
            System.out.println(recipe); // This uses the toString() from your Recipe class
        }

    }

    public void findingByName(String searchedName) {
        for (Recipe store : this.recipes) {
            if (store.getName().contains(searchedName)) {
                System.out.println(store);
            }
        }
    }

    public void searchingBycookingTime(int maximumCookingTime) {
        for (Recipe store : this.recipes) {
            if (store.getTime() <= maximumCookingTime) {
                System.out.println(store);
            }
        }
    }

    public void searchingByingredients(String ingredient) {
        for (Recipe store : this.recipes) {
            if (store.getIngredients().contains(ingredient)) {
                System.out.println(store);
            }
        }
    }
}
