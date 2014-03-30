package controllers;

import models.Partenaire;
import models.Produit;
import play.mvc.Controller;

/**
 * Date: 30/03/2014
 */
public class WebService  extends Controller {

    public static void importData() {


    }

    public static void exportData() {

        renderJSON(Produit.findAll());
    }
}
