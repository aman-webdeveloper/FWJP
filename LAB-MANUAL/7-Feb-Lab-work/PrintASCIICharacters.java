
public class PrintASCIICharacters {
    public static void main(String[] args) {
        System.out.println("ASCII Characters from 0 to 127:");
        
        for (int i = 0; i <= 127; i++) {
            System.out.println(i + ":" + (char) i);
        }
    }
}
