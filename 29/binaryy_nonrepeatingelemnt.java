//binary 
class solve {

    static ArrayList<String> generate(int n) {
        ArrayList<String> result = new ArrayList<>();
        Queue<String> queue = new LinkedList<>();

        queue.add("1");

        for (int i = 0; i < n; i++) {
            String current = queue.poll();
            result.add(current);
            queue.add(current + "0");
            queue.add(current + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;
        ArrayList<String> binaries = generate(n);
        System.out.println(binaries);
    }
}

//Non repaeting elements

class Solution {
    public String FirstNonRepeating(String s) {
        StringBuilder result = new StringBuilder();
        int[] freq = new int[26];
        Queue<Character> queue = new LinkedList<>();

        for (char ch : s.toCharArray()) {
            freq[ch - 'a']++;
            queue.add(ch);

            while (!queue.isEmpty() && freq[queue.peek() - 'a'] > 1) {
                queue.poll();
            }

            if (queue.isEmpty()) {
                result.append('#');
            } else {
                result.append(queue.peek());
            }
        }

        return result.toString();
    }
}


