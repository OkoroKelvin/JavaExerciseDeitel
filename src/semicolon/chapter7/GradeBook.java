package semicolon.chapter7;

public class GradeBook {
    private String courseName;
    private int [] grades;


    public GradeBook(String courseName, int[]grades){
        this.courseName = courseName;
        this.grades = grades;
    }
    public void setCourseName(String courseName){
        this.courseName = courseName;
    }
    public String getCourseName(){
        return courseName;
    }
    public void processGrades(){
        outputGrades();
        System.out.printf("%nClass average is %.2f%n", getAverage());
        System.out.printf("Lowest grade is %d%nHighest grade is %d%n%n",getMinimum(),getMaximum());
    }

    public int getMinimum(){
        int lowGrade = grades[0];
        for(int grade : grades){
            if(grade < lowGrade)
                lowGrade = grade;
        }
        return lowGrade;
    }

    public int getMaximum(){
        int highGrade = grades[0];
        for(int grade : grades){
            if(grade > highGrade){
              highGrade = grade;
            }
        }
        return highGrade;
    }

    public double getAverage(){
        int total = 0;
        for(int grade : grades){
            total = total + grade;
        }
        return (double)total/grades.length;
    }
    public void outputGrades(){
        System.out.printf("Tha grades are: %n%n");
        for(int student = 0; student < grades.length; student++){
            System.out.printf("Student %2d: %3d%n", student +1, grades[student]);
        }

    }

}
