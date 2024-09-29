package ExecptionHandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWithoutCatchOrFinally {
    public static void main(String[] args) throws IOException {
        // Using try-with-resources without catch or finally
        try (BufferedReader reader = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            // Read lines from the file
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } // No catch or finally blocks
    }
}
