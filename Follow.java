package ie.tudublin;

public class Follow {
    private int count;
    private String word;
    
    
    public Follow(String word, int count) {
        this.word = word;
        this.count = count;
    }
    
    public String getWord() {
        return word;
    }
    
    public int getCount() {
        return count;
    }
    
    public String toString() {
        return word + " (" + count + ")";
    }
}