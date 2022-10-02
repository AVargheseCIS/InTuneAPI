/**TuningActivity hosts the "Tuning" function by
 * holding a note and a note selector which is
 * then compared to user audio input for tuning.**/
public class TuningActivity {
    /**Selected note of this tuning activity instance.**/
    private String note;
    /**Note selector button for this tuning activity instance.**/
    private DropDownButton notePicker;

    /**Instance of Microphone, used to record the user-played note.**/
    private Microphone mic;

    /**Event handler for changing selected tuning note. Plays the frequency of selected note out via device
     * output.
     *
     * @param changedValue - User selected note
     * **/
    private void notePickerOnChanged(String changedValue) {}

    /** Starts recording with Microphone, taking the processed microphone audio stream and comparing it to the
     *  user selected note.**/
    private void tuneNote() {}
}
