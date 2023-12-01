import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalSum = 0;


        while (sc.hasNextLine()){
            int found = 0;

            String line = sc.nextLine();
            int length = line.length();

            String [] parts = new String[2];
            parts[0]= line.substring(0, length/2);
            parts[1]= line.substring(length/2,length);
            int partialSum = 0;
            for (int i = 0; i < length/2; i++) {
                if (found == 1) {
                    break;
                }
                for (int j = length/2; j < length; j++) {
                    if (line.charAt(i) == line.charAt(j) && partialSum == 0){
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
            totalSum+=partialSum;
            System.out.println(totalSum);
        }

    }
}