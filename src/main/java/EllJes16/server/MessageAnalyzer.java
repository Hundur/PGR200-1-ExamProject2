package EllJes16.server;

public class MessageAnalyzer
{

    public static String analyzeMessage(int message)
    {
        //TODO: Make this a switch
        if(message == 1)
            return "Table SUBJECT";
        else if(message == 2)
            return "Table TEACHER";
        else if(message == 3)
            return "Table ROOM";
        else if(message == 4)
            return "SUBJECT PGR1100";
        else if(message == 5)
            return "SUBJECT DB1100";
        else
            return "Not a command";
    }
}
