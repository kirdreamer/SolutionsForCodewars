public class Kata {
  public static String longToIP(long ip) {
    Long ipmask = 0b00000000_00000000_00000000_11111111L;
    StringBuilder str = new StringBuilder();
    str.append((ipmask & (ip >> 24)) + ".")
      .append((ipmask & (ip >> 16)) + ".")
      .append((ipmask & (ip >> 8)) + ".")
      .append((ipmask & ip) + "");
    // Java doesn't have uint32, so here we use long to represent int32
    return str.toString(); // do it!
  }
}
