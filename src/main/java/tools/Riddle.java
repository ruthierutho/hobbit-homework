//package tools;
//
//
//import java.util.HashMap;
//
//public class Riddle {
//    public static void main(String[] args) {
//
//        HashMap<String, String> riddles = new HashMap<String, String>();
//
//
//        riddles.put("What has roots as nobody sees,\n" +
//                "Is taller than trees,\n" +
//                "Up, up it goes,\n" +
//                "And yet never grows?", "A mountain");
//        riddles.put("Thirty white horses on a red hill,\n" +
//                "First they champ,\n" +
//                "Then they stamp,\n" +
//                "Then they stand still.", "Teeth");
//        riddles.put("Voiceless it cries,\n" +
//                "Wingless flutters,\n" +
//                "Toothless bites,\n" +
//                "Mouthless mutters.", "Wind");
//        riddles.put("An eye in a blue face\n" +
//                "Saw an eye in a green face.\n" +
//                "\"That eye is like to this eye\"\n" +
//                "Said the first eye,\n" +
//                "\"But in low place,\n" +
//                "Not in high place.", "The sun and a daisy");
//        riddles.put("It cannot be seen, cannot be felt,\n" +
//                "Cannot be heard, cannot be smelt.\n" +
//                "It lies behind stars and under hills,\n" +
//                "And empty holes it fills.\n" +
//                "It comes first and follows after,\n" +
//                "Ends life, kills laughter.", "Dark");
//        riddles.put("A box without hinges, key, or lid,\n" +
//                "Yet golden treasure inside is hid.", "An egg");
//        riddles.put("Alive without breath,\n" +
//                "As cold as death;\n" +
//                "Never thirsty, ever drinking,\n" +
//                "All in mail never clinking.", "Fish");
//        riddles.put("No-legs lay on one-leg,\n" +
//                "two-legs sat near on three-legs,\n" +
//                "four-legs got some.", "Fish on a table,\n" +
//                "man on a stool,\n" +
//                "cat gets the scraps");
//        riddles.put("This thing all things devours:\n" +
//                "Birds, beasts, trees, flowers;\n" +
//                "Gnaws iron, bites steel;\n" +
//                "Grinds hard stones to meal;\n" +
//                "Slays king, ruins town,\n" +
//                "And beats high mountain down.", "Time");
//        riddles.put("What's in my pocket?", "Ring");
//
//        String riddle1 = riddles.get()
//
//    }
//
//    public String getRiddle(){
//        riddles.get
//    }
//
//}

package tools;
public class Riddle {

    private String question;
    private String answer;
    public Riddle(String question, String answer){
        this.question = question;
        this.answer = answer;

    }


    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
