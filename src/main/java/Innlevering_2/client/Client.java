package Innlevering_2.client;

import Innlevering_2.client.program.ClientInit;
import Innlevering_2.client.program.ClientRuntime;

/**
 * Runs a client
 *
 * @author Jesper Dahl Ellingsen
 */
public class Client
{
    public static void main(String [] args)
    {
        ClientInit client = new ClientInit("localhost", 3000);

        if(client != null)
        {
            new ClientRuntime(client);
        }
    }
}
