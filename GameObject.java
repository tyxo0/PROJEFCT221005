public abstract class GameObject{// 추상 클래스
    protected int distance;
    protected int x,y;
    public GameObject(int startX, int StartY, int distance){
        this.x = startX;
        this.y = StartY;
        this.distance = distance;
    }

    public int getX(){return x;}
    public int gety(){return y;}
    public boolean collide(GameObject p){
        if(this.x == p.getX() && this.y == p.gety())
            return true;
        else 
            return false;
    }
    protected abstract void move();
    protected abstract char getShape();
}