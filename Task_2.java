import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Timestamp;
import java.util.Arrays;

public class sortBubble {
    private static File log;
    private static FileWriter fileWriter;
    public static void main (String[] args) {
        try {
            log = new File ("log.txt");
            log.createNewFile ();
            fileWriter = new FileWriter(log);
            int[] arr = {21, 4, 33, 16, 7}
            sortBubble(arr);

        } catch (IOException e) {
            e.printStackTrace ();
        } finally {
            try {
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private static int [] sortBubble (int [] arr) {
        boolean isSotr = false;
        int buffer;

        while (!isSotr) {
            isSotr =true;
            for (int i = 0; i<arr.length - 1; i++) {
                if (arr[i] > arr[i+1]) {
                    isSotr = false;

                    buffer = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = buffer;
                }
                
            }

            logStep (Arrays.toString(arr));
        }
        return arr;
    }
    public static void logStep (String note) {
        try {
            fileWriter.write (new Timestamp (System.timeCurrent()) + " " + note + "\n");
        } catch (IOException e) {
            e.printStackTrace ();
        }
    }
}