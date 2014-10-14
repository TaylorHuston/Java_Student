/*
 * Basic Student Class. Used to demonstrate if/else statements
 * From "Java How To Program, 10/e, Early Objects" - Chapter 4
 */

public class Student {
    private String name;
    private double average;
    
    public Student(String newName, double newAve) {
        this.name = newName;
        
        //Validates that the average is between 0 and 100
        if(newAve > 0.0 && newAve < 100) {
            this.average = newAve;
        } else {
            this.average = 0.0;
        }
    }
    
    //Changes the student's name
    public void setName(String newName) {
        this.name = newName;
    }
    
    //Get's the student's name
    public String getName() {
        return this.name;
    }
    
    //Sets the students average
    public void setAverage(double newAve){
        //Validates that the average is between 0 and 100
        if(newAve > 0.0 && newAve < 100) {
            this.average = newAve;
        } else {
            this.average = 0.0;
        }
    }
    
      //Determines and returns the Student's letter grade
      public String getLetterGrade() {
         String letterGrade = ""; // initialized to empty String
 
         if (average >= 90.0)       
            letterGrade = "A";      
         else if (average >= 80.0)  
            letterGrade = "B";      
         else if (average >= 70.0)  
            letterGrade = "C";      
         else if (average >= 60.0)  
            letterGrade = "D";      
         else                       
            letterGrade = "F";      
 
         return letterGrade;
      }
 

    public static void main(String[] args) {
        Student student1 = new Student("Bill Clinton", 92.74);
        Student student2 = new Student("Barack Obama", 89.35);
        
        System.out.printf("%s's letter grade is: %s%n", student1.getName(), student1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n", student2.getName(), student2.getLetterGrade());
    }
    
}// end class Student
