public class Puzzle {
    public static int solve(int a, int b, char symbol) {
        return ((a + b) - (((a - b) ^ ((a - b) >> 31)) - ((a - b) >> 31)) * (1 - 2 * ((symbol & 0b10)>>1)))/2;
    }
}
