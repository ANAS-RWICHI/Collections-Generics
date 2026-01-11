package TP4;

import java.util.HashMap;



public class StudentsGrades {
   public static void main(String[] args) {
       HashMap<String,Double> StudentGrades = new HashMap<>();
       StudentGrades.put("Ahmed",15.75);
       StudentGrades.put("Mohammed ",15.75);
       StudentGrades.put("Asma",18.00);
       StudentGrades.put("Anas",11.00);
       System.out.println(StudentGrades);

//       Increase a student's grade.
       StudentGrades.replace("Anas",17.00);
       System.out.println(StudentGrades);
//       Delete a student's grade.
       StudentGrades.remove("Ahmed");
//       Display the size of the map.
       System.out.println("Size of map: " + StudentGrades.size());


       double sum = 0;
       double max = Double.MIN_VALUE;
       double min = Double.MAX_VALUE;

       for (double g : StudentGrades.values()) {
           sum += g;
           if (g > max) max = g;
           if (g < min) min = g;
       }

       double average = sum / StudentGrades.size();
       System.out.println("Average: " + average);
       System.out.println("Maximum grade: " + max);
       System.out.println("Minimum grade: " + min);

       boolean has20 = StudentGrades.containsValue(20.0);
       System.out.println("Contains grade equal to 20: " + has20);


       System.out.println("Student grades:");
       StudentGrades.forEach((name, grade) ->
               System.out.println(name + " --> " + grade)
       );
   }

}
