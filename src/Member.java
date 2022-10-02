public class Member {

    /**
     * Foreign key for other tables of database, identifier for a member.
     */
    private int id_member;

    /**
     *  Last name of user.
     */
    private String lastName;

    /**
     * First name of user.
     */
    private String firstName;

    /**
     * email address of user, used to identify user in authentication system
     */
    private String email;

    /**
     * user password, used to authenticate user.
     */
    private String password;


    private Member()
    {}
}
