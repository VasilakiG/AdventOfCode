import java.util.*;

public class FirstPart {
    public static boolean isInteger(String s) {
        try {
            Integer.parseInt(s);
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> path = new ArrayList<>();
        int partialSum = 0;
        int totalSum = 0;

        while (sc.hasNextLine()) {

            String line = sc.nextLine();
            String[] parts = line.split("\\s+");

            if (Objects.equals(parts[1], "cd")) {
                if (Objects.equals(parts[2], "..")) {
                    path.remove(path.size() - 1);
                } else {
                    path.add(Integer.valueOf(parts[2]));
                }
            } else if (Objects.equals(parts[1], "ls")) {
                continue;
//                    line = sc.nextLine();
//                    parts = line.split("\\s+");
            } else if (Objects.equals(parts[0], "dir")) {
                continue;
            } else {
                if (isInteger(parts[0])) {
                    //need to add sizes to all directories and to current one
                    //I need to use data structures that I still don't know
                    //so the solution ends here, will get back when I will
                    //know how to implement it
//                    partialSum += Integer.parseInt(parts[0]);
                }
            }
        }
    }
}