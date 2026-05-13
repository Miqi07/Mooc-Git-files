import java.util.ArrayList;

public class GradeRegister {
    private ArrayList<Integer> points;

    public GradeRegister() {
        this.points = new ArrayList<>();
    }

    public void addPoint(int point) {
        if (point >= 0 && point <= 100) {
            this.points.add(point);
        }
    }

    public double averageAll() {
        if (this.points.isEmpty()) return 0.0;
        int sum = 0;
        for (int point : points) sum += point;
        return (double) sum / points.size();
    }

    public String averagePassing() {
        int sum = 0;
        int count = 0;
        for (int point : points) {
            if (point >= 50) {
                sum += point;
                count++;
            }
        }
        return count == 0 ? "-" : Double.toString((double) sum / count);
    }

    public double passPercentage() {
        if (this.points.isEmpty()) return 0.0;
        int passing = 0;
        for (int point : points) {
            if (point >= 50) passing++;
        }
        return 100.0 * passing / points.size();
    }

    public void printGradeDistribution() {
        int[] grades = new int[6];
        for (int point : points) {
            if (point < 50) grades[0]++;
            else if (point < 60) grades[1]++;
            else if (point < 70) grades[2]++;
            else if (point < 80) grades[3]++;
            else if (point < 90) grades[4]++;
            else grades[5]++;
        }

        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i--) {
            System.out.print(i + ": ");
            for (int j = 0; j < grades[i]; j++) System.out.print("*");
            System.out.println();
        }
    }
}