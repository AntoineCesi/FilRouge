package controllers;

import models.Partenaire;
import play.data.binding.Binder;
import play.db.Model;
import play.exceptions.TemplateNotFoundException;

import java.lang.reflect.Constructor;

/**
 * Date: 10/08/13
 */
public class Partenaires extends CRUD {

    public static void create() throws Exception {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        Constructor<?> constructor = type.entityClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        Model object = (Model) constructor.newInstance();
        Binder.bindBean(params.getRootParamNode(), "object", object);
        validation.valid(object);
        if (validation.hasErrors()) {
            renderArgs.put("error", play.i18n.Messages.get("crud.hasErrors"));
            try {
                render(request.controller.replace(".", "/") + "/blank.html", type, object);
            } catch (TemplateNotFoundException e) {
                render("CRUD/blank.html", type, object);
            }
        }
        ((Partenaire)object).save();
        flash.success(play.i18n.Messages.get("crud.created", type.modelName));
        if (params.get("_save") != null) {
            redirect(request.controller + ".list");
        }
        if (params.get("_saveAndAddAnother") != null) {
            redirect(request.controller + ".blank");
        }
        redirect(request.controller + ".show", object._key());
    }

    public static void save(String id) throws Exception {
        ObjectType type = ObjectType.get(getControllerClass());
        notFoundIfNull(type);
        Partenaire partenaire = Partenaire.findById(Long.parseLong(id));
        notFoundIfNull(partenaire);
        partenaire.edit(params.getRootParamNode(), "object");
        validation.valid(partenaire);
        if (validation.hasErrors()) {
            renderArgs.put("error", play.i18n.Messages.get("crud.hasErrors"));
            try {
                render(request.controller.replace(".", "/") + "/show.html", type, partenaire);
            } catch (TemplateNotFoundException e) {
                render("CRUD/show.html", type, partenaire);
            }
        }
        partenaire.merge();
        flash.success(play.i18n.Messages.get("crud.saved", type.modelName));
        if (params.get("_save") != null) {
            redirect(request.controller + ".list");
        }
        redirect(request.controller + ".show", partenaire._key());
    }
}
