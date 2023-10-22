package model;

public class Flat {
    private String address;

    public Flat() {
    }

    public Flat(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Flat{");
        sb.append("address='").append(address).append('\'');
        sb.append('}');
        return sb.toString();
    }

}
