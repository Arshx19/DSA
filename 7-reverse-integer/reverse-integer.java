class Solution {
    public int reverse(int n) {
        int sign = (n < 0) ? -1 : 1;
    long temp = Math.abs((long)n);
    long sum = 0;

    while (temp > 0) {
        int rem = (int)(temp % 10);
        sum = sum * 10 + rem;
        temp /= 10;
    }

    sum *= sign;

    if (sum > Integer.MAX_VALUE || sum < Integer.MIN_VALUE) {
        return 0;
    }

    return (int) sum;
    }
}