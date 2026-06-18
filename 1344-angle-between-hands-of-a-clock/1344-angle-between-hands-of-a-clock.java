class Solution {
    public double angleClock(int hour, int minutes) {
        double minutesangle=minutes*6;
        double hourangles=(hour*30) + (minutes*0.5);
        double ans=Math.abs(minutesangle-hourangles);
        return Math.min(ans,360-ans);
    }
}