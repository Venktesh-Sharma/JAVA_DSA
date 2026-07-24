import java.util.*;

public class groupAnagrams {

    public static List<List<String>> groupAnagrams(String[] strs) {

        HashMap<String, ArrayList<String>> map = new HashMap<>();

        for (String word : strs) {

            char[] ch = word.toCharArray();
            Arrays.sort(ch);

            String key = new String(ch);

            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(word);
        }

        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        List<List<String>> ans = groupAnagrams(strs);

        System.out.println(ans);
    }
}