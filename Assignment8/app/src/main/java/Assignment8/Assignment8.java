package Assignment8;
import java.util.Random;

public class  Assignment8 {
        String Sentence;
        String result;
        
        Assignment8(String input){
        Sentence = input;
        result = changeValue(Sentence);
    }
        public String toString(){
            return result;
        }
    public String changeValue(String Sentence){
        String[] words = Sentence.split(" "); 
        int newSite = 0;
        String mixedWord = "";
        
        for (String word : words) {
            String[] letters = word.split("");
            String[] newWord = new String[letters.length];
            
            newWord[0] = letters[0];
            newWord[newWord.length -1] = letters[letters.length -1];
            Random place = new Random();
            
            if (",".equals(letters[letters.length -1]) | ".".equals(letters[letters.length -1])|";".equals(letters[letters.length -1])| ":".equals(letters[letters.length -1])){
                newWord[newWord.length -2] = letters[letters.length -2];
                
                for (int i = 1; i < letters.length -2 ; i++) {            
                    String letter = letters[i];
                    int aux = 0;

                    while (aux < 1){
                        newSite = place.nextInt(letters.length -1);
                        if (newWord[newSite] == null){
                            newWord[newSite] = letter;

                            aux = 2;
                        }
                    }
                }
            }        
            else {
                for (int i = 1; i < letters.length -1 ; i++) { 
                    String letter = letters[i];
                    int aux = 0;

                    while (aux < 1){
                        newSite = place.nextInt(letters.length -1);

                        if (newWord[newSite] == null){
                            newWord[newSite] = letter;
                            aux = 2;
                        }
                    }
                }
            }
            for(String newWord1 : newWord){
                mixedWord += newWord1;
            }
            mixedWord += " ";
        }
        return mixedWord;
    }
}
