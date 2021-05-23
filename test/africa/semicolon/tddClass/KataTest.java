package africa.semicolon.tddClass;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
//TestForStudentGradesAndScores
class KataTest {

    @Test
    public void showGrade() {
        Kata myKata= new Kata();
        assertEquals("A",myKata.showGrade(90));
    }
    @Test
    public void showGrade2(){
        Kata myKata= new Kata();
        assertEquals("B",myKata.showGrade(82));
    }
    @Test
    public void showGrade3(){
        Kata myKata = new Kata();
        assertEquals("C",myKata.showGrade(72));
    }
    @Test
    public void showGrade4(){
        Kata myKata = new Kata();
        assertEquals("D",myKata.showGrade(67));
    }
    @Test
    public void showGrade5(){
        Kata myKata= new Kata();
        assertEquals("E",myKata.showGrade(50));
    }
    @Test
    public void showGrade6(){
        Kata myKata= new Kata();
        assertEquals("F",myKata.showGrade(20));
    }

}