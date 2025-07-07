// ✅ File Read and Token it

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FilterReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Ex_18 {

    public static void main(String[] args) {

        String filepath = "src/Prompt.txt";

        BufferedReader reader = null;

        try
        {
            reader = new BufferedReader(new FileReader(filepath));
            String line;
            while ((line = reader.readLine()) != null )
            { tokenizeLine(line); }
        }
        catch (IOException e)
        { e.printStackTrace(); }
        finally
        {
            try { if (reader != null) reader.close(); }
            catch (IOException ex){ ex.printStackTrace(); }
        }

    }

    private static void tokenizeLine(String line){
        StringTokenizer tokenizer = new StringTokenizer(line," ,.;!?");

        while (tokenizer.hasMoreTokens()){
            String token = tokenizer.nextToken();
            System.out.println(token);
        }
    }

}
