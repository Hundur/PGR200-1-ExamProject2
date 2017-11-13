package Innlevering_2.server.io.utils;

import Innlevering_1.io.IO_Controller;
import Innlevering_1.io.db.DBUtil;

import java.sql.SQLException;
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

    public static boolean structureCheckTable(String table)
    {
        try
        {
            new IO_Controller("db.properties");
            DBUtil dbUtil = new DBUtil();
            return dbUtil.structureCheckTable(table);
        }
        catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
    }
}
