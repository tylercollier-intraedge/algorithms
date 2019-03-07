public class RecursionTest {
    public static void main(String[] args) {
        String s = "hekashdfkahd";
        String reversed = reverseStr(s);
        // System.out.println(reversed);
        // System.out.println(exp(2, 8));
        strDist("hiHelloqwhihihi", "hih");
        System.out.println("count " + count);
    }
    
    static String reverseStr(String str) {
        if (str.length() == 0) {
            return str;
        }
        return str.substring(str.length() - 1) + reverseStr(str.substring(0, str.length() - 1));
    }
    
    static int exp(int num, int power) {
        if (power == 0) {
            return 1;
        }
        return num * exp(num, power - 1);
    }
    static int count = 0;
    static int strDist(String str, String sub) {
        count++;
      if (str.startsWith(sub) && str.endsWith(sub)) {
        return str.length();
      }
      if (str.length() <= sub.length()) {
        return 0;
      }
      int left = strDist(str.substring(0, str.length() - 1), sub);
      int right = strDist(str.substring(1), sub);
      return Math.max(left, right);
    }

}