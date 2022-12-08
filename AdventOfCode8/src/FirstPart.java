import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        int treesVisible = 392;
        int i = 0;

        int[][] grid = new int[99][99];

        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()){
            String line = sc.nextLine();
            int length = line.length();

            String [] parts = line.split("");
            if (Objects.equals(parts[0], "")){
                continue;
            }
            for (int j = 0; j < length; j++) {
                grid[i][j] = Integer.parseInt(parts[j]);
            }
            i++;


            if (("end").equals(sc.next())) {
                System.out.println(Arrays.deepToString(grid));
                break;
            }
        }



    }
}