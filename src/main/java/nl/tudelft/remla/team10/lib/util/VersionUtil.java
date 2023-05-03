package nl.tudelft.remla.team10.lib.util;

public class VersionUtil {
    public static String getVersion(){
        return VersionUtil.class.getPackage().getImplementationVersion();
    }
}
