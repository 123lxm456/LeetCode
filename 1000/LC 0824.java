
class Solution {
    public String toGoatLatin(String sentence) {
        int n = sentence.length();
        StringBuilder str = new StringBuilder();
        StringBuilder cur = new StringBuilder();
        int y = 0;
        for(int i = 0; i < n; i++)
        {
            char x = sentence.charAt(i);
            if(x != ' ')
            {
                cur.append(x);
            }
            else
            {
                y++;
                String strcur = cur.toString();
                cur.setLength(0);
                process(strcur,str,y);
                str.append(" ");
            }
        }
        y++;
        String strcur = cur.toString();
        process(strcur,str,y);
        return str.toString();
    }
    public void process(String strcur, StringBuilder str, int y)
    {
        char num = strcur.charAt(0);
        if(num == 'A' || num == 'a' || num == 'E' || num == 'e' || num == 'I' || num == 'i' || num == 'O' || num == 'o' || num == 'U' || num == 'u')
        {
            str.append(strcur + "ma");

        }
        else
        {
            str.append(strcur.substring(1,strcur.length()) + num + "ma");
        }
        for(int j = 0; j < y; j++)
        {
            str.append("a");
        }
    }
}
/*
//最优
class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<Character>() {{
            add('a');
            add('e');
            add('i');
            add('o');
            add('u');
            add('A');
            add('E');
            add('I');
            add('O');
            add('U');
        }};

        int n = sentence.length();
        int i = 0, cnt = 1;
        StringBuffer ans = new StringBuffer();

        while (i < n) {
            int j = i;
            while (j < n && sentence.charAt(j) != ' ') {
                ++j;
            }

            ++cnt;
            if (cnt != 2) {
                ans.append(' ');
            }
            if (vowels.contains(sentence.charAt(i))) {
                ans.append(sentence.substring(i, j));
            } else {
                ans.append(sentence.substring(i + 1, j));
                ans.append(sentence.charAt(i));
            }
            ans.append('m');
            for (int k = 0; k < cnt; ++k) {
                ans.append('a');
            }

            i = j + 1;
        }

        return ans.toString();
    }
}
*/
