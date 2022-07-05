import java.io.FileNotFoundException;

public class Hangman {
    public static void main(String[] args){
        try {
            WordReader wordReader = new WordReader(args[0]);
            System.out.println(wordReader.pickRandomWord());
        } catch (FileNotFoundException e) {
            System.out.println("File not found. Exception: "+e);
        }
    }
}
