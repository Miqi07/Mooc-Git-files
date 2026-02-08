
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Name:");
            String TVprogramsname = scanner.nextLine();

            if (TVprogramsname.isEmpty()) {
                break;
            }

            System.out.println("Duration: ");
            int Duration = Integer.valueOf(scanner.nextLine());

            programs.add(new TelevisionProgram(TVprogramsname, Duration));

        }

        System.out.println("Maximum Duration:");
        int MaximumDuration = Integer.valueOf(scanner.nextLine());

        for (TelevisionProgram store : programs) {
            if (MaximumDuration >= store.getDuration()) {
                System.out.println(store);
            }
        }
    }
}
