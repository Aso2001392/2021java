import java.util.*;

public class Main37{
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("        ��̓Q�[��");
        System.out.println("*****************************");

        //5�~5�̃t�B�[���h(�g�����̔���p��7*7�Ɋg���j
        int[][] set = new int[7][7];

        //�����_���ł������W�𐶐�
        Random rnd = new Random();
        int ranx = rnd.nextInt(5)+1;
        int rany = rnd.nextInt(5)+1;
        
        //�����������W�ɂP�������i�D������j
        set[ranx][rany]=1;
        
        //�U���ʒu�����
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt()+1;
        int y = scan.nextInt()+1;
        
        //HP
        int hp =2;  
		
		
        while(hp>0){
			
            //�U������
            if(set[x][y]==1){
               hp--;
            }else if((set[x-1][y] == 1)||(set[x][y-1] == 1)||(set[x+1][y] == 1)||(set[x][y+1] == 1)){
                System.out.println("�g����");
            }

            //�D�̈ʒu�����Z�b�g
            set[ranx][rany]=0;
            
            //�����_���ł������W�𐶐�
            ranx = rnd.nextInt(5)+1;
            rany = rnd.nextInt(5)+1;
            
            //�����������W�ɂP�������i�D������j
            set[ranx][rany]=1;

            //�U���ʒu�����
            x = scan.nextInt()+1;
            y = scan.nextInt()+1;
        }
		System.out.println("HP0!�����");
    }
}