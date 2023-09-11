/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fitnessapp;

/**
 *
 * @author presl
 */
public class FitnessClasses extends Fitness{
    private String classType;
    private String trainerName;

    public FitnessClasses(String classType, String trainerName, String day, String time, int duration, double caloriesBurned) {
        super(day, time, duration, caloriesBurned);
        this.classType = classType;
        this.trainerName = trainerName;
    }
    
    public FitnessClasses(){
        
    }

    public String getClassType() {
        return classType;
    }

    public void setClassType(String classType) {
        this.classType = classType;
    }

    public String getTrainerName() {
        return trainerName;
    }

    public void setTrainerName(String trainerName) {
        this.trainerName = trainerName;
    }
    
    
    @Override
     public String showDetails(){
        return "Day: "+day+ " \n Time: "+time+"\n Duration: "+duration+"m\n Calories Burned: "+caloriesBurned+"\n Class Type: "+classType+"\n Trainer Name: "+trainerName;
    }
            
    
}
