package semicolon.chapter7;

public class EnhancedFor {
    public static void main(String[] args) {
        int [] array = {87,68,94,100,83,78,85,91,76,87};
        int total = 0;

        for (int number : array){
            total += number;
        }
        System.out.println("Total of array elements: "+ total);
    }
}
