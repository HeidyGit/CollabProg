package P10MementoPattern.Ex01VideoGame;

import P10MementoPattern.Template.Originator;

public class Player {
    private int x;
    private int y;
    private int score;

    public Player(int x, int y, int score) {
        this.x = x;
        this.y = y;
        this.score = score;
    }
    public void moveTo(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void increaseScore(int score) {
        this.score += score;
    }
    public int getX() {
        return x;
    }
    public int getY() {
        return y;
    }
    public int getScore() {
        return score;
    }

}
