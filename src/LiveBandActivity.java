/**LiveBandActivity hosts the "Live Band" function
 * by hosting an AudioController and a display name
 * while also supporting call functionality, composer
 * creation, and music writing/saving.**/
public class LiveBandActivity {
    /**Audio controller of this live band activity instance.**/
    private AudioController audioInput;
    /**Display name of this live band activity instance.**/
    private String displayName;

    /**Creates a LiveBandActivity instance.**/
    private LiveBandActivity() {}

    /**Creates composers for the live band activity.**/
    private void createComposers() {}

    /**Converts and writes audio input into MusicXML.**/
    private MusicXML writeMusic() {
        return new MusicXML();
    }

    /**Saves the transcribed MusicXML files.**/
    private void saveScore() {}

    /**Start a live band call.**/
    private void startCall() {}
}
