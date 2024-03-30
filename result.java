import java.util.Scanner;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class laba {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String failaNosaukums;
        System.out.println("Input file name:");
        failaNosaukums = sc.nextLine();
        sc.close();

        BufferedReader br = new BufferedReader(new FileReader(failaNosaukums));

        System.out.println("Result:");

        String line;
        while ((line = br.readLine()) != null) {
            String[] words = line.split(" ");

            StringBuilder StudentaVards = new StringBuilder();
            int AtzimeZem4 = 0;

            // Iterate through words
            for (String word : words) {
                try {
                    int grade = Integer.parseInt(word);
                    if (grade < 4) {
                        AtzimeZem4++;
                    }
                } catch (NumberFormatException e) {
                    StudentaVards.append(word).append(" ");
                }
            }

            if (AtzimeZem4 > 0) {
                System.out.println(StudentaVards.toString().trim() + " " + AtzimeZem4);
            }
        }
        br.close();
    }
}