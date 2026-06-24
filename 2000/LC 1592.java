class Solution {
    public String reorderSpaces(String text) {
        String[] words = text.trim().split("\\s+");
        int spaceCount = 0;
        for(char str:text.toCharArray()){
            if(str == ' '){
                spaceCount++;
            }
        }
        StringBuilder str = new StringBuilder();
        if(words.length == 1){
            str.append(words[0]);
            for(int i = 0; i < spaceCount; i++){
                str.append(" ");
            }
            return str.toString();
        }
        for(int i = 0; i < words.length - 1; i++){
            str.append(words[i]);
            for(int j = 0; j < (spaceCount / (words.length - 1)); j++){
                str.append(" ");
            }
        }
        str.append(words[words.length - 1]);
        for(int i = 0; i < (spaceCount % (words.length - 1)); i++){
            str.append(" ");
        }
        return str.toString();
    }
}