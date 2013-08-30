package controllers;

/**
 * Date: 27/08/13
 */

import models.*;
import play.libs.Crypto;
import play.mvc.Http;

import java.util.Date;

public class Security extends Secure.Security {

    static boolean authenticate(String username, String password) {
       Salarie salarie = Salarie.connect(username, password);
       boolean allowed =  Salarie.connect(username, password) != null;
       if(allowed) {
           session.put("userId",salarie.id);
       }
       return allowed;
    }

    /**
    * This method is called after a successful authentication.
    * You need to override this method if you with to perform specific actions (eg. Record the time the user signed in)
    */
    static void onAuthenticated() {
        Application.dashboard();
    }

    /**
     * This method is called before a user tries to sign off.
     * You need to override this method if you wish to perform specific actions (eg. Record the name of the user who signed off)
     */
    static void onDisconnect() {
    }

    /**
     * This method is called after a successful sign off.
     * You need to override this method if you wish to perform specific actions (eg. Record the time the user signed off)
     */
    static void onDisconnected() {
        Application.index();
    }

    /**
     * This method is called if a check does not succeed. By default it shows the not allowed page (the controller forbidden method).
     * @param profile
     */
    static void onCheckFailed(String profile) {
        forbidden();
    }

    static boolean check(String profile) {
        Salarie salarie = Salarie.find("byIdentifiant", connected()).first();
        return profile.equals(salarie.roleSalarie.toString());
    }

}
