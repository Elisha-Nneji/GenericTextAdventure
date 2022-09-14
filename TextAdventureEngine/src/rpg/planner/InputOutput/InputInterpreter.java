package rpg.planner.InputOutput;

public class InputInterpreter {

    private static final String SAY_REGEX = "say( ([\\w])+)+";
    private static final String SAY_TO_REGEX = "say to( ([\\w])+)+";
    private static final String WHISTPER_REGEX = "whisper( ([\\w])+)+";

    private static final String USE_REGEX = "use( ([\\w])+)+";      //TODO: eventuell nur say, use, ... speichern
                                                                    // und die Regex seperat speichern und dann addieren


    public void interpret(String input) {

        String lowerCaseInput = input.toLowerCase();        //TODO: .toLowerCase Java API (Root)

        if (lowerCaseInput.matches(SAY_REGEX)) {
            System.out.println("Say stuff");
        }
    }

}
