class Solution {
    public int reverse(int y) {
         int answer = 0;
        while (y != 0) {
            int digits = y % 10;
            if (answer > Integer.MAX_VALUE / 10 || (answer == Integer.MAX_VALUE / 10 && digits > 7)) return 0;
            if (answer < Integer.MIN_VALUE / 10 || (answer == Integer.MIN_VALUE / 10 && digits < -8)) return 0;
            
            answer = answer * 10 + digits;
            y /= 10;
        }
        return answer;
    }
}