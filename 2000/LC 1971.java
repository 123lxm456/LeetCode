//并查集，困难

class Solution {
    int[] parent;

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        parent = new int[n];
        // 初始化
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
        // 合并每条边
        for (int[] e : edges) {
            union(e[0], e[1]);
        }
        return find(source) == find(destination);
    }

    // 查找根节点（路径压缩）
    private int find(int x) {
        if (parent[x] != x) {
            parent[x] = find(parent[x]);
        }
        return parent[x];
    }

    // 合并两个集合
    private void union(int x, int y) {
        int fx = find(x);
        int fy = find(y);
        if (fx != fy) {
            parent[fy] = fx;
        }
    }
}
