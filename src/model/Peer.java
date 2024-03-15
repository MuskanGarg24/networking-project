package src.model;

public class Peer {

    // Fields
    private String username;
    private String ipAddress;
    private int portNumber;
    private String file;

    // Constructor
    public Peer(String username, String ipAddress, int portNumber, String file) {
        this.username = username;
        this.ipAddress = ipAddress;
        this.portNumber = portNumber;
        this.file = file;
    }

    // Getters and Setters
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public int getPortNumber() {
        return portNumber;
    }

    public void setPortNumber(int portNumber) {
        this.portNumber = portNumber;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @Override
    public String toString() {
        return "Username: " + this.getUsername() + "\n" +
                "IP Address: " + this.getIpAddress() + "\n" +
                "Port Number: " + this.getPortNumber() + "\n" +
                "File: " + this.getFile();
    }
}
