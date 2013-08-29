package controllers;

import models.enums.Type;
import play.db.Model;
import play.exceptions.TemplateNotFoundException;
import play.mvc.With;

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
        List<Model> objects = type.findPage(page, search, searchFields, orderBy, order, (String) request.args.get("where"));

        Long count = type.count(search, searchFields, (String) request.args.get("where"));
        Long totalCount = type.count(null, null, (String) request.args.get("where"));
        try {
            render(type, objects, count, totalCount, page, orderBy, order);
        } catch (TemplateNotFoundException e) {
            render("CRUD/list.html", type, objects, count, totalCount, page, orderBy, order);
        }
    }

}
