class Demo {

  
  public boolean sleepIn(boolean weekday, boolean vacation) {
    if (!weekday || vacation) {
      return true;
    }
  
    return false;
  }
  public static void main(String[] args) {
        Demo obj = new Demo();

        System.out.println(obj.sleepIn(false, false)); // true
        System.out.println(obj.sleepIn(true, false));  // false
        System.out.println(obj.sleepIn(false, true));  // true
    }
}