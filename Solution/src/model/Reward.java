package model;

public abstract class Reward {
    private int id;
    private String description;

    public Reward(int id, String description) {
        this.id = id;
        this.description = description;
    }
}
