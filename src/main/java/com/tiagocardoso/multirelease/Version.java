package com.tiagocardoso.multirelease;

public enum Version {
    JAVA_VERSION ("Java8");

    private final String version;

    private Version(String version) {
        this.version = version;
    };

    public String getVersion() {
        return version;
    }
}
