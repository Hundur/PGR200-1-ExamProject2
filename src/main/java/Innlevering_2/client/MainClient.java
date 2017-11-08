package Innlevering_2.client;

import Innlevering_2.client.io.IO_Controller;

public class MainClient
{
    public static void main(String [] args)
    {
        //Todo: Find IPv4 address dynamically
        Client client = new Client("10.0.0.49", 3000);

        if(client != null)
        {
            new ClientRuntime(client);
        }
    }
}
