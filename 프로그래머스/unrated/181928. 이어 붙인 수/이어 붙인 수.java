class Solution {
    public int solution(int[] num_list) {
        String even = "";
        String odd = "";
        for (int i : num_list) {
            if (i % 2 == 0) even += i;
            else odd += i;
        }
        int answer = Integer.parseInt(even) + Integer.parseInt(odd);
        return answer;
    }
}