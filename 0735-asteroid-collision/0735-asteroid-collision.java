class Solution {
    public int[] asteroidCollision(int[] a) {
        Stack<Integer> st=new Stack<>();
        for(int i : a){
            if(i>0 || st.isEmpty()){
                st.push(i);
                continue;
            }
            while(!st.isEmpty() && st.peek()>0 && st.peek()<Math.abs(i)){
                st.pop();
            }
            if(!st.isEmpty() && st.peek()==Math.abs(i)){
                st.pop();
            }
            else if(st.isEmpty() || st.peek()<0){
                st.push(i);
            }
        }
        int[] arr=new int[st.size()];
        for(int i=st.size()-1;i>=0;i--){
            arr[i]=st.pop();
        }
        return arr;
    }
}