/*
 * this class represents a workout session
 * @author Aiden Nguyen
 */

public class WorkOut {
    private String workOutType;
    private int duration; // duration in minutes
    private int caloriesBurned;
    private String intensity;
    private Trainer trainer; // pull from the secondary class
    private String date;
    private boolean isCompleted;

    // Defualt Constructor for the trainer 
    /*
     * Creates a default workout for the user
     */
    public WorkOut() {
        this.workOutType = "Cardio";
        this.duration = 30;
        this.caloriesBurned = 240;
        this.intensity = "medium";
        this.trainer = new Trainer("Default Trainer", "General Fitness");
        this.date = "Not Set";
        this.isCompleted = false;
    }

    // Constructor with parameters
    /*
     * Creates a workout with specified details that the user inputs
     * @param workOutType the type of workout
     * @param duration the duration of the workout in minutes
     * @param caloriesBurned the number of calories burned during the workout
     * @param intensity the intensity level of the workout
     * @param trainer the trainer assigned to the workout
     * @param date the date of the workout
     */
    public WorkOut(String workOutType, int duration, String intensity, Trainer trainer, String date) {
        this.workOutType = workOutType;
        this.duration = duration;
        this.caloriesBurned = 0;
        this.intensity = intensity;
        this.trainer = trainer;
        this.date = date;
        this.isCompleted = false;
    }

    // Create ALL getter Methods
    public String getWorkOutType() {
        return workOutType;
    }

    public int getDuration() {
        return duration;
    }
    
    public int getCaloriesBurned() {
        return caloriesBurned;
    }
    
    public String getIntensity() {
        return intensity;
    }
    
    public Trainer getTrainer() {
        return trainer;
    }
    
    public String getDate() {
        return date;
    }
    
    public boolean getIsCompleted() {
        return isCompleted;
    }

    // Create ALL setter Methods

    public void setWorkOutType(String workOutType) {
        this.workOutType = workOutType;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
    
    public void setCaloriesBurned(int caloriesBurned) {
        this.caloriesBurned = caloriesBurned;
    }
    
    public void setIntensity(String intensity) {
        this.intensity = intensity;
    }
    
    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }
    
    public void setDate(String date) {
        this.date = date;
    }
    
    public void setIsCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    /*
     * Extends the workout duration
     * @param extraMinutes the number of minutes to add to the total duration
     */
    public void extendWorkout(int extraMinutes) {
        duration += extraMinutes;
        System.out.println("You now have " + duration + " minutes left in your workout.");
    }

    /*
     * increases the intensity of the workout
     * @param newIntensity the new intensity level
     */
    public void increaseIntensity(String newIntensity) {
        intensity = newIntensity;
        System.out.println("The intensity level is now set to " + intensity + ".");
    }

    /*
     * calculates the calories burned per minute based upon the intensity set
     * @return calories per minute
     */

     public double calculateCaloriesPerMinute() {
        double caloriesPerMinute = 0.0;
        
        if (intensity.equalsIgnoreCase("low")) {
            caloriesPerMinute = 5.0;
        } else if (intensity.equalsIgnoreCase("medium")) {
            caloriesPerMinute = 8.0;
        } else if (intensity.equalsIgnoreCase("high")) {
            caloriesPerMinute = 12.0;
        } else {
            System.out.println("Unknown intensity level. Cannot calculate calories per minute.");
        }
        
        caloriesBurned = (int)(caloriesPerMinute * duration);
        System.out.println("Total Calories burned " + caloriesBurned);
        System.out.println("Calories burned per minute: " + caloriesPerMinute);
        return caloriesPerMinute;
     }
    /*
     * shows if the user is done with the workout
     */
    public void workoutComplete() {
        isCompleted = true;
        System.out.println("Congratulations! You have completed your workout.");
    }

    /*
     * displays the workout summary
     * @author Claude
     * @return summary of the workout session
     */
    public String toString() {
        return "=== Workout Details ===" +
               "\nType: " + workOutType +
               "\nDuration: " + duration + " minutes" +
               "\nIntensity: " + intensity +
               "\nTrainer: " + trainer.getName() + " (" + trainer.getSpecialty() + ")" +
               "\nDate: " + date +
               "\nCalories Burned: " + caloriesBurned +
               "\nCompleted: " + (isCompleted ? "Yes" : "No");
    }
}
