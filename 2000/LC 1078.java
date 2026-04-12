class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] str = text.split(" ");
        List<String> list = new ArrayList<>();
        for(int i = 2; i < str.length; i++)
        {
            if(str[i - 2].equals(first) && str[i - 1].equals(second))
            {
                list.add(str[i]);
            }
        }
        return list.toArray(new String[0]);
    }
}
