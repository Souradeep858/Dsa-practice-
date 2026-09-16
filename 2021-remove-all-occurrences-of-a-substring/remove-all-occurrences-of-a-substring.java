class Solution {

    public String removeOccurrences(String s, String part) {
        return helper("", s, part);
    }

    String helper(String p, String up, String part) {

        if (up.isEmpty()) {
            return p;
        }

        // Take one character
        p = p + up.charAt(0);

        // If processed string ends with "part", remove it
        if (p.endsWith(part)) {
            p = p.substring(0, p.length() - part.length());
        }

        return helper(p, up.substring(1), part);
    }
}