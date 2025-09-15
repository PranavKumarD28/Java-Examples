public class StartHi {
    public boolean startHi(String str) {

        if (str.length() < 2) return false;
  
        String StartTwo = str.substring(0, 2);
  
        if (StartTwo.equals("hi")) {
            return true;
        }
        else {
            return false;
        }
    }
}