class Solution {
    public String capitalizeTitle(String title) {
        String[] word = title.split(" ");
        for(int i=0;i<word.length;i++){
            word[i] = word[i].toLowerCase();
            if(word[i].length()>2){
                word[i] = Character.toUpperCase(word[i].charAt(0)) + word[i].substring(1);
            }
        }
        return String.join(" ", word);
    }
}