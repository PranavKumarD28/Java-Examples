import java.util.Scanner;
//Example Student Data

public class ThreeDarray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[][][] students = new String[2][2][5];

        for (int college = 0; college < 2; college++) {
            for (int classroom = 0; classroom < 2; classroom++) {
                System.out.println("Enter names for College " + (college + 1) + ", Class " + (classroom + 1));
                for (int student = 0; student < 5; student++) {
                    System.out.print(" Student " + (student + 1) + ": ");
                    students[college][classroom][student] = sc.nextLine();
                }
            }
        }


        System.out.println("\n--- Student Data ---");
        for (int college = 0; college < 2; college++) {
            for (int classroom = 0; classroom < 2; classroom++) {
                System.out.println("College " + (college + 1) + ", Class " + (classroom + 1) + ":");
                for (int student = 0; student < 5; student++) {
                    System.out.println(" " + students[college][classroom][student]);
                }
            }
        }

        sc.close();
    }
}
