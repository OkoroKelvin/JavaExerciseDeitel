package semicolon.chapter14;

public class PigLatin {
    public static void main(String[] args) {
        PigLatin pig = new PigLatin();
        String Sentence = "The Value";
        char[] charArray = new char[3];

        System.out.println(pig.printLatin(Sentence));
        System.out.println(pig.getWord());
        pig.split(Sentence);

    }
        private StringBuilder word;

        public PigLatin() {
            word = new StringBuilder();
        }

        public void split(String newWord) {
            char firstChar = newWord.charAt(0);
            for(int count = 1; count < newWord.length(); count++){
                concatCharacter(newWord.charAt(count));
            }
            concatCharacter(firstChar).append("ay ");

        }

        private StringBuilder concatCharacter(char character) {
            return word.append(character);
        }

        public String getWord() {
            return word.toString();
        }

        public int printLatin (String sentence){
            String[] tokens = sentence.split(" ");
            StringBuilder latinSentence = new StringBuilder();
            for (String token : tokens) {
                split(token);
            }
            latinSentence.append(word).append(" ");
            System.out.println(latinSentence);
            return tokens.length;
        }

    }
