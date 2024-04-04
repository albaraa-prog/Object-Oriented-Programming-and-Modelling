abstract class abstractprac2 {
    String game;
    int round;
    public abstractprac2(String game, int round){
        this.game = game;
        this.round = round;
    }
    public String getgame(){
        return game;
    }
    public int getround(){
        return round;
    }
    public abstract void player();
}
class cod2 extends abstractprac2{
    public cod2(String game, int round){
        super(game, round);
        System.out.println("Game name is :"+ game + "\nRound is :"+round);
    }
    public void player(){
        System.out.println("Al Baraa");
    }
}
class cod3 extends abstractprac2{
    public cod3 (String game, int round){
        super(game, round);
    }
    public void player(){
        System.out.println("Meow");
    }
}
class absMain{
    public static void main(String args[]){
      cod2 a = new cod2("Black ops 2", 6);
      a.player();
      cod3 b = new cod3("Black ops 3", 3);
      b.player();
    }
}