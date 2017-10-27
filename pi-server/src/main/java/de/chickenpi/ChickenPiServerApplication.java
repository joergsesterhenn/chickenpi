package de.chickenpi;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import de.chickenpi.rest.controller.EmployeeRESTController;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ChickenPiServerApplication extends Application<ChickenPiServerConfiguration> {
	 private static final Logger LOGGER = LoggerFactory.getLogger(ChickenPiServerApplication.class);
    public static void main(final String[] args) throws Exception {
        new ChickenPiServerApplication().run(args);
    }

    @Override
    public String getName() {
        return "ChickenPiServer";
    }

    @Override
    public void initialize(final Bootstrap<ChickenPiServerConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final ChickenPiServerConfiguration configuration,
                    final Environment environment) {
    	 LOGGER.info("Registering REST resources");
         environment.jersey().register(new EmployeeRESTController(environment.getValidator()));
    }

}
