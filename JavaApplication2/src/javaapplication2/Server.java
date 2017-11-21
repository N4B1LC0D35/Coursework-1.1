/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coursework1;


import coursework1.Shape;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;





/**
 *
 * @author M00555527
 */
public class Server {

   private int _port;

    Server(int port) {
        _port = port;
    }

    public void start() {

        try {
            final ServerSocket server = new ServerSocket(_port);

            InputStream in = new ServerSocket(8000).accept().getInputStream();
            //final Scanner in = new Scanner(clientConnection.getInputStream());

            Object object = new ObjectInputStream(in).readObject();
            System.out.println(object.getClass() + ": " + object);
            
            //ObjectOutputStream outputToClient = new ObjectOutputStream(clientConnection.getOutputStream());
            //ObjectInputStream fromClient = new ObjectInputStream(clientConnection.getInputStream());

            /*
            while (in.hasNext()) {
                final String clientRequest = in.nextLine();
                if (!clientRequest.isEmpty()) {
                    out.println("Request received '" + clientRequest.toUpperCase() + "'");
                }
            }
             */
            ArrayList<Shape> castedObject = (ArrayList<Shape>) object;
            for (Shape s : castedObject) {
                s.printInfo();
                System.out.println(s);
            }
        } catch (IOException ex) {
            System.out.println("ERROR: " + ex.getMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}




