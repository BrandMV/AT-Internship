package com.brandmv.springrest.domain;

public class ClienteResponse {
    private String name;
    private String lastName;
    private String birthday;
    private long clientId;

    public ClienteResponse(String name, String lastName, String birthday, long clientId) {
        this.name = name;
        this.lastName = lastName;
        this.birthday = birthday;
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public long getClientId() {
        return clientId;
    }

    public void setClientId(long clientId) {
        this.clientId = clientId;
    }
}
