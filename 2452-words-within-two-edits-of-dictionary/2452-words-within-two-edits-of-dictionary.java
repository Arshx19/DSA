class Solution {
    public List<String> twoEditWords(String[] ar, String[] arr) {
        List<String> ans = new ArrayList<>();
        for(int i=0;i<ar.length;i++){
            String word = ar[i];
            for(int j=0;j<arr.length;j++){
                String words = arr[j];
                
                int count=0;
                for(int k=0;k<words.length();k++){
                    if(word.charAt(k)!=words.charAt(k)){
                        count++;
                    }  
                }
                if(count<=2){
                    ans.add(ar[i]);
                    break;
                }
            }
        }
        return ans;
    }
}