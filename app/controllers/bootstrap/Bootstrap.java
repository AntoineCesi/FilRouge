package controllers.bootstrap;

import models.Salarie;
import play.jobs.Job;
import play.jobs.OnApplicationStart;
import play.test.Fixtures;

/**
 * Date: 28/08/13
 */
@OnApplicationStart
public class Bootstrap extends Job {
    public void doJob() {
        // Check if the database is empty
        if(Salarie.count() == 0) {
            Fixtures.loadModels("initial-admin-data.yml");
        }
    }
}
