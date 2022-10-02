import java.util.ArrayList;

/**LiveBandActivity hosts the "Live Band" function
 * by hosting an AudioController and a display name
 * while also supporting call functionality, composer
 * creation, and music writing/saving.**/
public class LiveBandActivity {
    /**Audio controller of this live band activity instance.**/
    private AudioController audioInput;
    /**Display name of this live band activity instance.**/
    private String displayName;

    /**User list of this composition activity instance.**/
    private ArrayList<String> userList;

    /**Creates a LiveBandActivity instance.**/
    private LiveBandActivity() {}

    /**Creates Composers for the live band activity, one for each member of live session. Serves as controller
     * for every Composer, starting recording at the same time, and collecting output from each Composer for storage.
     *
     * @param members - all members of live band session.
     * **/
    private void createComposers(ArrayList<String> members) {}

    /**Converts and writes audio input into MusicXML**/
    private MusicXML writeMusic() {
        return new MusicXML();
    }

    /**Saves the transcribed MusicXML files, adding MusicXML file to all member's composition library.**/
    private void saveScore() {}

    /**Makes external call to start video call with all members present in band session.**/
    private void startCall() {}
}
