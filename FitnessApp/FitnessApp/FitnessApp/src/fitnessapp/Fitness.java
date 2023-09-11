/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapp;

import java.io.Serializable;

/**
 *
 * @author presl
 */
public class Fitness implements Serializable {
    protected String day;
    protected String time;
    protected int duration;
    protected double caloriesBurned;
    
    public Fitness(String day, String time, int duration, double caloriesBurned) {
        this.day = day;
        this.time = time;
        this.duration = duration;
        this.caloriesBurned = caloriesBurned;
    }
    
    public Fitness(){
        day = " ";
        time = " ";
        duration = 0;
        caloriesBurned = 0.0;        
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public double getCaloriesBurned() {
        return caloriesBurned;
    }

    public void setCaloriesBurned(double caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
    
    public String showDetails(){
        return "Day: "+day+ " \n Time: "+time+"\n Duration: "+duration+"\n Calories Burned: "+caloriesBurned;
    }
    
}
