import java.util.Comparator;
import java.util.Optional;
import java.util.function.*;
import java.util.stream.*;

/**Class Microphone captures and holds input audio
 * to then be utilized by other components.**/
public class Microphone {
    /**Input audio for this microphone object.**/
    private MicStream inputAudio;

    /**Captures audio input to the microphone object.**/
    private Stream startListen() {
        return new Stream();
    }
}
