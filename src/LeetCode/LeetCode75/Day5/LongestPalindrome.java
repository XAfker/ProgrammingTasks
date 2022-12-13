package LeetCode.LeetCode75.Day5;

public class LongestPalindrome {
    public static void main(String[] args) {
    }

    public int longestPalindrome(String s) {
        int[] count = new int['z' - 'A' + 1];
        int res = 0;
        boolean odd = false;

        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i)-'A']++;
        }
        for(int i = 0; i < count.length; i++){
            res += count[i];
            if(count[i]%2 != 0) {
                res--;
                odd = true;
            }
        }
        return odd ? res + 1 : res;
    }
}


