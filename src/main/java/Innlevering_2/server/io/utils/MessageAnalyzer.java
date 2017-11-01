package Innlevering_2.server.io.utils;

import static Innlevering_2.server.io.utils.DBInformation.getSubject;
import static Innlevering_2.server.io.utils.DBInformation.getTable;

public class MessageAnalyzer
{

    public static String analyzeMessage(int message)
    {
        String information = "";

        switch (message)
        {
            case 1: information = getTable("SUBJECT");
                break;
            case 2: information = getTable("TEACHER");
                break;
            case 3: information = getTable("ROOM");
                break;
            case 4: information = getSubject("PGR1100");
                break;
            case 5: information = getSubject("DB1100");
                break;
            default: information = "Not a command\n";
                break;
        }

        return information;
    }
}
