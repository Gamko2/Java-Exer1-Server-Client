/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distr.exer1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Marc
 */
public class Schedule {
   private List<Lesson> lessons = new ArrayList<Lesson>();
    
   public void addLesson(Lesson lesson){
       lessons.add(lesson);
   }
   
   public void removeLesson(Lesson lesson){
       lessons.remove(lesson);
   }
   
   public List<Lesson> getAllLessons(){
       return lessons;
   }
   
   public int getFreeTime(String day){
       int lessonCount=0;
       for (Lesson lesson:lessons){
           if (lesson.getDay().equals(day)){
               lessonCount++;
           }
       }
       return 10-lessonCount;
   }
   
   public void saveToFile(String filename) throws IOException{
     FileWriter fw= new FileWriter(filename);
     BufferedWriter bw = new BufferedWriter(fw);
     for (Lesson lesson: getAllLessons()){
         bw.write(lesson.toString());
         bw.write("\r\n");
     }
     bw.close();
   }
   
}

