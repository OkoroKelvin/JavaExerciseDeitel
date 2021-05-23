package semicolonTest.chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    Employee employee1;
    Employee employee2;
    @BeforeEach
    void setup (){
        employee2 = new Employee("Demeji","Rooney",5000.00);
        employee1 =new Employee("Timothy","Adebiyi",8000.00);
    }
    @Test
    public void testToSetFirstNames(){
        employee1.setFirstName("Kelvin");
        assertEquals("Kelvin", employee1.getFirstName());
    }

    @Test
    public void testToSetAndGetSecondName(){
        employee1.setSecondName("Okoro");
        assertEquals("Okoro", employee1.getSecondName());
    }
    @Test
    public void testToSetAndGetSalary(){
        employee1.setMonthlySalary(500.00);
        assertEquals(500.00,employee1.getMonthlySalary());
    }
    @Test
    public void testToDisplayTwoObjectYearlySalary(){
        employee2.getYearlySalary();
        employee1.getYearlySalary();
        System.out.println("Given yearly Salary without 10% Increase");
        System.out.printf("Yearly salary of %s %s: %.2f\n",employee2.getFirstName(), employee2.getSecondName(), employee2.getYearlySalary());
        System.out.printf("Yearly salary of %s %s: %.2f\n",employee1.getFirstName(),employee1.getSecondName(), employee1.getYearlySalary());
    }
    @Test
    public void testToDisplay10PercentIncreaseRateOfSalary(){
        employee2.getIncrementYearlySalary();
        employee1.getIncrementYearlySalary();
        System.out.println("Given 10% Salary Increase after a year");
        System.out.printf("Yearly salary of %s %s: %.2f\n", employee2.getFirstName(), employee2.getSecondName(), employee2.getIncrementYearlySalary());
        System.out.printf("Yearly salary of %s %s: %.2f\n", employee1.getFirstName(),employee1.getSecondName(), employee1.getIncrementYearlySalary());

    }
}


