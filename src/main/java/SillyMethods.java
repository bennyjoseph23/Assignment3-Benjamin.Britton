public class SillyMethods {
    public boolean didGuess42(int guess) {
        return guess == 42;
    }

    public String countTo(int i) {
        String total_CountString = "0";
        for (int count = 1; count <= i;count++) {
            total_CountString += " " + Integer.toString(count);
        }
        return total_CountString;
    }
}
