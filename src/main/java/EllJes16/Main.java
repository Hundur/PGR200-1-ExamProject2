package EllJes16;

public class Main
{
    public static void main(String [] args)
    {
        Server server = new Server(3000);
        ClientConnection conn = new ClientConnection(server.getServer());

        conn.getConnection();
    }
}
