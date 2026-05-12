class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < words.length; i++){
            for(int j = 0; j < words.length; j++){
                if(j == i){
                    continue;
                }
                if(words[j].contains(words[i])){
                    if(!list.contains(words[i])){
                        list.add(words[i]);
                    }
                }
            }
        }
        return list;
    }
}

/**
class Solution {
    public List<String> stringMatching(String[] words) {
        List<String> ret = new ArrayList<String>();
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < words.length; j++) {
                if (i != j && words[j].contains(words[i])) {
                    ret.add(words[i]);
                    break;
                }
            }
        }
        return ret;
    }
}

*/
