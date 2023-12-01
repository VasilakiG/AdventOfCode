import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class FirstPart {
    public static void main(String[] args) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Character> stack3 = new Stack<>();
        Stack<Character> stack4 = new Stack<>();
        Stack<Character> stack5 = new Stack<>();
        Stack<Character> stack6 = new Stack<>();
        Stack<Character> stack7 = new Stack<>();
        Stack<Character> stack8 = new Stack<>();
        Stack<Character> stack9 = new Stack<>();

        stack1.add('V');
        stack1.add('C');
        stack1.add('D');
        stack1.add('R');
        stack1.add('Z');
        stack1.add('G');
        stack1.add('B');
        stack1.add('W');

        stack2.add('G');
        stack2.add('W');
        stack2.add('F');
        stack2.add('C');
        stack2.add('B');
        stack2.add('S');
        stack2.add('T');
        stack2.add('V');

        stack3.add('C');
        stack3.add('B');
        stack3.add('S');
        stack3.add('N');
        stack3.add('W');

        stack4.add('Q');
        stack4.add('G');
        stack4.add('M');
        stack4.add('N');
        stack4.add('J');
        stack4.add('V');
        stack4.add('C');
        stack4.add('P');

        stack5.add('T');
        stack5.add('S');
        stack5.add('L');
        stack5.add('F');
        stack5.add('D');
        stack5.add('H');
        stack5.add('B');

        stack6.add('J');
        stack6.add('V');
        stack6.add('T');
        stack6.add('W');
        stack6.add('M');
        stack6.add('N');

        stack7.add('P');
        stack7.add('F');
        stack7.add('L');
        stack7.add('C');
        stack7.add('S');
        stack7.add('T');
        stack7.add('G');

        stack8.add('B');
        stack8.add('D');
        stack8.add('Z');

        stack9.add('M');
        stack9.add('N');
        stack9.add('Z');
        stack9.add('W');

        Scanner sc = new Scanner(System.in);


        while (sc.hasNextLine()){

            String line = sc.nextLine();
            int length = line.length();

            String [] parts = line.split(" from ");

            int first;
            first = Integer.parseInt(Arrays.stream(parts[0].split("move ")).toList().get(1));

            int second;
            second = Integer.parseInt(Arrays.stream(parts[1].split(" to ")).toList().get(0));

            int third;
            third = Integer.parseInt(Arrays.stream(parts[1].split(" to ")).toList().get(1));

            int tmp = 0;
            for (int i = 0; i < first; i++) {
                switch (second) {
                    case 1 -> tmp = stack1.pop();
                    case 2 -> tmp = stack2.pop();
                    case 3 -> tmp = stack3.pop();
                    case 4 -> tmp = stack4.pop();
                    case 5 -> tmp = stack5.pop();
                    case 6 -> tmp = stack6.pop();
                    case 7 -> tmp = stack7.pop();
                    case 8 -> tmp = stack8.pop();
                    case 9 -> tmp = stack9.pop();
                    default -> {
                    }
                }


                switch (third) {
                    case 1 -> stack1.add((char) tmp);
                    case 2 -> stack2.add((char) tmp);
                    case 3 -> stack3.add((char) tmp);
                    case 4 -> stack4.add((char) tmp);
                    case 5 -> stack5.add((char) tmp);
                    case 6 -> stack6.add((char) tmp);
                    case 7 -> stack7.add((char) tmp);
                    case 8 -> stack8.add((char) tmp);
                    case 9 -> stack9.add((char) tmp);
                    default -> {
                    }
                }
                tmp = 0;
            }

            System.out.println(stack1);
            System.out.println(stack2);
            System.out.println(stack3);
            System.out.println(stack4);
            System.out.println(stack5);
            System.out.println(stack6);
            System.out.println(stack7);
            System.out.println(stack8);
            System.out.println(stack9);
            System.out.println("");
        }

    }
}