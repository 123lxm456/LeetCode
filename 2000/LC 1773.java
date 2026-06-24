class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int m = items.size(), count = 0;
        if(ruleKey.equals("type")){
            for(int i = 0; i < m; i++){
                if(items.get(i).get(0).equals(ruleValue)){
                    count++;
                }
            }
        }
        else if(ruleKey.equals("color")){
            for(int i = 0; i < m; i++){
                if(items.get(i).get(1).equals(ruleValue)){
                    count++;
                }
            }
        }
        else{
            for(int i = 0; i < m; i++){
                if(items.get(i).get(2).equals(ruleValue)){
                    count++;
                }
            }
        }
        return count;
    }
}


/**
//最优
class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = new HashMap<String, Integer>() {{
            put("type", 0);
            put("color", 1);
            put("name", 2);
        }}.get(ruleKey);
        int res = 0;
        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                res++;
            }
        }
        return res;
    }
}

*/