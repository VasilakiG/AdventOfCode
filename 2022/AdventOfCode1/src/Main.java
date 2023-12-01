import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        int max1 = 0;
        int max2 = 0;
        int max3 = 0;
        int sum = 0;

        while(sc.hasNextLine()){
            line = sc.nextLine();
            if (!line.isEmpty()){
                sum += Integer.parseInt(line);
            }else{
                System.out.println("\\");
                if (sum > max1){
                    max3 = max2;
                    max2 = max1;
                    max1 = sum;
                }else if (sum > max2 && sum != max1){
                    max3 = max2;
                    max2 = sum;
                }else if (sum > max3 && sum != max2){
                    max3 = sum;
                }
                sum=0;
                System.out.println(max1+max2+max3);
            }
        }
    }
}
