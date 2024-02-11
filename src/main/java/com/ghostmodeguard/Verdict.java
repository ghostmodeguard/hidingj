package com.ghostmodeguard;

// Enum for user verdict
public enum Verdict {
    OK("OK"),
    PARTIALLY_HIDING("PARTIALLY_HIDING"),
    HIDING("HIDING");

    private final String value;

    Verdict(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}

