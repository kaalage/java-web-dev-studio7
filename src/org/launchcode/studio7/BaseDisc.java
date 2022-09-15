package org.launchcode.studio7;

public class BaseDisc {
    String name;
    Double capacity;
    String contents;
    String discType;

    static final Boolean writable = true;

    public BaseDisc(String name, Double capacity, String contents, String discType) {
        this.name = name;
        this.capacity = capacity;
        this.contents = contents;
        this.discType = discType;
    }

    public String getName() {
        return name;
    }

    public Double getCapacity() {
        return capacity;
    }

    public String getContents() {
        return contents;
    }

    public String getDiscType() {
        return discType;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(Double capacity) {
        this.capacity = capacity;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public void setDiscType(String discType) {
        this.discType = discType;
    }
}
