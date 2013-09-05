package controllers;

import models.Produit;
import play.db.Model;
import play.exceptions.TemplateNotFoundException;
import play.mvc.With;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * Date: 10/08/13
 */
@With(Secure.class)
public class Produits extends CRUD{

    public static void produits(){
        List<Produit> produits = Produit.findAll();
        List<ObjectSelect> objectSelects = new ArrayList<ObjectSelect>();
        for (Produit produit : produits) {
            ObjectSelect objectSelect = new ObjectSelect();
            objectSelect.value = produit.getId();
            objectSelect.text = produit.getReference();
            objectSelects.add(objectSelect);
        }
        renderJSON(objectSelects);
    }



    public static void show(String id) throws Exception {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        Model object = type.findById(id);
        notFoundIfNull(object);
        try {
            render(type, object);
        } catch (TemplateNotFoundException e) {
            render("CRUD/show.html", type, object);
        }
    }

}
