/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package distr.exer1;

import java.util.Date;

/**
 *
 * @author Marc
 */
public class Lesson {
   public void setTitle(String title){
       this.title=title;
   } 
   
  public String getTitle(){
      return title;
  }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }
  
  
    
   
   private String title;
   private String day;
   private  String startTime;

    public Lesson(String title, String day, String startTime) {
        this.title = title;
        this.day = day;
        this.startTime = startTime;
    }
   
   
  @Override
  public String toString(){
   return title +" " +day+" " +startTime;   
  }
  
  @Override
  public boolean equals (Object other){
  
      if (other!= null && other instanceof Lesson){
      Lesson compare=(Lesson)other;
      
     
    
           return title.equals(compare.title)&& day.equals(compare.day)&&startTime.equals(compare.startTime);
           
       }
       return false;
  }
      
}
