public class Uploaded_Sheets {
    /**
     * Primary key, int identifier of music sheet.
     */
    private int id_upload;

    /**
     * String that is the location of music sheet in memory.
     */
    private String music_sheet;

    /**
     * Foreign key that indicates what member music sheet belongs to.
     */
    private int id_member;


    public Uploaded_Sheets()
    {

    }
}
