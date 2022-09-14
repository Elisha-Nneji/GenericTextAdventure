package rpg.planner.InputOutput;

public class SentenceScraper {

    private final String BASIC_REGULAR_EXPRESSION = " ";

    private String[] words;

    public SentenceScraper(String sentence) {
        words = sentence.split(BASIC_REGULAR_EXPRESSION);
    }

    public SentenceScraper(String sentences, String regex) {
        words = sentences.split(regex);
    }

    public String getWord(int idx) {
        return words[idx];
    }

    public String getWordWithOffsetToWord(String word, int offset) {
        int commandLocation = getWordLocation(word);
        return words[commandLocation + offset];
    }

    public String[] getNextWords(String word, int amount) {
        int commandLocation = getWordLocation(word);
        String[] words = new String[amount];

        for (int i = 1; i <= amount; i++) {
            words[i] = this.words[commandLocation + i];
        }

        return words;
    }

    public String[] getPreviousWords(String word, int amount) {
        int commandLocation = getWordLocation(word);
        String[] words = new String[amount];

        for (int i = 1; i <= amount; i++) {
            words[i] = this.words[commandLocation - i];
        }

        return words;
    }

    public boolean containsWord(String command) {
        for (String commandLookedAt : words) {
            if (commandLookedAt.equals(command)) {
                return true;
            }
        }
        return false;
    }

    public int getWordLocation(String word) {
        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(word)) {
                return i;
            }
        }
        throw new IllegalArgumentException("Input doesn't contain " + word);
    }
}
