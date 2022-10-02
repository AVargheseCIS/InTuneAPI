public class Firebase_Authentication {

    private String email;
    private String password;


    /**
     * Unlinks application with Firebase Auth system.
     */
    private void unlink()
    {

    }

    /**
     * Reloads login system.
     */
    private void reload()
    {

    }
    /**
     * Changes email address associated with user profile.
     *
     * @param newEmail - new email address to replace existing address associated with user profile.
     */
    private void updateEmail(String newEmail)
    {}

    /**
     * Changes password associated with user profile.
     *
     * @param newPassword - new password to replace existing password associated with user profile.
     */
    private void updatePassword(String newPassword)
    {}

    /**
     *  Updates user profile with changes.
     */
    private void updateProfile()
    {}

    /**
     * Creates Firebase_Authentication instance, which connects to Firebase Auth for application log in.
     *
     * @param email_ - email address used as account identifier for authentication.
     * @param password_ - password used for login verification.
     */
    public Firebase_Authentication (String email_, String password_)
    {
        email = email_;
        password = password_;
    }
}
