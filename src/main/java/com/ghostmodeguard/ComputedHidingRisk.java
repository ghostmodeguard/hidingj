package com.ghostmodeguard;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComputedHidingRisk {

    @JsonProperty("t")
    private String token;

    @JsonProperty("d")
    private int denyScore;

    @JsonProperty("vm")
    private int virtualMachineScore;

    @JsonProperty("a")
    private int antiTrackerScore;

    @JsonProperty("h")
    private int hideDeviceScore;

    @JsonProperty("p")
    private int privateNavigationScore;

    @JsonProperty("i")
    private int hideRealIPScore;

    @JsonProperty("b")
    private int badReputationIPScore;

    @JsonProperty("ro")
    private int rootScore;

    // Constructors, getters, and setters (if needed) can be added here

    // Example constructor without arguments
    public ComputedHidingRisk() {
    }

    // Example constructor with arguments
    public ComputedHidingRisk(String token, int denyScore, int virtualMachineScore, int antiTrackerScore,
                              int hideDeviceScore, int privateNavigationScore, int hideRealIPScore,
                              int badReputationIPScore, int rootScore) {
        this.token = token;
        this.denyScore = denyScore;
        this.virtualMachineScore = virtualMachineScore;
        this.antiTrackerScore = antiTrackerScore;
        this.hideDeviceScore = hideDeviceScore;
        this.privateNavigationScore = privateNavigationScore;
        this.hideRealIPScore = hideRealIPScore;
        this.badReputationIPScore = badReputationIPScore;
        this.rootScore = rootScore;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getDenyScore() {
        return denyScore;
    }

    public void setDenyScore(int denyScore) {
        this.denyScore = denyScore;
    }

    public int getVirtualMachineScore() {
        return virtualMachineScore;
    }

    public void setVirtualMachineScore(int virtualMachineScore) {
        this.virtualMachineScore = virtualMachineScore;
    }

    public int getAntiTrackerScore() {
        return antiTrackerScore;
    }

    public void setAntiTrackerScore(int antiTrackerScore) {
        this.antiTrackerScore = antiTrackerScore;
    }

    public int getHideDeviceScore() {
        return hideDeviceScore;
    }

    public void setHideDeviceScore(int hideDeviceScore) {
        this.hideDeviceScore = hideDeviceScore;
    }

    public int getPrivateNavigationScore() {
        return privateNavigationScore;
    }

    public void setPrivateNavigationScore(int privateNavigationScore) {
        this.privateNavigationScore = privateNavigationScore;
    }

    public int getHideRealIPScore() {
        return hideRealIPScore;
    }

    public void setHideRealIPScore(int hideRealIPScore) {
        this.hideRealIPScore = hideRealIPScore;
    }

    public int getBadReputationIPScore() {
        return badReputationIPScore;
    }

    public void setBadReputationIPScore(int badReputationIPScore) {
        this.badReputationIPScore = badReputationIPScore;
    }

    public int getRootScore() {
        return rootScore;
    }

    public void setRootScore(int rootScore) {
        this.rootScore = rootScore;
    }

    @Override
    public String toString() {
        return "ComputedHidingRisk{" +
                "token='" + token + '\'' +
                ", denyScore=" + denyScore +
                ", virtualMachineScore=" + virtualMachineScore +
                ", antiTrackerScore=" + antiTrackerScore +
                ", hideDeviceScore=" + hideDeviceScore +
                ", privateNavigationScore=" + privateNavigationScore +
                ", hideRealIPScore=" + hideRealIPScore +
                ", badReputationIPScore=" + badReputationIPScore +
                ", rootScore=" + rootScore +
                '}';
    }
}

