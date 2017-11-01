package Innlevering_2.client.io;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Output
{
    private DataOutputStream output;

    public Output(Socket conn) throws IOException
    {
        output = new DataOutputStream(conn.getOutputStream());
        output.flush();
    }

    public void sendMessage(int message) throws IOException
    {
        output.writeInt(message);
        output.flush();
    }

    public void close() throws IOException
    {
        output.close();
    }
}