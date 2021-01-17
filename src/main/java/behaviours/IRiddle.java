package behaviours;

import tools.Riddle;

public interface IRiddle {

    String setRiddle(Riddle riddle);

    boolean guessRiddle(Riddle riddle, String guess);
}
