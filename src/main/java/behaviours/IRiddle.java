package behaviours;

import tools.Riddle;

public interface IRiddle {

    Riddle setRiddle(String answer, String question);

    boolean guessRiddle(Riddle riddle, String guess);
}
