package Innlevering_2.database;

import Innlevering_1.io.IO_Controller;

/**
 * Fills the database
 *
 * @author Jesper Dahl Ellingsen
 */
public class FillDatabase
{
    public static void main(String [] args)
    {
        IO_Controller io = new IO_Controller("db.properties");

        io.createTables();
        io.insertIntoTable(io.split(io.readInput("src\\main\\" +
                                                         "resources\\DBTestInput")));
    }
}
