/**
 * Created_Sheets holds information for database identifiers
 * and location of sheet music created by the application.
 */
public class Created_Sheets
{
    /**
     * Primary key, int identifier of music sheet that was application-created.
     */
    private int id_created;

    /**
     * String of location of music sheet in memory.
     */
    private String music_sheet;

    /**
     * Foreign key, int of member who owns this piece of sheet music.
     */
    private int id_member;

    /**
     * Creates a Created_Sheets database information document.
     */
    public Created_Sheets() {}
}
