import java.util.Scanner;

class Bear extends GameObject{
    
    public Bear(int startX, int StartY, int distance) {
        super(startX, StartY, distance);
    }

    char inp;
    @Override
    protected void move() {
        switch(inp){/// x-> 행 y -> 열
            case 'a':
                this.x -=1;
                break;
            case 's': 
                this.y +=1;
                break;
            case 'd': 
                this.y -=1;
                break;
            case 'f': 
                this.x +=1;    
                break;
        }
    }
    @Override
    protected char getShape(){return 'B';}
}
class Fish extends GameObject{
    
    int cnt=0;
    public Fish(int startX, int StartY, int distance) {
        super(startX, StartY, distance);
    }
    @Override
    protected void move() {
        cnt++;
        if(cnt > 2){ // 3, 4 움직
            if(cnt ==4)
                cnt =0;
            int symbol =(int)(2*Math.random());//부호
            int dir = (int)(2*Math.random());// 방향 
            if(dir ==0){ // x이동
                if(symbol ==0) this.x +=1;
                else this.x -=1; 
            }
            else{
                if(symbol ==0) this.y +=1;
                else this.y -=1; 
            }
        }
    }
    @Override
    protected char getShape() {return '@';}
}

public class Game {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         Bear bear = new Bear(0, 0, 1);
         Fish fish = new Fish(5, 5, 1);
    
        char map[][] = new char[10][20];
        for(int i =0; i<10; i++){
            for(int j=0; j< 20; j++)
                map[i][j] = '-';
        }
        System.out.println("** Bear의 Fish 먹기 게임을 시작합니다.** ");
        while(true){
            
            map[fish.y][fish.x] = fish.getShape();
            map[bear.y][bear.x] = bear.getShape();

            for(int i =0; i<10; i++){
                for(int j=0; j< 20; j++)
                    System.out.print(map[i][j]);
                System.out.println();
            }
            if(bear.collide(fish))
                break;
            System.out.print("왼쪽(a), 아래(s), 위(d), 오른쪽(f)>> ");
            bear.inp = scanner.next().charAt(0);
            
            map[bear.y][bear.x] = '-';
            map[fish.y][fish.x] = '-';
            bear.move();
            fish.move();
            
        }
        System.out.println("Bear Win!!");
        scanner.close();
    }
    
}



