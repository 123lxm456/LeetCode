/*
class MyHashSet {
    List<Integer> list;

    public MyHashSet() {
        list = new ArrayList<>();
    }
    
    public void add(int key) {
        for(int x:list)
        {
            if(x == key)
            {
                return;
            }
        }
        list.add(key);
    }
    
    public void remove(int key) {
        int n = list.size();
        for(int i = 0; i < n; i++)
        {
            if(list.get(i) == key)
            {
                list.remove(i);
                break;
            }
        }
    }
    
    public boolean contains(int key) {
        for(int x:list)
        {
            if(x == key)
            {
                return true;
            }
        }
        return false;
    }
}

*/

/**
//法一：
class MyHashSet {
    boolean[] nodes = new boolean[1000009];
    
    public void add(int key) {
        nodes[key] = true;
    }
    
    public void remove(int key) {
        nodes[key] = false;
    }
    
    public boolean contains(int key) {
        return nodes[key];
    }
}
*/


//法二：
class MyHashSet {
    private static final int BASE = 769;
    private LinkedList<Integer>[] data;

    public MyHashSet() {
        data = new LinkedList[BASE];
        for (int i = 0; i < BASE; ++i) {
            data[i] = new LinkedList<>();
        }
    }
    
    public void add(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = data[index];
        // 先判断是否存在，避免重复添加
        if (!bucket.contains(key)) {
            bucket.add(key);
        }
    }
    
    public void remove(int key) {
        // 1. 计算key对应的桶索引
        int index = hash(key);
        // 2. 获取对应的桶（链表）
        LinkedList<Integer> bucket = data[index];
        // 3. 移除key（LinkedList的remove(Integer)方法会删除第一个匹配的元素）
        // 注意：要转成Integer，避免调用remove(int index)方法
        bucket.remove((Integer) key);
    }
    
    
    public boolean contains(int key) {
        int index = hash(key);
        LinkedList<Integer> bucket = data[index];
        return bucket.contains(key);
    }

    private static int hash(int key) {
        return key % BASE;
    }
}




/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */
