
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();
        System.out.println("Team");
        String team = scan.nextLine();

        int count = 0;
        int losses = 0;
        int wins = 0;
        try (Scanner fileread = new Scanner(Paths.get(file))) {

            while (fileread.hasNextLine()) {

                String lineread = fileread.nextLine();
                String[] Arraywords = lineread.split(",");
                String hometeam = Arraywords[0];
                String awayTeam = Arraywords[1];
                int homepoints = Integer.parseInt(Arraywords[2]);
                int awaypoints = Integer.parseInt(Arraywords[3]);

                if (lineread.isEmpty()) {
                    System.out.println("Empty");
                    continue;
                }

                if (team.equals(hometeam)) {
                    count++;
                    if (homepoints > awaypoints) {
                        wins++;
                    } else {
                        losses++;
                    }
                }
                
                if (team.equals(awayTeam)) {
                    count++;
                    if (homepoints < awaypoints) {
                        wins++;
                    } else {
                        losses++;
                    }

                }

            }
        } catch (Exception error) {
            System.out.println("Not worked" + error);
        }
        System.out.println("Games: " + count + "\nWins: " + wins + "\nLosses: " + losses);

    }

}
