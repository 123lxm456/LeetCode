class Solution {
    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(sub(date1) - sub(date2));
    }
    public int sub(String date){
        int[] month = {0,31,28,31,30,31,30,31,31,30,31,30,31};
        int year = Integer.parseInt(date.substring(0,4));
        int mon = Integer.parseInt(date.substring(5,7));
        int day = Integer.parseInt(date.substring(8,10));
        int days = 0;
        for(int y = 1971; y < year; y++){
            days += 365;
            if(run(y))
            {
                days++;
            }
        }
        for(int m = 1; m < mon; m++)
        {
            days += month[m];
        }
        if(run(year) && mon > 2)
        {
            days++;
        }
        days += day;
        return days;
    }
    public boolean run(int y)
    {
        if(y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
        {
            return true;
        }
        return false;
    }
}