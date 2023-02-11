package org.example.PracticeOfLectures.Animate;

public class Pet {
    private String name;
    // public String secondName;
    private String secondName = "Barsik"; // пока не определишь будет Barsik
    protected String hast;

    String FatherLANDNAME;

    public String getName() {
        return name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    public Pet(String name) {
        this.name = name;
    }

    public void setSecondName(String secondName) { this.secondName = secondName; }

    public String getSecondName() {
        return secondName;
    }
}
