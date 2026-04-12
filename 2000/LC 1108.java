class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();
        for(char add:address.toCharArray())
        {
            if(add == '.')
            {
                str.append("[.]");
            }
            else
            {
                str.append(add);
            }
        }
        return str.toString();
    }
}

/**
class Solution {
    public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }
}

*/