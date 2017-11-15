package Innlevering_2.database;

import Innlevering_1.io.IO_Controller;

public class EmptyDatabase
{
    public static void main(String [] args)
    {
        IO_Controller io = new IO_Controller("db.properties");

        io.deleteAllTables();
    }
}
