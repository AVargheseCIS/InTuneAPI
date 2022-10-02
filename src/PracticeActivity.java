/**PracticeActivity hosts the "Practice" function
 * by holding an audio controller, display name, and
 * the present composition object which is utilized to
 * match to user input and compare audio.**/
public class PracticeActivity {
    /**Audio controller of this practice activity instance.**/
    private AudioController audioInput;
    /**Display name of this practice activity instance.**/
    private String displayName;
    /**Current composition object of this practice activity instance.**/
    private MusicXML currentComp;

    /**Creates a PracticeActivity instance.**/
    private PracticeActivity() {}

    /**Records the user's audio input for the practice activity.**/
    private void streamScore() {}

    /**Retrieves a music sheet for practice.**/
    private void loadMusic() {}

    /**Plays the selected practice music sheet for practice.**/
    private void displayMusicScore() {}
}
