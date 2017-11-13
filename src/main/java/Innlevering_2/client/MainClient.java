package Innlevering_2.client;

public class MainClient
{
    public static void main(String [] args)
    {
        Client client = new Client("localhost", 3000);

        if(client != null)
        {
            new ClientRuntime(client);
        }
    }
}
