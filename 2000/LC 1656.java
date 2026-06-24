class OrderedStream {

    String[] str;
    int ptr;
    public OrderedStream(int n) {
        str = new String[n + 1];
        ptr = 1;
    }
    
    public List<String> insert(int idKey, String value) {
        List<String> list = new ArrayList<>();
        str[idKey] = value;
        int i = ptr;
        while(i < str.length && str[i] != null){
            list.add(str[i]);
            i++;
        }
        ptr = i;
        return list;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */


 /*
 class OrderedStream {
    private String[] stream;
    private int ptr;

    public OrderedStream(int n) {
        stream = new String[n + 1];
        ptr = 1;
    }

    public List<String> insert(int idKey, String value) {
        stream[idKey] = value;
        List<String> res = new ArrayList<String>();
        while (ptr < stream.length && stream[ptr] != null) {
            res.add(stream[ptr]);
            ++ptr;
        }
        return res;
    }
}
*/
