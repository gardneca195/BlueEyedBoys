Skip to content
This repository
Search
Pull requests
Issues
Gist
 @gardneca195
 Watch 1
  Star 0
  Fork 0 lechnejc192/quoridor
 Code  Issues 0  Pull requests 0  Projects 0  Wiki  Pulse  Graphs
Branch: master Find file Copy pathquoridor/src/main/java/Server.java
3f67524  on Jun 6, 2016
@lechnejc192 lechnejc192 Quoridor project
1 contributor
RawBlameHistory     
52 lines (43 sloc)  1.03 KB


import java.io.*;
import java.net.*;

/**
 * 
 * @author jed_lechner
 * Abstract class to extend for connection to server. 
 */

public abstract class Server {

	private int port; // port to connect to 
        private Socket client;
	
        /**
         * 
         * @param port the port to broadcast on
         * constructor
         */
	public Server(int port) {
		this.port = port;
	}	

        /**
         * Connect method for clients to connect to. Loop till a client connects.
         * Server socket closes.
         */
	public void connect() {
		try(ServerSocket socket = new ServerSocket(port)) {
			while(true) {
				System.out.println("Waiting for a connection");
				client = socket.accept();
				handle(client);
				client.close();
			}
		} catch(IOException e) {
			//e.printStackTrace();
		}
	}

        /**
         * 
         * @param client Socket the client connects to.
         * @throws IOException 
         * 
         * handles incoming IO
         */
	public abstract void handle(Socket client) throws IOException;
}
Contact GitHub API Training Shop Blog About
© 2017 GitHub, Inc. Terms Privacy Security Status Help
