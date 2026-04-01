class Solution {
    public String predictPartyVictory(String senate) {
        Deque<Integer> rad =new ArrayDeque<>();
        Deque<Integer> dir =new ArrayDeque<>();
        int j=0;
        for(j=0;j<senate.length();j++){
            char i=senate.charAt(j);
            if(i=='R'){
                rad.offerLast(j);
                continue;
            }
            dir.offerLast(j);
        }
        while(!rad.isEmpty() && !dir.isEmpty()){
            if(rad.peekFirst()<dir.peekFirst()){
                rad.offerLast(j++);
            }else{
                dir.offerLast(j++);
            }
            rad.pollFirst();
            dir.pollFirst();
        }
        return rad.isEmpty() ? "Dire" : "Radiant";
    }
}