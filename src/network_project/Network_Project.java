/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package network_project;
import java.net.Socket;
import java.util.*;
/**
 *
 * @author Momen 
 */
public class Network_Project {
static ArrayList<Socket> arrsocket=new ArrayList<>();
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        new ClientChat().setVisible(true);
        new ClientChat().setVisible(true);
        new ClientChat().setVisible(true);
        new TCPServerN().setVisible(true);
    }
    
}
