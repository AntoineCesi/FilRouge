package controllers.Mailer;

import models.Alerte;
import models.Salarie;
import play.mvc.Mailer;

/**
 * Date: 09/08/13
 */
public class Mails extends Mailer{

    public static void alert(Salarie salarie, Alerte alerte) {
        setSubject("Welcome %s", salarie.nom + " " + salarie.prenom);
        addRecipient(salarie.courriel);
        setFrom("Robot <robot@thecompany.com>");
//        EmailAttachment attachment = new EmailAttachment();
//        attachment.setDescription("A pdf document");
//        attachment.setPath(Play.getFile("rules.pdf").getPath());
//        addAttachment(attachment);
        send(salarie, alerte);
    }

   public static void lostPassword(Salarie salarie) {
       String newpassword = salarie.mdp;
       setFrom("Robot <robot@thecompany.com>");
       setSubject("Your password has been reset");
       addRecipient(salarie.courriel);
       send(salarie, newpassword);
   }
}
