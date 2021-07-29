import java.util.*;

public class Main37{
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("        戦艦ゲーム");
        System.out.println("*****************************");

        //ターン数をカウント
        int cnt=0;

        //5×5のフィールド(波高しの判定用に7*7に拡張）
        int[][] set = new int[7][7];
        
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
      
        //HP
        int hp =2;  
		
		
        while(hp>0){

            //ランダムでｘｙ座標を生成
            int ranx = rnd.nextInt(5)+1;
            int rany = rnd.nextInt(5)+1;
            
            //生成した座標に１をいれる（船がいる）
            set[ranx][rany]=1;

            System.out.println("１～５のｘ座標を入力");
            int x = scan.nextInt();
            System.out.println("１～５のｙ座標を入力");
            int y = scan.nextInt();
			
            //攻撃判定
            if(set[x][y]==1){
               hp--;
               System.out.println("命中！");
            }else if((set[x-1][y] == 1)||(set[x][y-1] == 1)||(set[x+1][y] == 1)||(set[x][y+1] == 1)){
                System.out.println("波高し");
            }else{
				System.out.println("はずれ");
            }
            cnt++;

            System.out.println("hp："+hp);
            System.out.println("ターン数："+cnt);


            //船の位置をリセット
            set[ranx][rany]=0;
        }
		System.out.println("HP0!おわり");
    }
}