import java.util.*;

public class Main37{
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("        戦艦ゲーム");
        System.out.println("*****************************");

        //5×5のフィールド(波高しの判定用に7*7に拡張）
        int[][] set = new int[7][7];

        //ランダムでｘｙ座標を生成
        Random rnd = new Random();
        int ranx = rnd.nextInt(5)+1;
        int rany = rnd.nextInt(5)+1;
        
        //生成した座標に１をいれる（船がいる）
        set[ranx][rany]=1;
        
        //攻撃位置を入力
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt()+1;
        int y = scan.nextInt()+1;
        
        //HP
        int hp =2;  
		
		
        while(hp>0){
			
            //攻撃判定
            if(set[x][y]==1){
               hp--;
            }else if((set[x-1][y] == 1)||(set[x][y-1] == 1)||(set[x+1][y] == 1)||(set[x][y+1] == 1)){
                System.out.println("波高し");
            }

            //船の位置をリセット
            set[ranx][rany]=0;
            
            //ランダムでｘｙ座標を生成
            ranx = rnd.nextInt(5)+1;
            rany = rnd.nextInt(5)+1;
            
            //生成した座標に１をいれる（船がいる）
            set[ranx][rany]=1;

            //攻撃位置を入力
            x = scan.nextInt()+1;
            y = scan.nextInt()+1;
        }
		System.out.println("HP0!おわり");
    }
}