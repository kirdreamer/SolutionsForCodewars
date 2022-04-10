public class DRoot {
  
  public static int digital_root(int n) {
    if (n < 10)
      return n;
    
    do {
    n = digital_root(n / 10) + n % 10;
  } while (n >= 10);
    
    return n;
  }
}
