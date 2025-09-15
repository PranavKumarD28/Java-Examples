public class Close10 {
    public int close10(int a, int b) {
        int FirDiff = Math.abs(a - 10);
        int SecDiff = Math.abs(b - 10);
  
        if (FirDiff < SecDiff) {
            return a;
        }
        if (SecDiff < FirDiff) {
            return b;
        }
        return 0;
    }
}