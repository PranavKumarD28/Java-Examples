public class IntMax {
    public int intMax(int a, int b, int c) {
        int big;
  
        if (a > b) {
            big = a;
        }
        else {
            big = b;
        }
        if (c > big) {
            big = c;
        }
        return big;
    }
}