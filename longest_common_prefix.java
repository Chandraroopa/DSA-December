class Solution {
    public String longestCommonPrefix(String[] strs) {
      if (strs == null || strs.length == 0)
            return "";

        Arrays.sort(strs);

        String str1 = strs[0];
        String str2 = strs[strs.length - 1];

        StringBuilder sol = new StringBuilder();

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) == str2.charAt(i)) {
                sol.append(str1.charAt(i));
            } else {
                break;
            }
        }

        return sol.toString();
    }
}
