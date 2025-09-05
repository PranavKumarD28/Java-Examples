public class FrontBack {
    public String frontBack(String str) {
        if (str.length() <= 1) return str;
  
        int n = str.length();
        String mid = str.substring(1, n-1);
  
        return str.charAt(n-1) + mid + str.charAt(0);
    }
}