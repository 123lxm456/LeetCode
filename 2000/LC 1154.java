class Solution {
    public int dayOfYear(String date) {
        String mon = date.substring(5,7);
        String day = date.substring(8,10);
        int m = Integer.parseInt(mon);
        int d = Integer.parseInt(day);
        int year = Integer.parseInt(date.substring(0, 4));
        int sum = 0;
        for(int i = 1; i < m; i++)
        {
            switch (i) {
                case 1,3,5,7,8,10,12:
                    sum += 31;
                    break;
                case 4,6,9,11:
                    sum += 30;
                    break;
                default:
                    if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
                        sum += 29;
                    }
                    else{
                        sum += 28;
                    }
            }
        }
        return sum + d;
    }
}

/**
class Solution {
    public int dayOfYear(String date) {
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        int[] amount = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            ++amount[1];
        }

        int ans = 0;
        for (int i = 0; i < month - 1; ++i) {
            ans += amount[i];
        }
        return ans + day;
    }
}

*/
