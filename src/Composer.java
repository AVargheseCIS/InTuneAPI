/**Class Composer accepts audio information and
 * transcribes it to a musical sheet (MusicXML)
 * utilizing the MuseScore external framework.**/
public class Composer {
    /**Audio input inserted into this composer.**/
    private Microphone audioInput;

    /**Creates a Composer object.**/
    private Composer() {}

    /**Converts and writes audioInput into MusicXML.**/
    private MusicXML writeMusic() {
        return new MusicXML();
    }
}
