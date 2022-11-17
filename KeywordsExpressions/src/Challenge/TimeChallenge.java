package Challenge;

public class TimeChallenge{
    public static void main(String[] args) {
        String resultStringOne = getDurationString(100, 12);
        System.out.println(resultStringOne);

        String resultStringTwo = getDurationString(6012);
        System.out.println(resultStringTwo);
    }

    public static String getDurationString(int minutes, int seconds){
        if(validateData(minutes, seconds)){
            int totalHours = minutes / 60;
            int totalMinutes = minutes % 60;

            return getResultString(totalHours, totalMinutes, seconds);
        }
        return "Invalid value";
    }

    public static String getDurationString(int seconds){
        if(!(seconds < 0)){
            int totalHours = seconds / 3600;
            seconds %= 3600;
            int totalMinutes = seconds / 60;
            seconds %= 60;

            return getResultString(totalHours, totalMinutes, seconds);
        }
        return "Invalid value";
    }
    public static boolean validateData(int minutes, int seconds){
        return (minutes >= 0 && seconds >= 0 && seconds <= 59);
    }

    public static String getResultString(int hours, int minutes, int seconds){
        if(hours < 10)
            return ("0" + hours + "h " + minutes + "m " + seconds + "s ");
        if(minutes < 10)
            return (hours + "h " + "0" +  minutes + "m " + seconds + "s ");
        if(seconds < 10)
            return (hours + "h " + minutes + "m " + "0" + seconds + "s ");

        return (hours + "h " + minutes + "m " + seconds + "s ");
    }
}
