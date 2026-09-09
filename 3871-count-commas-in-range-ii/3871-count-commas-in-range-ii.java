class Solution {
    public long countCommas(long n) {
        long c = 0;
        long to15 = 1_000_000_000_000_000L;
        long to12 = 1_000_000_000_000L;
        long to9 = 1_000_000_000L;
        long to6 = 1_000_000L; 
        while (n >= 1000) {
            if (n >= to15) {
                c += (n - to15 + 1) * 5;
                n = to15 - 1; 
            } 
            else if (n >= to12) {
                c += (n - to12 + 1) * 4;
                n = to12 - 1; 
            } 
            else if (n >= to9) {
                c += (n - to9 + 1) * 3;
                n = to9 - 1; 
            } 
            else if (n >= to6) {
                c += (n - to6 + 1) * 2;
                n = to6 - 1; 
            } 
            else {
                c += (n - 1000 + 1);
                n = 999; 
            }
        }
        return c;
    }
}
