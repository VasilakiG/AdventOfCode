import java.util.Scanner;

public class FirstPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c1, c2, c3, c4;

        while(sc.hasNextLine()){

            String line = sc.nextLine();

            for (int i = 3; i < line.length(); i++) {
                c4 = line.charAt(i);
                c3 = line.charAt(i-1);
                c2 = line.charAt(i-2);
                c1 = line.charAt(i-3);

                if (c4 != c3 && c4 != c2 && c4 != c1 & c3 != c2 && c3 != c1 && c2 != c1) {
                    System.out.println(i+1);
                    break;
                }
            }

        }
    }
}

//          ==============BLOOPERS==============
//
//            String firstFourChars = "";
//            firstFourChars = line.substring(i, j);
//
//            c1 = firstFourChars.charAt(i);
//            c2 = firstFourChars.charAt(i+1);
//            c3 = firstFourChars.charAt(j-2);
//            c4 = firstFourChars.charAt(j-1);
//
//            System.out.println(c1);
//            System.out.println(c2);
//            System.out.println(c3);
//            System.out.println(c4);
//            i++;
//            j++;