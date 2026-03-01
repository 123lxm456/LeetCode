class Solution {
    public String toLowerCase(String s) {
        StringBuilder news = new StringBuilder();
        for(int i = 0; i < s.length(); i++)
        {
            char x = s.charAt(i);
            if(x >= 'A' && x <= 'Z')
            {
                news.append((char)(x+32));
            }
            else
            {
                news.append(x);
            }
        }
        return news.toString();
    }
}
