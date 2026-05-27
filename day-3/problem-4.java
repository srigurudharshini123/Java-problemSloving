// group word by its length
// input:[cat.mat,dog,apple]
// output:3=[cat.mat,dog]
          // 5=[apple]
import java.util.*;
public class Main {
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        List<String> s = new ArrayList<String>();
        for (int i = 1; i <= n; i++) {
            String s2 = scan.next();
            s.add(s2);
        }
        Map<Integer, List<String>> map = new LinkedHashMap<>();
        for (String word : s) {

            int len = word.length();
            if (!map.containsKey(len)) {
                map.put(len, new ArrayList<>());
            }
            map.get(len).add(word);
        }
        for (Integer key : map.keySet()) {
            System.out.println(key + "=" + map.get(key));
        }
    }
}
