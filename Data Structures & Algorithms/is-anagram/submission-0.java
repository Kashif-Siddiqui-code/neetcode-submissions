class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> mapS = new HashMap<>();
        HashMap<Character, Integer> mapT = new HashMap<>();

        // Store frequency of characters in both strings
        for (int i = 0; i < s.length(); i++) {
            char chS = s.charAt(i);
            char chT = t.charAt(i);

            mapS.put(chS, mapS.getOrDefault(chS, 0) + 1);
            mapT.put(chT, mapT.getOrDefault(chT, 0) + 1);
        }

        // Compare both hash maps
        return mapS.equals(mapT);
    }
}
