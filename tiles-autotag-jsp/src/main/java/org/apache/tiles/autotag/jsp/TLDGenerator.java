package org.apache.tiles.autotag.jsp;

import java.io.File;

import org.apache.tiles.autotag.generate.AbstractTemplateSuiteGenerator;
import org.apache.tiles.autotag.model.TemplateSuite;
import org.apache.velocity.app.VelocityEngine;

public class TLDGenerator extends AbstractTemplateSuiteGenerator {

    public TLDGenerator(VelocityEngine velocityEngine) {
        super(velocityEngine);
    }

    protected String getTemplatePath(File directory, String packageName, TemplateSuite suite) {
        return "/org/apache/tiles/autotag/jsp/tld.vm";
    }

    protected String getFilename(File directory, String packageName, TemplateSuite suite) {
        return suite.getName() + "-jsp.tld";
    }

    protected String getDirectoryName(File directory, String packageName, TemplateSuite suite) {
        return "META-INF/tld/";
    }

}
