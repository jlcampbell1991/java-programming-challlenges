// Lilah has a string, a, of lowercase English letters that she repeated
// infinitely many times.
//
// Given an integer, n, find and print the number of letter a's in the first
// letters of Lilah's infinite string.
//
// Function Description
//
// Complete the repeatedString function in the editor below. It should return an
// integer representing the number of occurrences of a in the prefix of length  in
// the infinitely repeating string.
//
// repeatedString has the following parameter(s):
//
// s: a string to repeat
// n: the number of characters to consider

class RepeatedString {
  private static String generateString(Integer n) {
    String rs = "abcac";
    double d = 1 / (Double.valueOf(rs.length()) / Double.valueOf(n));
    String s = "";

    for(double i = 0; i < d; i++) {
      s = s.concat(rs);
    }

    return s.substring(0, n);
  }

  public static void main(String[] args) {
    System.out.println(repeatedString(12));
  }

  private static int repeatedString(int n) {
    String str = generateString(n);
    int count = 0;

    for(int i = 0; i < str.length(); i++) {
      if(str.charAt(i) == 'a') {
        count = count + 1;
      }
    }
    return count;
  }
}
