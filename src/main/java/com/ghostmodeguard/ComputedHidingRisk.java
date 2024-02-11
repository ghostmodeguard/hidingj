package com.ghostmodeguard;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ComputedHidingRisk {

    @JsonProperty("t")
    private String token;

    @JsonProperty("v")
    private Verdict verdict;

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

    @JsonProperty("bs")
    private int botScore;

    // Constructor without arguments
    public ComputedHidingRisk() {
    }

    // Constructor with arguments
    public ComputedHidingRisk(String token, Verdict verdict, int denyScore, int virtualMachineScore, int antiTrackerScore,
                              int hideDeviceScore, int privateNavigationScore, int hideRealIPScore,
                              int badReputationIPScore, int rootScore, int botScore) {
        this.token = token;
        this.verdict = verdict;
        this.denyScore = denyScore;
        this.virtualMachineScore = virtualMachineScore;
        this.antiTrackerScore = antiTrackerScore;
        this.hideDeviceScore = hideDeviceScore;
        this.privateNavigationScore = privateNavigationScore;
        this.hideRealIPScore = hideRealIPScore;
        this.badReputationIPScore = badReputationIPScore;
        this.rootScore = rootScore;
        this.botScore = botScore;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Verdict getVerdict() {
        return verdict;
    }

    public void setVerdict(Verdict verdict) {
        this.verdict = verdict;
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

    public int getBotScore() {
        return botScore;
    }

    public void setBotScore(int botScore) {
        this.botScore = botScore;
    }

    @Override
    public String toString() {
        return "ComputedHidingRisk{" +
                "token='" + token + '\'' +
                ", verdict=" + verdict +
                ", denyScore=" + denyScore +
                ", virtualMachineScore=" + virtualMachineScore +
                ", antiTrackerScore=" + antiTrackerScore +
                ", hideDeviceScore=" + hideDeviceScore +
                ", privateNavigationScore=" + privateNavigationScore +
                ", hideRealIPScore=" + hideRealIPScore +
                ", badReputationIPScore=" + badReputationIPScore +
                ", rootScore=" + rootScore +
                ", botScore=" + botScore +
                '}';
    }
}

