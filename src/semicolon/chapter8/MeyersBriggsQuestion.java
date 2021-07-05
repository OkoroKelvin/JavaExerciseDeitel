//package semicolon.chapter8;
//import java.util.Scanner;
//
//public class MeyersBriggsQuestion {
//
//    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//
//        String[][] questions = new String[20][2];
//        questions[0][0] = "expend energy, enjoy groups";
//        questions[0][1] = "conserve energy, enjoy one-on-one";
//        questions[1][0] = "interpret literally";
//        questions[1][1] = "look for meaning and possibilities";
//        questions[2][0] = "logical, thinking,questioning";
//        questions[2][1] = "empathetic, feeling, accommodating";
//        questions[3][0] = "organized, orderly";
//        questions[3][1] = "flexible, adaptable";
//        questions[4][0] = "more outgoing, think out loud";
//        questions[4][1] = "more reserved, think to yourself";
//        questions[5][0] = "practical, realistic, experiential";
//        questions[5][1] = "imaginative, innovative, theoretical";
//        questions[6][0] = "candid, straight forward, frank";
//        questions[6][1] = "tactful, kind, encouraging";
//        questions[7][0] = "plan, schedule";
//        questions[7][1] = "unplanned, spontaneous";
//        questions[8][0] = "seek many tasks, public activities, interaction with others";
//        questions[8][1] = "seek private, solitary activities with quiet to concentrate";
//        questions[9][0] = "standard, usual, conventional";
//        questions[9][1] = "different, novel, unique";
//        questions[10][0] = "firm, tend to criticize, hold the line";
//        questions[10][1] = "gentle, tend to appreciate, conciliate";
//        questions[11][0] = "regulated, structured";
//        questions[11][1] = "easygoing, live and let live";
//        questions[12][0] = "external, communicative, express yourself";
//        questions[12][1] = "internal, reticent, keep to yourself";
//        questions[13][0] = "focus on here-and-now";
//        questions[13][1] = "look to the future, global perspective,big picture";
//        questions[14][0] = "tough-minded, just";
//        questions[14][1] = "tender-hearted, merciful";
//        questions[15][0] = "preparation, plan ahead";
//        questions[15][1] = "go with the flow, adapt as you go";
//        questions[16][0] = "active, initiate";
//        questions[16][1] = "reflective, deliberate";
//        questions[17][0] = "facts, things,what is";
//        questions[17][1] = "ideas, dreams, “what could be,” philosophical";
//        questions[18][0] = "matter of fact, issue-oriented";
//        questions[18][1] = "sensitive, people-oriented, compassionate";
//        questions[19][0] = "control, govern";
//        questions[19][1] = "latitude, freedom";
//
//
//        int[] questionResponses = new int[20];
//        String option;
//
//        for (int i = 0; i < questions.length; i++) {
//            System.out.printf("Question %d%n", i + 1);
//            System.out.println("A. " + questions[i][0]);
//            System.out.println("B. " + questions[i][1]);
//            System.out.println("Kindly pick an option: A or B");
//
//
//            option = input.nextLine();
//
//            if (option.equalsIgnoreCase("A")){
//                questionResponses[i] = 1;
//            }
//
//        }
//        String [][] personality = new String[4][2];
//        personality[0][0]="E";
//        personality[0][1]="I";
//        personality[1][0]="S";
//        personality[1][1]="N";
//        personality[2][0]="T";
//        personality[2][1]="F";
//        personality[3][0]="J";
//        personality[3][1]="P";
//
//        int[][] optionCount = new int[4][2];
//
//        String personalityType ="";
//
//        for (int i = 0; i < questionResponses.length/5; i++){
//            int total = 0;
//            for (int j=i; j< questionResponses.length; j+=4){
//                total +=questionResponses[j];
//            }
//            optionCount[i][0] = total;
//            optionCount[i][1]= 5-total;
//
//            if (total >=3){
//                personalityType= personalityType + personality[i][0];
//            }else{
//                 personalityType = personalityType + personality[i][1];
//            }
//
//        }
//
//        System.out.println("\nYour choice at a glance\n");
//        System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "A", "B",
//                " ", "A", "B", " ", "A", "B", " ", "A", "B");
//        System.out.printf("%s%n", "-".repeat(74));
//
//        for (int i = 0; i < questionResponses.length; i += 4) {
//            System.out.printf("|%5d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s | %3d | %3s | %3s |%n", i+1, placeCheckmark(questionResponses[i], 1), placeCheckmark(responses[i], 2),
//                    i+2, placeCheckmark(questionResponses[i+1], 1), placeCheckmark(questionResponses[i+1], 2), i+3,
//                    placeCheckmark(questionResponses[i+2], 1), placeCheckmark(questionResponses[i+2], 2), i+4,
//                    placeCheckmark(questionResponses[i+3], 1), placeCheckmark(questionResponses[i+3], 2));
//        }
//        System.out.printf("%s%n", "-".repeat(74));
//        System.out.printf("|%5s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d | %3s | %3d | %3d |%n", "TOTAL", optionsCount[0][0], optionsCount[0][1],
//                " ", optionsCount[1][0], optionsCount[1][1], " ", optionsCount[2][0], optionsCount[2][1], " ", optionsCount[3][0], optionsCount[3][1]);
//        System.out.printf("%s%n", "-".repeat(74));
//        System.out.printf("|%5s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s | %3s |%n", " ", "E", "I",
//                " ", "S", "N", " ", "T", "F", " ", "J", "P");
//
//        System.out.println("\nYour personality type is " + personalityType);
//        System.out.print("For your personality interpretation, visit : ");
//        System.out.println("https://www.truity.com/personality-type/"+personalityType);
//        System.out.print("For all personality types visit: ");
//        System.out.println("https://www.truity.com/page/16-personality-types-myers-briggs");
//    }
//
//
//}
//
//
//
//    }
//    public static String placeCheckmark(int num, int position){
//        return (num ==1 && position ==1) || (num == 0 && position ==2) ? String.format("%c", '\u2713') : "";
//    }
//}
