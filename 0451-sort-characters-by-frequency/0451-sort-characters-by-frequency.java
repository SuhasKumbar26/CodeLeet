class Solution {
    class Pair{
        char ch;
        int frq;
        Pair(char c, int f){
            this.ch = c;
            this.frq = f;
        }
    }

    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for(char c: s.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }

        List<Pair> list = new ArrayList<>();

        for(char key: map.keySet()){
            Pair p = new Pair(key, map.get(key));
            list.add(p);
        }

        Collections.sort(list, (a, b) -> b.frq - a.frq);

        StringBuilder ans = new StringBuilder();

        for(int i = 0; i < list.size(); i++){
            StringBuilder sb = new StringBuilder();
            int count = list.get(i).frq;
            for(int j = 1; j <= count; j++){
                sb.append(list.get(i).ch);
            }

            ans.append(sb.toString());
        }

        return ans.toString();
    }
}