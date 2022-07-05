import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class WordReader {
    File file;
    Scanner sc;
    List<String> wordList;

    public WordReader(String path) throws FileNotFoundException {
        this.file = new File(path);
        sc = new Scanner(file);
        wordList = new ArrayList<>();

        while(sc.hasNextLine()){
            wordList.add(sc.nextLine());
        }
    }

    public String pickRandomWord(){
        Random random = new Random();
        int randomInt = random.nextInt(wordList.size());
        return wordList.get(randomInt);
    }
}
