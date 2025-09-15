public class Front22 {
    public String front22(String str) {
        int n = str.length();
  
        String prefix;
        if (n < 2) {
            prefix = str;
        }
        else {
            prefix = str.substring(0, 2);
        }
        return prefix + str + prefix;
    }
}