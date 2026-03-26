class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email:emails)
        {
            String str = Email(email);
            set.add(str);
        }
        return set.size();
    }
    public String Email(String str)
    {
        StringBuilder newstr = new StringBuilder();
        boolean localfinished = false;
        for(int i = 0; i < str.length(); i++)
        {
            char num = str.charAt(i);
            if(num == '@')
            {
                newstr.append(num);
                localfinished = true;
            }
            else if(!localfinished && num == '.')
            {
                continue;
            }
            else if(!localfinished && num == '+')
            {
                while(str.charAt(i) != '@')
                {
                    i++;
                }
                i--;
            }
            else 
            {
                newstr.append(num);
            }
        }
        return newstr.toString();
    }
}
/**
//最优
class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> emailSet = new HashSet<String>();
        for (String email : emails) {
            int i = email.indexOf('@');
            String local = email.substring(0, i).split("\\+")[0]; // 去掉本地名第一个加号之后的部分
            local = local.replace(".", ""); // 去掉本地名中所有的句点
            emailSet.add(local + email.substring(i));
        }
        return emailSet.size();
    }
}
*/
