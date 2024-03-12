package src.model;

public class Peer {

    // Fields
    private String username;
    private String ipAddress;
    private int portNumber;

    // Constructor
    public Peer(String username, String ipAddress, int portNumber) {
        this.username = username;
        this.ipAddress = ipAddress;
        this.portNumber = portNumber;
    }

    // Getters
    public String getUsername() {
        return username;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public int getPortNumber() {
        return portNumber;
    }

    // Setters
    public void setUsername(String username) {
        this.username = username;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }
}
