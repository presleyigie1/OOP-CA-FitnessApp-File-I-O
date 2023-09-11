/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapp;

/**
 *
 * @author presl
 */
public class GymWorkout extends Fitness {
    //vars
    private int numOfReps;

    public GymWorkout(int numOfReps, String day, String time, int duration, double caloriesBurned) {
        //constructor from superclass
        super(day, time, duration, caloriesBurned);
        this.numOfReps = numOfReps;
    }
    //method of GymWorkout so doesnt give error in GUI code
    public GymWorkout(){
        
    }
    //getters and setters for vars
    public int getNumOfReps() {
        
        return numOfReps;
    }

    public void setNumOfReps(int numOfReps) {
        
        this.numOfReps = numOfReps;
    }
    
    @Override
    public String showDetails(){
        return "Day: "+day+ " \n Time: "+time+"\n Duration: "+duration+"m\n Calories Burned: "+caloriesBurned+"\n Number Of Reps: "+numOfReps;
    }
}

    
    
