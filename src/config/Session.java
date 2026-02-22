/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

/**
 *
 * @author Resty
 */
public class Session {
    private static Session instance;

    private int userId;
    private String userType;
    private boolean loggedIn = false;

    private Session() {}

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public void setUserId(int userId) {
        this.userId = userId;
        this.loggedIn = true;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUserType() {
        return userType;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void clearSession() {
        userId = 0;
        userType = null;
        loggedIn = false;
    }

}
