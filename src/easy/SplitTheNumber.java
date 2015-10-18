package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SplitTheNumber {

    public static void main(String[] args) throws IOException {
        // File file = new File(args[0]);
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();
            
            String items[] = line.split(" "); 
            long number = Long.parseLong(items[0]);
            String text = items[1]; 
            
            if (text.contains("+")) {
                int indexOfPlus = text.indexOf("+");
                long part2 = Long.parseLong((number + "").substring(indexOfPlus));
                long part1 = Long.parseLong((number + "").substring(0, indexOfPlus));
                System.out.println(part1 + part2);
            }
            
            if (text.contains("-")) {
                int indexOfMinus = text.indexOf("-");
                long part2 = Long.parseLong((number + "").substring(indexOfMinus));
                long part1 = Long.parseLong((number + "").substring(0, indexOfMinus));
                System.out.println(part1 - part2);
            }
        }
    }
}
