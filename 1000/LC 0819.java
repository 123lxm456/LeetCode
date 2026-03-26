class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        String newparagraph = paragraph.toLowerCase(); 
        StringBuilder str = new StringBuilder();
        Map<String, Integer> map = new HashMap<>();
        String maxstr = "";
        int maxcount = 0;
        for(char x:newparagraph.toCharArray())
        {
            if(x >= 'a' && x <= 'z' )
            {
                str.append(x);
            }
            else
            {
                String newstr = str.toString();
                str = new StringBuilder();
                boolean isBanned = false;
                for(int i = 0; i < banned.length; i++)
                {
                    if(banned[i].equals(newstr))
                    {
                        isBanned = true;
                        break;
                    }
                }
                if(!isBanned && !newstr.isEmpty())
                {
                    if(map.containsKey(newstr))
                    {
                        map.put(newstr, map.get(newstr) + 1);
                    }
                    else
                    {
                        map.put(newstr,1);
                    }
                    if(map.get(newstr) > maxcount)
                    {
                        maxstr = newstr;
                        maxcount = map.get(newstr);
                    }
                }
            }
        }
        String newstr = str.toString();
            str = new StringBuilder();
            boolean isBanned = false;
            for(int i = 0; i < banned.length; i++)
            {
                if(banned[i].equals(newstr))
                {
                    isBanned = true;
                    break;
                }
            }
            if(!isBanned && !newstr.isEmpty())
            {
                if(map.containsKey(newstr))
                {
                    map.put(newstr, map.get(newstr) + 1);
                }
                else
                {
                    map.put(newstr,1);
                }
                if(map.get(newstr) > maxcount)
                {
                    maxstr = newstr;
                    maxcount = map.get(newstr);
                }
            }
        return maxstr;
    }
}
