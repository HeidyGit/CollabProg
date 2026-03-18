package P10MementoPattern.Ex01VideoGame;

//Memento - snapshot of the game and player state
public class Game {
    private Player player;

    //method help GameState
    public Player getPlayer() {
        return player;
    }
    public void setPlayer(Player player) {
        this.player = player;
    }

    public void movePlayerTo(int x, int y){
        player.moveTo(x, y);
    }

    public void increaseScore(int score){
        player.increaseScore(score);
    }

    public GameState createState() {
        return new GameState(getPlayer());
    }

    public void restore(GameState state) {
        player = state.getPlayer();
    }



    //aqui ta el memento
    public class GameState {
        private final Player player;

        public GameState(Player player) {
            this.player = new Player(player.getX(), player.getY(), player.getScore());
        }

        private Player getPlayer() {
            return player;
        }
    }
}
