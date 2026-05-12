class Solution {
    public String destCity(List<List<String>> paths) {
        int m = paths.size();
        for(int i = 0; i < m; i++){
            String cur = paths.get(i).get(1);
            boolean find = true;
            for(int j = 0; j < m; j++){
                if(j != i && cur.equals(paths.get(j).get(0))){
                    find = false;
                }
            }
            if(find == true){
                return cur;
            }
        }
        return "";
    }
}

/**
//最优
class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> citiesA = new HashSet<String>();
        for (List<String> path : paths) {
            citiesA.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!citiesA.contains(path.get(1))) {
                return path.get(1);
            }
        }
        return "";
    }
}
*/