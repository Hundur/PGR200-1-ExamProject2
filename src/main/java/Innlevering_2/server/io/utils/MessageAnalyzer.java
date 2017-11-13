package Innlevering_2.server.io.utils;

import static Innlevering_2.server.io.utils.DBInformation.getSubject;
import static Innlevering_2.server.io.utils.DBInformation.getTable;
import static Innlevering_2.server.io.utils.DBInformation.structureCheckTable;

public class MessageAnalyzer
{

    public static String analyzeMessage(String message)
    {
        String finalMsg;
        String information;
        String msg = message.trim();

        if(msg.contains("GET TABLE"))
        {
            finalMsg = msg.replace("GET TABLE ", "");

            if(finalMsg.equals(""))
                information = "Error: Missing searchword\n" +
                              "If you need help, type \"help\"\n";
            else if(structureCheckTable(finalMsg))
                information = getTable(finalMsg);
            else
                information = "Error: " + finalMsg + " is not a valid table";
        }

        else if(msg.contains("GET SUBJECT"))
        {
            finalMsg = msg.replace("GET SUBJECT ", "");

            if(finalMsg.equals("GET SUBJECT"))
                information = "Error: Missing searchword\n" +
                              "If you need help, type \"help\"\n";
            else if(getSubject(finalMsg).equals("null\n"))
                information = "Error: " + finalMsg + " is not a valid subjectcode";
            else
                information = getSubject(finalMsg);

        }

        else if(msg.equals("HELP"))
            information = "Getting a table: \"Get table ...\"\n" +
                          "Available tables: Subject - Teacher - Room\n" +
                          "Getting a subject: \"Get subject ...\"\n" +
                          "Available subjects: PGR1100 - DB1100\n" +
                          "To exit the server: \"Exit\"\n";

        else
            information = "Error: Not a command\n" +
                          "If you need help, type \"help\"\n";



        return information;
    }
}
