package Innlevering_2.server.io.utils;

import Innlevering_1.io.IO_Controller;

import java.util.List;

public class DBInformation
{
    public static String getTable(String tableName)
    {
        IO_Controller db = new IO_Controller("db.properties");
        List<String> table = db.getTable(tableName);
        String ret = "";

        for(String row : table)
            ret += row + "\n";

        return ret;
    }

    public static String getSubject(String subjectCode)
    {
        IO_Controller db = new IO_Controller("db.properties");
        return db.getSpecifiedSubject(subjectCode) + "\n";
    }
}
