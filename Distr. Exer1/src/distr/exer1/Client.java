/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distr.exer1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 *
 * @author Marc
 */
public class Client {
    public static void main(String[] args) throws IOException{
       
        boolean running=true;
        Scanner scanner =new Scanner(System.in);
        while (running){
            String input=scanner.nextLine();
            try (Socket socket=new Socket("localhost", 8080)){
        PrintWriter pw = new PrintWriter(socket.getOutputStream(), true);
        
        BufferedReader br = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                   
            
            if (input.equals("exit")){
                running=false;
            }
            else {
                pw.println(input);
                System.out.println(br.readLine());
        }
        }
        }
    }
}

    

