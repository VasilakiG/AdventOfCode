import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        int max = 0;
        int sum = 0;

        while(sc.hasNextLine()){
            line = sc.nextLine();
            if (!line.isEmpty()){
                sum += Integer.parseInt(line);
            }else{
                System.out.println("\\");
                if (sum > max){
                    max = sum;
                }
                sum=0;
                System.out.println(max);
            }
        }
    }
}
