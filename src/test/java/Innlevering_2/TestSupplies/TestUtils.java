package Innlevering_2.TestSupplies;

import java.util.ArrayList;
import java.util.List;

public class TestUtils
{
    public static List<String> getInputList()
    {
        List<String> list = new ArrayList<String>();

        list.add("Help");
        list.add("Get table subject");
        list.add("Get table TEACHER");
        list.add("GET table roOM");
        list.add("get table wrong");
        list.add("get table");
        list.add("get subject pgr1100");
        list.add("get subject db1100");
        list.add("get subject wrong");
        list.add("get subject");
        list.add("get teacher 1");
        list.add("get teacher 2");
        list.add("get teacher 3");
        list.add("get teacher wrong");
        list.add("get teacher");
        list.add("get room f101");
        list.add("get room v101");
        list.add("get room wrong");
        list.add("get room");
        list.add("exit");

        return list;
    }

    public static List<String> getOutputList()
    {
        List<String> list = new ArrayList<String>();

        list.add("Getting a table: \"Get table ...\"\n" +
                "Available tables: Subject - Teacher - Room\n" +
                "Getting a subject: \"Get subject ...\"\n" +
                "Available subjects: PGR1100 - DB1100\n" +
                "Getting a teacher: \"Get teacher ...\"\n" +
                "Available teacherIDs: 1 - 2\n" +
                "Getting a room: \"Get room ...\"\n" +
                "Available rooms: F101 - V101\n" +
                "To exit the server: \"Exit\"\n");
        list.add("1 || DB1100 || Databaser || 100\n" +
                 "2 || PGR1100 || Programmering || 50\n");
        list.add("1 || yes || Jesper Dahl Ellingsen\n" +
                 "2 || no || Sebastian Langseth Knutsen\n");
        list.add("F101 || Fjerdingen || 70\n" +
                 "V101 || Vulkan || 130\n");
        list.add("Error: WRONG is not a valid table\n");
        list.add("Error: Missing searchword\n" +
                 "If you need help, type \"help\"\n");
        list.add("2 || PGR1100 || Programmering || 50\n");
        list.add("1 || DB1100 || Databaser || 100\n");
        list.add("Error: WRONG is not a valid subjectcode\n");
        list.add("Error: Missing searchword\n" +
                 "If you need help, type \"help\"\n");
        list.add("1 || yes || Jesper Dahl Ellingsen\n");
        list.add("2 || no || Sebastian Langseth Knutsen\n");
        list.add("Error: 3 is not a valid employeeID\n");
        list.add("Error: EmployeeID has to be a number\n");
        list.add("Error: Missing searchword\n" +
                "If you need help, type \"help\"\n");
        list.add("F101 || Fjerdingen || 70\n");
        list.add("V101 || Vulkan || 130\n");
        list.add("Error: WRONG is not a valid roomnumber\n");
        list.add("Error: Missing searchword\n" +
                 "If you need help, type \"help\"\n");
        list.add("Closed");
        return list;
    }
}
