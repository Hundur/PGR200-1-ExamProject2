package Innlevering_2.server.io.utils;

import static Innlevering_2.server.io.utils.DBInformation.*;

public class MessageAnalyzer
{
    private static final String errorSearchword = "Error: Missing searchword\n" +
                                                  "If you need help, type \"help\"\n";

    public static String analyzeMessage(String message)
    {
        String finalMsg;
        String information;
        String msg = message.trim();

        if(msg.contains("GET TABLE"))
        {
            finalMsg = msg.replace("GET TABLE ", "");

            if(finalMsg.equals("GET TABLE"))
                information = errorSearchword;

            else if(structureCheckTable(finalMsg))
                information = getTable(finalMsg);
            else
                information = "Error: " + finalMsg + " is not a valid table\n";
        }

        else if(msg.contains("GET SUBJECT"))
        {
            finalMsg = msg.replace("GET SUBJECT ", "");

            if(finalMsg.equals("GET SUBJECT"))
                information = errorSearchword;
            else if(getSubject(finalMsg).equals("null\n"))
                information = "Error: " + finalMsg + " is not a valid subjectcode\n";
            else
                information = getSubject(finalMsg);
        }

        else if(msg.contains("GET TEACHER"))
        {
            try
            {
                finalMsg = msg.replace("GET TEACHER ", "");

                if (finalMsg.equals("GET TEACHER"))
                    information = errorSearchword;
                else if (getTeacher(Integer.parseInt(finalMsg)).equals("null\n"))
                    information = "Error: " + finalMsg + " is not a valid employeeID\n";
                else
                    information = getTeacher(Integer.parseInt(finalMsg));
            }
            catch(NumberFormatException e)
            {
                e.printStackTrace();
                return information = "Error: EmployeeID has to be a number\n";
            }
        }

        else if(msg.contains("GET ROOM"))
        {
            finalMsg = msg.replace("GET ROOM ", "");

            if(finalMsg.equals("GET ROOM"))
                information = errorSearchword;
            else if(getRoom(finalMsg).equals("null\n"))
                information = "Error: " + finalMsg + " is not a valid roomnumber\n";
            else
                information = getRoom(finalMsg);
        }

        else if(msg.equals("HELP"))
            information = "Getting a table: \"Get table ...\"\n" +
                          "Available tables: Subject - Teacher - Room\n" +
                          "Getting a subject: \"Get subject ...\"\n" +
                          "Available subjects: PGR1100 - DB1100\n" +
                          "Getting a teacher: \"Get teacher ...\"\n" +
                          "Available teacherIDs: 1 - 2\n" +
                          "Getting a room: \"Get room ...\"\n" +
                          "Available rooms: F101 - V101\n" +
                          "To exit the server: \"Exit\"\n";

        else
            information = "Error: Not a command\n" +
                          "If you need help, type \"help\"\n";



        return information;
    }
}