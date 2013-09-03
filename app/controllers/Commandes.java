package controllers;

import models.Commande;
import models.enums.Type;
import play.db.Model;
import play.exceptions.TemplateNotFoundException;
import play.mvc.With;

import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Date: 10/08/13
 */
@With(Secure.class)
public class Commandes extends CRUD {

    public static void list(int page, String search, String searchFields, String orderBy, String order, Type typeCommande) {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        if (page < 1) {
            page = 1;
        }
//        List<Model> objects = type.findPage(page, search, searchFields, orderBy, order, (String) request.args.get("where"));
        int offset = (page - 1) * getPageSize();
        List<String> properties = searchFields == null ? new ArrayList<String>(0) : Arrays.asList(searchFields.split("[ ]"));
        List<Model> objects = Commande.find("type",typeCommande).fetch(offset, getPageSize());
        Long count = type.count(search, searchFields, (String) request.args.get("where"));
        Long totalCount = type.count(null, null, (String) request.args.get("where"));

        renderArgs.put("typeCommande", typeCommande);
        try {
            render(type, objects, count, totalCount, page, orderBy, order);
        } catch (TemplateNotFoundException e) {
            render("CRUD/list.html", type, objects, count, totalCount, page, orderBy, order);
        }

    }

    public static void show(String id) throws Exception {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        Commande object = (Commande) type.findById(id);
        notFoundIfNull(object);
        renderArgs.put("typeCommande", object.getType());
        try {
            render(type, object);
        } catch (TemplateNotFoundException e) {
            render("CRUD/show.html", type, object);
        }
    }
    public static void blank() throws Exception {
        Type typeCommande = Type.valueOf(params.get("typeCommande"));
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        Constructor<?> constructor = type.entityClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Model object = (Model) constructor.newInstance();
        renderArgs.put("typeCommande", typeCommande);
        try {
            render(type, object);
        } catch (TemplateNotFoundException e) {
            render("CRUD/blank.html", type, object);
        }
    }
}
