import java.util.Scanner;

public class SecondPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNextLine()){
            String line = sc.nextLine();

            String [] parts = line.split(",");

            String[] elf1;
            String[] elf2;

            elf1 = parts[0].split("-");
            elf2 = parts[1].split("-");

            int first = Integer.parseInt(elf1[0]);
            int second = Integer.parseInt(elf1[1]);
            int third = Integer.parseInt(elf2[0]);
            int fourth = Integer.parseInt(elf2[1]);

            if ( (first <= third && second >= third) || (first >= third && second <= fourth) || (first >= third && first <= fourth && second >= third && second >= fourth) || (first == third) || (first == fourth) || (second == third) || (second == fourth)){
                sum++;
                System.out.println(sum);
            }
        }
    }
}