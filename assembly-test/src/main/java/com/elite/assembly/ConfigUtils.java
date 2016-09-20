package com.elite.assembly;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.net.URL;

/**
 * Created by wjc133
 * Date: 2016/9/20
 * Time: 11:43
 */
public class ConfigUtils {
    private static final Logger logger = LoggerFactory.getLogger(ConfigUtils.class);

    public static File loadFiles(String fileName) {
        if (fileName.startsWith("/")) {
            return new File(fileName);
        }
        URL url = null;
        try {
            url = ClassHelper.getClassLoader().getResource(fileName);
        } catch (Throwable t) {
            logger.warn("Fail to load " + fileName + " file: " + t.getMessage(), t);
        }

        if (url == null) {
            logger.warn("No " + fileName + " found on the class path.");
            return null;
        }

        try {
            return new File(url.toURI());
        } catch (Throwable e) {
            logger.warn("Failed to load " + fileName + " file from " + fileName + "(ingore this file): " + e.getMessage(), e);
        }
        return null;
    }
}
