/**Class User holds information regarding individual
 * application users. This class is relevant to user
 * login, retrieving user MusicXML files, and editing
 * both user info and files.**/
public class User {
    /**Username of this user.**/
    private String username;
    /**Display name of this user.**/
    private String displayName;

    /**Creates a User object.**/
    private User () {}

    /**Retrieves the username of the user.**/
    private String getUsername() {
        return username;
    }

    /**Retrieves the MusicXML files of the user.**/
    private MusicXML getFiles() {
        return new MusicXML();
    }

    /**Enters write-mode for the user files.**/
    private MusicXML writeFiles() {
        return new MusicXML();
    }

    /**Retrieves the user information.**/
    private Boolean setUserInfo() {
        return true;
    }
}
