class q28 {

    private static void getZarr(String str, int[] Z) {
        int n = str.length();
        int L = 0, R = 0;
        for (int i = 1; i < n; ++i) {
            if (i > R) {
                L = R = i;
                while (R < n && str.charAt(R - L) == str.charAt(R)) {
                    R++;
                }
                Z[i] = R - L;
                R--;
            } else {
                int k = i - L;
                if (Z[k] < R - i + 1) {
                    Z[i] = Z[k];
                } else {
                    L = i;
                    while (R < n && str.charAt(R - L) == str.charAt(R)) {
                        R++;
                    }
                    Z[i] = R - L;
                    R--;
                }
            }
        }
    }

    public int strStr(String haystack, String needle) {
        if (needle.isEmpty()) {
            return 0;
        }
        if (needle.length() > haystack.length()) {
            return -1;
        }
        String combined = needle + "#" + haystack;
        int[] z = new int[combined.length()];
        getZarr(combined, z);
        for (int i = needle.length() + 1; i < z.length; i++) {
            if (z[i] == needle.length()) {
                return i - (needle.length() + 1);
            }
        }
        return -1;
    }
}
