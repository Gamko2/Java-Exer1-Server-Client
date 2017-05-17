/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distr.exer1;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author Marc
 */
public class Server {
    public static void main(String[] args) throws IOException {
      Schedule schedule=new Schedule();
      ServerSocket listener= new ServerSocket(8080);
      boolean running=true;
      while (running){
      Socket socket=listener.accept();
          System.out.println("Client connected");
      
      InputStream is=socket.getInputStream();
      InputStreamReader isr=new InputStreamReader(is);
      BufferedReader br=new BufferedReader(isr);

      PrintWriter out= new PrintWriter (socket.getOutputStream(), true);       
      
      
      while (br.ready()) {
                 String input=br.readLine(); 
                 System.out.println(input);
      String[]commands = input.split(" ");
      switch (commands[0]){
          case "addLesson":
              schedule.addLesson(new Lesson(commands[1],commands[2],commands[3]));
              out.println("Lesson added");
          break;
          default:
              out.println("Invalid command");
          
          
      }
      for (Lesson lesson: schedule.getAllLessons()){
          System.out.println(lesson);
      }
      
      }
    }
    }
    }

