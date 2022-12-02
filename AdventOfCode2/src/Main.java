import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = null;
        int X = 1;   //rock
        int Y = 2;   //paper
        int Z = 3;   //scissors
        int WIN = 6;
        int DRAW = 3;
        int LOST = 0;

        int totalScore = 0;

        while(sc.hasNextLine()){
            line = sc.nextLine();
            if (!line.isEmpty()){
                if(line.charAt(0) == 'A' && line.charAt(2) == 'Y'){
                    totalScore += DRAW + X; //3+1=4
                } else if (line.charAt(0) == 'A' && line.charAt(2) == 'Z') {
                    totalScore += WIN + Y; //6+2=8
                } else if (line.charAt(0) == 'A' && line.charAt(2) == 'X') {
                    totalScore += LOST + Z; //0+3=3
                } else if (line.charAt(0) == 'B' && line.charAt(2) == 'Z') {
                    totalScore += WIN + Z; //6+3=9
                } else if (line.charAt(0) == 'B' && line.charAt(2) == 'X') {
                    totalScore += LOST + X; //0+1=1
                } else if (line.charAt(0) == 'B' && line.charAt(2) == 'Y') {
                    totalScore += DRAW + Y; //3+2=5
                } else if (line.charAt(0) == 'C' && line.charAt(2) == 'X') {
                    totalScore += LOST + Y; //0+2=2
                } else if (line.charAt(0) == 'C' && line.charAt(2) == 'Y') {
                    totalScore += DRAW + Z; //3+3=6
                } else if (line.charAt(0) == 'C' && line.charAt(2) == 'Z') {
                    totalScore += WIN + X; //6+1=7
                }
            }else{
                System.out.println("\\");
                System.out.println(totalScore);
            }
        }
    }
}

//
//                ================PartOne================
//
//    while(sc.hasNextLine()){
//        line = sc.nextLine();
//        if (!line.isEmpty()){
//            if(line.charAt(0) == 'A' && line.charAt(2) == 'Y'){
//                totalScore += WIN + Y;
//            } else if (line.charAt(0) == 'A' && line.charAt(2) == 'Z') {
//                totalScore += LOST + Z;
//            } else if (line.charAt(0) == 'A' && line.charAt(2) == 'X') {
//                totalScore += DRAW + X;
//            } else if (line.charAt(0) == 'B' && line.charAt(2) == 'Z') {
//                totalScore += WIN + Z;
//            } else if (line.charAt(0) == 'B' && line.charAt(2) == 'X') {
//                totalScore += LOST + X;
//            } else if (line.charAt(0) == 'B' && line.charAt(2) == 'Y') {
//                totalScore += DRAW + Y;
//            } else if (line.charAt(0) == 'C' && line.charAt(2) == 'X') {
//                totalScore += WIN + X;
//            } else if (line.charAt(0) == 'C' && line.charAt(2) == 'Y') {
//                totalScore += LOST + Y;
//            } else if (line.charAt(0) == 'C' && line.charAt(2) == 'Z') {
//                totalScore += DRAW + Z;
//            }
//        }else{
//            System.out.println("\\");
//            System.out.println(totalScore);
//        }
//    }