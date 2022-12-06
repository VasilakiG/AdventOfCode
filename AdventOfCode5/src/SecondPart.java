import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class SecondPart {
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
        Stack<Character> tmpStack = new Stack<>();

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

            for (int i = 0; i < first; i++) {
                switch (second) {
                    case 1 -> tmpStack.add(stack1.pop());
                    case 2 -> tmpStack.add(stack2.pop());
                    case 3 -> tmpStack.add(stack3.pop());
                    case 4 -> tmpStack.add(stack4.pop());
                    case 5 -> tmpStack.add(stack5.pop());
                    case 6 -> tmpStack.add(stack6.pop());
                    case 7 -> tmpStack.add(stack7.pop());
                    case 8 -> tmpStack.add(stack8.pop());
                    case 9 -> tmpStack.add(stack9.pop());
                    default -> {
                    }
                }
            }

            for (int i = 0; i < first; i++) {
                switch (third) {
                    case 1 -> stack1.add(tmpStack.pop());
                    case 2 -> stack2.add(tmpStack.pop());
                    case 3 -> stack3.add(tmpStack.pop());
                    case 4 -> stack4.add(tmpStack.pop());
                    case 5 -> stack5.add(tmpStack.pop());
                    case 6 -> stack6.add(tmpStack.pop());
                    case 7 -> stack7.add(tmpStack.pop());
                    case 8 -> stack8.add(tmpStack.pop());
                    case 9 -> stack9.add(tmpStack.pop());
                    default -> {
                    }
                }
            }

            if (!stack1.isEmpty()){
                System.out.println(stack1.peek());
            }else {
                System.out.println("Prazen");
            }

            if (!stack2.isEmpty()){
                System.out.println(stack2.peek());
            }else {
                System.out.println("Prazen");
            }

            if (!stack3.isEmpty()){
                System.out.println(stack3.peek());
            }else {
                System.out.println("Prazen");
            }

            if (!stack4.isEmpty()){
                System.out.println(stack4.peek());
            }else {
                System.out.println("Prazen");
            }
            if (!stack5.isEmpty()){
                System.out.println(stack5.peek());
            }else {
                System.out.println("Prazen");
            }

            if (!stack6.isEmpty()){
                System.out.println(stack6.peek());
            }else {
                System.out.println("Prazen");
            }

            if (!stack7.isEmpty()){
                System.out.println(stack7.peek());
            }else {
                System.out.println("Prazen");
            }

            if (!stack8.isEmpty()){
                System.out.println(stack8.peek());
            }else {
                System.out.println("Prazen");
            }

            if (!stack9.isEmpty()){
                System.out.println(stack9.peek());
            }else {
                System.out.println("Prazen");
            }

            System.out.println("");
        }

    }
}