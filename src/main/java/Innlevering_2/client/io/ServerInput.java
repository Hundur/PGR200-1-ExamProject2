package Innlevering_2.client.io;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class ServerInput
{
    private DataInputStream input;

    public ServerInput(Socket conn) throws IOException
    {
        input = new DataInputStream(conn.getInputStream());
    }

    public String getMessage() throws IOException
    {
        return input.readUTF();
    }

    public void close() throws IOException
    {
        input.close();
    }
}
