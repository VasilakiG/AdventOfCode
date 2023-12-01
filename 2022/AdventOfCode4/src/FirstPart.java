import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        while (sc.hasNextLine()){
            String line = sc.nextLine();
            int length = line.length();

            String [] parts = line.split(",");

            String[] elf1;
            String[] elf2;

            elf1 = parts[0].split("-");
            elf2 = parts[1].split("-");

            int first = Integer.parseInt(elf1[0]);
            int second = Integer.parseInt(elf1[1]);
            int third = Integer.parseInt(elf2[0]);
            int fourth = Integer.parseInt(elf2[1]);

            if ( (first >= third && second <= fourth) || (first <= third && second >= fourth) ){
                sum++;
            }
            System.out.println(sum);
        }
    }
}

//                       ==============BLOOPERS==============
//
//            int[] tmp1 = new int[Integer.parseInt(elf1.substring(4,6))+1];
//            int[] tmp2 = new int[Integer.parseInt(elf2.substring(4,6))+1];
//            int length1 = tmp1.length;
//            int length2 = tmp2.length;

//            for (int i = Integer.parseInt(elf1.substring(1,2)); i <= Integer.parseInt(elf1.substring(4,6)); i++) {
//                tmp1[i] = i;
//            }
//
//            for (int i = Integer.parseInt(elf2.substring(1,2)); i <= Integer.parseInt(elf2.substring(4,6)); i++) {
//                tmp2[i] = i;
//            }