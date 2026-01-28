class Solution {
    public boolean detectCapitalUse(String word) {
        return all(word) || allnot(word) || fir(word);
    }
    public boolean all(String word)
    {
        boolean result = true;
        for(int i = 0; i < word.length(); i++)
        {
            if(!(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'))
            {
                result = false;
                break;
            }
        }
        return result;
    }
    public boolean allnot(String word)
    {
        boolean result = true;
        for(int i = 0; i < word.length(); i++)
        {
            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
            {
                result = false;
                break;
            }
        }
        return result;
    }
    public boolean fir(String word)
    {
        boolean result = false;
        if(word.charAt(0) >= 'A' && word.charAt(0) <= 'Z')
        {
            result = true;
            for(int i = 1; i < word.length(); i++)
            {
                if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z')
                {
                    result = false;
                    break;
                }
            }
        }
        return result;
    }
}
/**
class Solution {
    public boolean detectCapitalUse(String word) {
        // 若第 1 个字母为小写，则需额外判断第 2 个字母是否为小写
        if (word.length() >= 2 && Character.isLowerCase(word.charAt(0)) && Character.isUpperCase(word.charAt(1))) {
            return false;
        }
        
        // 无论第 1 个字母是否大写，其他字母必须与第 2 个字母的大小写相同
        for (int i = 2; i < word.length(); ++i) {
            if (Character.isLowerCase(word.charAt(i)) ^ Character.isLowerCase(word.charAt(1))) {
                return false;
            }
        }
        return true;
    }
}
 */
