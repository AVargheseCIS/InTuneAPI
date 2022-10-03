/**Class Member creates an object holding user information
 * for interfacing with the Firebase database.**/
public class Member {
    /**
     * Foreign key for other tables of database, identifier for a member.
     */
    private int id_member;

    /**
     * Last name of user.
     */
    private String lastName;

    /**
     * First name of user.
     */
    private String firstName;

    /**
     * Email address of user, used to identify user in authentication system
     */
    private String email;

    /**
     * User password, used to authenticate user.
     */
    private String password;

    /**
     * Creates a Member object for database use.
     */
    private Member()
    {}
}
