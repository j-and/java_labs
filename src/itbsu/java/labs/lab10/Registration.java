package itbsu.java.labs.lab10;

import java.util.Date;

public class Registration {

    public enum Status {
        ACTIVE, CANCELED
    }

    private User owner;
    private Client client;
    private Status status;
    private int duration;
    private Date dateTime;

    public Registration(User owner, Client client, Date dateTime, Status status, int duration) {
        this.owner = owner;
        this.client = client;
        this.dateTime = dateTime;
        this.status = status;
        this.duration = duration;
    }

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

}
