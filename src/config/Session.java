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
    private String name;
    private String email;
    private String userType;
    private String status;
    private boolean loggedIn = false;

    private Session() {}

    public static Session getInstance() {
        if (instance == null) {
            instance = new Session();
        }
        return instance;
    }

    public void setSession(int userId, String name, String email, String userType, String status) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.userType = userType;
        this.status = status;
        this.loggedIn = true;
    }

    public int getUserId() {
        return userId;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getUserType() {
        return userType;
    }

    public String getStatus() {
        return status;
    }

    public boolean isLoggedIn() {
        return loggedIn;
    }

    public void clearSession() {
        userId = 0;
        name = null;
        email = null;
        userType = null;
        status = null;
        loggedIn = false;
    }
}