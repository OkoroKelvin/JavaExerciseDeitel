package semicolon.chapter5;

public class DisplayPyramid {
    public static void main(String[] args) {
        for (int count = 1; count <= 5; count++) {
            for (int countSpace = 5; countSpace > 1; countSpace--) {
                System.out.print(" ");
            }

            for(int counter = 1; counter <= count; counter++){
                System.out.print(counter);

                if(counter == 1){
                    for (int inner = 2; inner <= 5; inner++){
                        System.out.print(inner);
                    }
                }
            }
//            for (int countReverse = 1; countReverse <= count; count--) {
//                System.out.print(countReverse + " ");
//            }
//            for (int counter = 1; counter <= count; counter++) {
//                System.out.print(counter + " ");
//            }
            System.out.println();
        }

    }
}

