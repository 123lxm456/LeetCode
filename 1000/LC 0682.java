class Solution {
    public int calPoints(String[] ops) {
        int ret = 0;
        List<Integer> points = new ArrayList<Integer>();
        for (String op : ops) {
            int n = points.size();
            switch (op) {
                case "+":
                    ret += points.get(n - 1) + points.get(n - 2);
                    points.add(points.get(n - 1) + points.get(n - 2));
                    break;
                case "D":
                    ret += 2 * points.get(n - 1);
                    points.add(2 * points.get(n - 1));
                    break;
                case "C":
                    ret -= points.get(n - 1);
                    points.remove(n - 1);
                    break;
                default:
                    ret += Integer.parseInt(op);
                    points.add(Integer.parseInt(op));
                    break;
            }
        }
        return ret;
    }
}

/*
class Solution {
    public int calPoints(String[] operations) {
        List<Integer> list = new ArrayList<>();
        int k = 0;
        for(int i = 0; i < operations.length; i++)
        {
            String cur = operations[i];
            if(cur.equals("C"))
            {
                list.remove(k-1);
                k--;
            }
            else if(cur.equals("D"))
            {
                list.add(list.get(k-1) * 2);
                k++;
            }
            else if(cur.equals("+"))
            {
                list.add(list.get(k - 2) + list.get(k-1));
                k++;
            }
            else
            {
                list.add(Integer.parseInt(cur));
                k++;
            }
        }
        int sum = 0;
        for(int i = 0; i < list.size(); i++)
        {
            sum += list.get(i);
        }
        return sum;
    }
}
*/
