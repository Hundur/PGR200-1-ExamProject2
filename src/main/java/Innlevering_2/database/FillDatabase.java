package Innlevering_2.database;

import Innlevering_1.io.IO_Controller;

public class FillDatabase
{
    public static void main(String [] args)
    {
        IO_Controller io = new IO_Controller("db.properties");

        io.createTables();
        io.insertIntoTable(io.split(io.readInput("C:\\Users\\Bruker\\" +
                                                         "IdeaProjects\\Innlevering_1\\" +
                                                         "src\\test\\java\\Innlevering_1\\" +
                                                         "TestSupplies\\DBTestInput")));
    }
}
