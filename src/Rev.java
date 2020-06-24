// 9. Palindrome Number

//Determine whether an integer is a palindrome. An integer is a palindrome when it reads the same backward as forward.
      //  Example 1:
      //  Input: 121
      //  Output: true

      //  Example 2:
      //  Input: -121
      //  Output: false
      //  Explanation: From left to right, it reads -121. From right to left, it becomes 121-. Therefore it is not a palindrome.

      //  Example 3:
      //  Input: 10
      //  Output: false
      //  Explanation: Reads 01 from right to left. Therefore it is not a palindrome.

      //  Follow up:
      //  Coud you solve it without converting the integer to a string?


// Runtime: 7 ms, faster than 77.61% of Java online submissions for Palindrome Number.
// Memory Usage: 38.9 MB, less than 51.48% of Java online submissions for Palindrome Number.

public class Rev {
    public static void main(String[] args) {
        System.out.println(Solution.isPalindrome(100));
    }

  public static   class Solution {
        public static boolean isPalindrome(int x) {

            int y = x;
            int delitel = (int) Math.log10(x);
            delitel = (int) Math.pow(10, delitel);   // число для нахождения начальных цифр
                        if (x < 0) {
                               return false;
            } else {
                while (x != 0) {
                    int ostatok = y % 10;  // конечная цифра
                    int chislo = x / delitel;
                    int otvet = chislo % 10;// начальная цифра
                    delitel = delitel / 10; // новый делитель для следующего шага
                    y = y / 10;
                    if (delitel == 0)
                        break;
                    if (otvet != ostatok) {
                        return false;
                    }
                }
            }
return true;
        }
    }
}
