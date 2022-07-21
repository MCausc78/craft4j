package org.mcausc78.craft4j.api.os;

/**
 * Represents a OS utils.
 */

public class OSUtil {
    /**
     *
     * Get an OS name.
     *
     * @return {@link SystemType} os name
     *
     */
    public static SystemType getOS() {
        String os = System.getProperty("os.name").toLowerCase();
        SystemType system;
        if(os.contains("aix")) {
            return SystemType.AIX;
        } else if(os.contains("windows")) {
            return SystemType.WINDOWS;
        } else if(os.contains("linux")) {
            return SystemType.LINUX;
        } else if(os.contains("bsd")) {
            return SystemType.BSD;
        } else if(os.contains("darwin") || os.contains("macos") || os.contains("mac os")) {
            return SystemType.DARWIN;
        } else {
            return SystemType.UNKNOWN;
        }
    }

    /**
     *
     * Get a OS separator.
     *
     * @return seperator
     */
    public static char getFileSeparator() {
        char separator;
        switch(getOS()) {
            case AIX:
                return '/';
            case WINDOWS:
                return '\\';
            case LINUX:
                return '/';
            case BSD:
                return '/';
            case DARWIN:
                return '/';
            case UNKNOWN:
                return '/';
            default:
                separator = '/';
        }
        return separator;
    }
}
