public class App {
    public static void main(String[] args) {
        System.out.println("***Fitness Workout Tracker System***");

        // the trainers;
        Trainer trainer1 = new Trainer("Sarah Johnson", "Yoga");
        Trainer trainer2 = new Trainer("Mike Smith", "Strength Training");

         // Create workout using default constructor
         WorkOut workOut1 = new WorkOut();
         System.out.println("Workout 1:");
         System.out.println(workOut1);
         System.out.println();
         
         // Create workout using parameterized constructor
         WorkOut workOut2 = new WorkOut("CrossFit", 45, "High", trainer2, "11-12-2025");
         System.out.println("Workout 2:");
         System.out.println(workOut2);
         System.out.println();
         
         WorkOut workOut3 = new WorkOut("CrossFit", 70, "low", trainer1, "11-20-2025");
         System.out.println("Workout 3:");
         System.out.println(workOut3);
         System.out.println();

         // Call behavior methods WITH parameters on workout1
         System.out.println("--- Testing Workout 1 Methods ---");
         workOut1.extendWorkout(15);
         workOut1.increaseIntensity("High");
         System.out.println();
         
         // Call behavior methods WITHOUT parameters on workout1
         workOut1.calculateCaloriesPerMinute();
         workOut1.workoutComplete();
         System.out.println();
         
         // Print updated workout1
         System.out.println("Updated Workout 1:");
         System.out.println(workOut1);
         System.out.println();
         
         // Call behavior methods WITH parameters on workout2
         System.out.println("--- Testing Workout 2 Methods ---");
         workOut2.extendWorkout(10);
         workOut2.increaseIntensity("Medium");
         System.out.println();
         
         // Call behavior methods WITHOUT parameters on workout2
         workOut2.calculateCaloriesPerMinute();
         workOut2.workoutComplete();
         System.out.println();
         
         // Print updated workout2
         System.out.println("Updated Workout 2:");
         System.out.println(workOut2);
    }


    
}
