class Solution {
    public boolean closeStrings(String w1, String w2) {
        int[] s1=new int[26];
        int[] s2=new int[26];
        int n=w1.length(),n2=w2.length();
        if(n!=n2) return false;
        for(int i=0;i<n;i++){
            s1[w1.charAt(i)-'a']++;
        }
        for(int i=0;i<n;i++){
            s2[w2.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++){
            if((s1[i]==0&&s2[i]!=0) || (s2[i]==0&&s1[i]!=0)){
                return false;
            }
        }
        Arrays.sort(s1);
        Arrays.sort(s2);

        for(int i=0;i<26;i++){
            if(s1[i]!=s2[i]) return false;
        }
        return true;
    }
}