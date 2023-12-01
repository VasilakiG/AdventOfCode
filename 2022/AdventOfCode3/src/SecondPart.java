import java.util.Scanner;

public class SecondPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;


        while (sc.hasNextLine()){
            int found = 0;
            String [] parts = new String[3];

            String line = sc.nextLine();
            int length1 = line.length();
            parts[0] = line;

            line = sc.nextLine();
            int length2 = line.length();
            parts[1] = line;

            line = sc.nextLine();
            int length3 = line.length();
            parts[2] = line;

            int partialSum = 0;
            for (int i = 0; i < length1; i++) {
                if (found == 1) {
                    break;
                }
                for (int j = 0; j < length2; j++) {
                    for (int k = 0; k < length3; k++) {

                        if ((parts[0].charAt(i) == parts[1].charAt(j)) && (parts[0].charAt(i) == parts[2].charAt(k)) && partialSum == 0){
                            if (Character.isLowerCase(parts[0].charAt(i))) {
                                partialSum += parts[0].charAt(i) - 96;
                                found=1;
                                break;
                            }else{
                                partialSum += parts[0].charAt(i) - 38;
                                found=1;
                                break;
                            }
                        }

                    }
                }
            }

            totalSum+=partialSum;
            System.out.println(totalSum);
        }

    }
}