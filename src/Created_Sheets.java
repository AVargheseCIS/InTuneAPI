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

    public Created_Sheets()
    {

    }
}
