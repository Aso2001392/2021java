import java.util.*;

public class Main37{
    public static void main(String[] args) {
        System.out.println("*****************************");
        System.out.println("        ��̓Q�[��");
        System.out.println("*****************************");

        //�^�[�������J�E���g
        int cnt=0;

        //5�~5�̃t�B�[���h(�g�����̔���p��7*7�Ɋg���j
        int[][] set = new int[7][7];
        
        Random rnd = new Random();
        Scanner scan = new Scanner(System.in);
      
        //HP
        int hp =2;  
		
		
        while(hp>0){

            //�����_���ł������W�𐶐�
            int ranx = rnd.nextInt(5)+1;
            int rany = rnd.nextInt(5)+1;
            
            //�����������W�ɂP�������i�D������j
            set[ranx][rany]=1;

            System.out.println("�P�`�T�̂����W�����");
            int x = scan.nextInt();
            System.out.println("�P�`�T�̂����W�����");
            int y = scan.nextInt();
			
            //�U������
            if(set[x][y]==1){
               hp--;
               System.out.println("�����I");
            }else if((set[x-1][y] == 1)||(set[x][y-1] == 1)||(set[x+1][y] == 1)||(set[x][y+1] == 1)){
                System.out.println("�g����");
            }else{
				System.out.println("�͂���");
            }
            cnt++;

            System.out.println("hp�F"+hp);
            System.out.println("�^�[�����F"+cnt);


            //�D�̈ʒu�����Z�b�g
            set[ranx][rany]=0;
        }
		System.out.println("HP0!�����");
    }
}