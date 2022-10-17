public class Solution {
    public static int isCyclicRotation(String p, String q)  {
        if (p.length() != q.length())
            return 0;
 
        Queue<Character> q1 = new LinkedList<>();
        for (int i = 0; i < p.length(); i++) {
            q1.add(p.charAt(i));
        }
 
        Queue<Character> q2 = new LinkedList<>();
        for (int i = 0; i < q.length(); i++) {
            q2.add(q.charAt(i));
        }
 
        int k = q.length();
        while (k > 0) {
            k--;
            char ch = q2.peek();
            q2.remove();
            q2.add(ch);
            if (q2.equals(q1))
                return 1;
        }
 
        return 0;
    }
