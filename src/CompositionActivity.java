import java.util.ArrayList;

/**CompositionActivity hosts the "Composition" function
 * by holding a user list and a Composer object which
 * can transcribe the audio input fed into it.**/
public class CompositionActivity {
    /**User list of this composition activity instance.**/
    private ArrayList<String> userList;

    /**Composer object of this composition activity instance.**/
    private Composer composer;

    /**Creates a CompositionActivity instance. Hosts composer activity and configures session to record and transcribe
     * user audio input.**/
    private CompositionActivity() {}

    /**Saves the composer's transcribed MusicXML file.**/
    private void saveScore() {
    }
}
