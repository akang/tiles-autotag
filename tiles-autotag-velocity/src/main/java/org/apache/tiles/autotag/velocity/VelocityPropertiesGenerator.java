package org.apache.tiles.autotag.velocity;

import java.io.File;

import org.apache.tiles.autotag.generate.AbstractTemplateSuiteGenerator;
import org.apache.tiles.autotag.model.TemplateSuite;
import org.apache.velocity.app.VelocityEngine;

public class VelocityPropertiesGenerator extends AbstractTemplateSuiteGenerator {

    public VelocityPropertiesGenerator(VelocityEngine velocityEngine) {
        super(velocityEngine);
    }

    protected String getTemplatePath(File directory, String packageName, TemplateSuite suite) {
        return "/org/apache/tiles/autotag/velocity/velocityProperties.vm";
    }

    protected String getFilename(File directory, String packageName, TemplateSuite suite) {
        return "velocity.properties";
    }

    protected String getDirectoryName(File directory, String packageName, TemplateSuite suite) {
        return "META-INF/";
    }

}
