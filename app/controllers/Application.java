package controllers;
import static play.modules.pdf.PDF.renderPDF;
import java.io.IOException;
import models.Commande;
import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.lang.time.StopWatch;
import play.Logger;
import play.modules.pdf.PDF.Options;
import play.mvc.Controller;
import play.mvc.Finally;

public class Application extends Controller {
    private static StopWatch watch;

    public static void index() {
        render();
    }

    public static  void dashboard() {
        render();
    }

    /**
     * Generates a PDF document for the specified documentation section.
     *
     * @param id identifier (i.e. filename) of the documentation section
     * @param html optionally specifies whether the result of this action should be displayed as HTML (to ease debugging) or not
     * @throws IOException in case of error
     */
    public static void generate(long id, Boolean html) throws IOException {
        notFoundIfNull(id);

        Logger.info("Starting generation of documentation section '%s'", id);

        watch = new StopWatch();
        watch.start();

        Commande commande = Commande.findById(id);

        Options options = new Options();
        options.FOOTER = "<span style='font-size: 8pt;font-style:italic;color: #666;'>Generated with Play! Framework PDF Module</span><span style=\" color: rgb(141, 172, 38);float: right;font-size: 8pt;\">Page <pagenumber>/<pagecount></span>";
        options.filename = "install" + ".pdf";

        renderPDF("Application/commande.html", options, commande);
//        renderPDF(content, options, title, commande);
    }

    /**
     * Logs a message as soon as the generation of a PDF document is finished.
     */
    @Finally(only = {"generate"})
    private static void log() {
        if (watch != null) {
            watch.stop();

            Logger.info("Generated documentation as PDF successfully in %s", DurationFormatUtils.formatDurationWords(watch.getTime(), true, true));

            watch = null;
        } else {
            Logger.info("Generated documentation as HTML successfully");
        }
    }

}