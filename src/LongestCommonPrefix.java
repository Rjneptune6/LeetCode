public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0) return "";
        String firstString = strs[0];
        for(int i = 0; i < firstString.length(); i++){
            char c = firstString.charAt(i);
            for(int j = 1; j < strs.length; j++){
                if(i == strs[j].length() || strs[j].charAt(i) != c)
                    return firstString.substring(0, i);
            }
        }
        return firstString;
    }

    public static void main(String[] args) {
        String[] arr = {"flower", "flow", "flight"};
        String prefix = longestCommonPrefix(arr);
        System.out.println("Prefix: " + prefix);
    }
}
