package controllers;

import org.apache.commons.lang.time.DurationFormatUtils;
import org.apache.commons.lang.time.StopWatch;
import play.*;
import play.data.validation.Validation;
import play.modules.pdf.PDF;
import play.mvc.*;

import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import models.*;

import static play.modules.pdf.PDF.renderPDF;

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
    public static void generate(String id, Boolean html) throws IOException {
        notFoundIfNull(id);

        Logger.info("Starting generation of documentation section '%s'", id);

        // Builds the HTML for the requested Textile page
//        String textile = getTextile(id);
        String content = "";//toHTML(textile);
        String title = "";//getTitle(textile);

        // Handles the special case of the homepage which will trigger the generation of the whole documentation
        if (id.equals("home")) {
            // Adds each page linked from any numbered list on the homepage, like for example:
            //
            //   # "Installation guide":install
            //
            final Pattern pattern = Pattern.compile("^#\\s*\"[^\"]+\":([^#\\s]+)", Pattern.MULTILINE);
//            final Matcher matcher = pattern.matcher(textile);

//            while (matcher.find()) {
//                id = matcher.group(1);
//
//                if (!id.startsWith("http://") && !id.startsWith("/")) {
//                    content += toHTML(getTextile(id));
//                }
//            }
        }

//        if ((html != null) && html) {
//            render(content, title);
//        } else {
            watch = new StopWatch();
            watch.start();

            PDF.Options options = new PDF.Options();
            options.FOOTER = "<span style='font-size: 8pt;font-style:italic;color: #666;'>Generated with Play! Framework PDF Module</span><span style=\" color: rgb(141, 172, 38);float: right;font-size: 8pt;\">Page <pagenumber>/<pagecount></span>";
            options.filename = id + ".pdf";

            renderPDF(id,content, options, title);
//        }
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