import java.util.Scanner;

public class SecondPart {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char c1, c2, c3, c4, c5, c6 ,c7
                , c8, c9, c10, c11, c12, c13, c14;

        while(sc.hasNextLine()){

            String line = sc.nextLine();

            for (int i = 13; i < line.length(); i++) {
                c14 = line.charAt(i);
                c13 = line.charAt(i-1);
                c12 = line.charAt(i-2);
                c11 = line.charAt(i-3);
                c10 = line.charAt(i-4);
                c9 = line.charAt(i-5);
                c8 = line.charAt(i-6);
                c7 = line.charAt(i-7);
                c6 = line.charAt(i-8);
                c5 = line.charAt(i-9);
                c4 = line.charAt(i-10);
                c3 = line.charAt(i-11);
                c2 = line.charAt(i-12);
                c1 = line.charAt(i-13);

                if (c14 != c13 && c14 != c12 && c14 != c11 && c14 != c10 && c14 != c9 && c14 != c8 && c14 != c7 && c14 != c6 && c14 != c5 && c14 != c4 && c14 != c3 && c14 != c2 && c14 != c1
                    && c13 != c12 && c13 != c11 && c13 != c10 && c13 != c9 && c13 != c8 && c13 != c7 && c13 != c6 && c13 != c5 && c13 != c4 && c13 != c3 && c13 != c2 && c13 != c1
                    && c12 != c11 && c12 != c10 && c12 != c9 && c12 != c8 && c12 != c7 && c12 != c6 && c12 != c5 && c12 != c4 && c12 != c3 && c12 != c2 && c12 != c1
                    && c11 != c10 && c11 != c9 && c11 != c8 && c11 != c7 && c11 != c6 && c11 != c5 && c11 != c4 && c11 != c3 && c11 != c2 && c11 != c1
                    && c10 != c9 && c10 != c8 && c10 != c7 && c10 != c6 && c10 != c5 && c10 != c4 && c10 != c3 && c10 != c2 && c10 != c1
                    && c9 != c8 && c9 != c7 && c9 != c6 && c9 != c5 && c9 != c4 && c9 != c3 && c9 != c2 && c9 != c1
                    && c8 != c7 && c8 != c6 && c8 != c5 && c8 != c4 && c8 != c3 && c8 != c2 && c8 != c1
                    && c7 != c6 && c7 != c5 && c7 != c4 && c7 != c3 && c7 != c2 && c7 != c1
                    && c6 != c5 && c6 != c4 && c6 != c3 && c6 != c2 && c6 != c1
                    && c5 != c4 && c5 != c3 && c5 != c2 && c5 != c1
                    && c4 != c3 && c4 != c2 && c4 != c1
                    && c3 != c2 && c3 != c1
                    && c2 != c1) {
                    System.out.println(i+1);
                    break;
                }
            }

        }
    }
}


//            for (int i = 15; i < line.length(); i++) {
//
//                for (int j = 0; j < 14; j++) {
//                    c[j] = line.charAt(i-1);
//                }
//
//                if (c4 != c3 && c4 != c2 && c4 != c1 & c3 != c2 && c3 != c1 && c2 != c1) {
//                    System.out.println(i+1);
//                    break;
//                }
//            }