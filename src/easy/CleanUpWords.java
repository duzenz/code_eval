package easy;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CleanUpWords {

    public static void main(String[] args) throws IOException {
        // File file = new File(args[0]);
        File file = new File("input.txt");
        BufferedReader buffer = new BufferedReader(new FileReader(file));
        String line;

        while ((line = buffer.readLine()) != null) {
            line = line.trim();

            char[] chars = line.toCharArray();
            boolean isSpaceAdded = false;

            StringBuilder sb = new StringBuilder();
            for (int i = 0, len = chars.length; i < len; i++) {
                if (Character.isLetter(chars[i])) {
                    sb.append(chars[i]);
                    isSpaceAdded = false;
                } else {
                    if (!isSpaceAdded) {
                        sb.append(" ");
                        isSpaceAdded = true;
                    }
                }
            }
            System.out.println(sb.toString().trim().toLowerCase());
        }
    }
}
