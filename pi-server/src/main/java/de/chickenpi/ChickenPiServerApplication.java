package de.chickenpi;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class ChickenPiServerApplication extends Application<ChickenPiServerConfiguration> {

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
        // TODO: implement application
    }

}
