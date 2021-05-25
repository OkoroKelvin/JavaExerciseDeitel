package semicolon.tddClass;

public class EvenNumber {
    public static void main(String...args){
        int number =1;
        while (number<=20){
            if (number %2==0){
                System.out.println(number);
            }
            number=number+1;
        }

    }
}
