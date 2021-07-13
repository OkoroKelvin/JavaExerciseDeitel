package semicolon.arrayPractice;

public class GradeBook {
   private String courseName;
   private int[][]grades;

   public GradeBook(String courseName, int[][] grades)
   {
      this.courseName = courseName;
      this.grades = grades;
   }
   public void setCourseName(String courseName){
      this.courseName = courseName;
   }
   public String getCourseName()
   {
      return courseName;
   }
   public void processGrade()
   {
      outputGrades();
      System.out.printf("%n%s %d%n%s %d%n%n",
              "Lowest grade in the garde book is ", getMinimum(),
              "Highest grade in the grade book is ", getMaximum());
   }

   private void outputGrades() {
      System.out.println("The grades are:%/n%/n");
      System.out.println("                ");

      for (int test= 0; test < grades[0].length; test++)
         System.out.printf("Test %d ", test + 1);

      System.out.println("Average");

      for(int student = 0; student < grades.length; student++){

      }
   }

   private int getMaximum() {
      int highGrade = grades[0][0];
      for (int[] studentGrades : grades)
      {
        for(int grade : studentGrades){
           if(grade > highGrade)
              highGrade = grade;
        }
      }
      return highGrade;
   }
   public double getAverage(int[] setOfGrades)
   {
      int total = 0;

      for (int grade : setOfGrades)
         total += grade;
      return (double) total / setOfGrades.length;
   }

   private int getMinimum()
   {
      int lowGrade = grades[0][0];
      for (int[] studentGrades : grades)
      {
         for(int grade : studentGrades)
         {
            if( grade < lowGrade)
               lowGrade = grade;
         }
      }
      return lowGrade;
   }
}
