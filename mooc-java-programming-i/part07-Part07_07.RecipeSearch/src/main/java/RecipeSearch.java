
import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("File to read:");
        String file = scan.nextLine();
        RecipeManager miqi = new RecipeManager();
        miqi.loadRecipes(file);
        while (true) {

            System.out.println("Commands:\n"
                    + "list - lists the recipes\n"
                    + "stop - stops the program" + "\n"
                    + "find name - searches recipes by name\n"
                    + "find cooking time - searches recipes by cooking time\n"
                    + "find ingredient - searches recipes by ingredient");

            System.out.println("Enter command:");
            String command = scan.nextLine();

            if (command.equals("stop")) {
                return;
            } else if (command.equals("list")) {
                miqi.printRecipe();
            } else if (command.equals("find name")) {
                System.out.println("Searched word:");
                String word = scan.nextLine();
                miqi.findingByName(word);
            } else if (command.equals("find cooking time")) {
                System.out.println("Max cooking time:");
                int time = Integer.valueOf(scan.nextLine());
                miqi.searchingBycookingTime(time);
            } else if (command.equals("find ingredient")) {
                System.out.println("Ingredient:");
                String ingredient = scan.nextLine();
                miqi.searchingByingredients(ingredient);
            }

        }

    }

}
