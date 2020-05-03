import java.util.Arrays;
import java.util.Scanner;

public class Practise {
    public static void main(String[] args) {
        //1.字符串的反转
        /*Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        StringBuffer rs=new StringBuffer(str);
        System.out.println(rs.reverse());*/
        //2.英语句子将单词按照逆序排列
       /* Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[] arr= str.split(" ");
        System.out.println(Arrays.toString(arr));
        for(int i=arr.length-1;i>=0;i--){
            System.out.print(arr[i]+" ");
        }*/

        // 3. 二维数组和稀疏数组的互相转化
        /*int chessArr1[][] = new int[11][11];
        chessArr1[1][2] = 1;
        chessArr1[2][3] = 2;
        System.out.println("初始的二维数组");
        for (int[] row : chessArr1) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }
        //统计非0的数字总数
        int sum = 0;
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    sum++;
                }

            }
        }
        //创建对应的稀疏数组
        int sparseArr[][] = new int[sum + 1][3];
        //给稀疏数组赋值
        sparseArr[0][0] = 11;
        sparseArr[0][1] = 11;
        sparseArr[0][2] = sum;
        //遍历二维数组，将非0数放进稀疏数组
        int count = 0;//用于记录第几个非0数据
        for (int i = 0; i < 11; i++) {
            for (int j = 0; j < 11; j++) {
                if (chessArr1[i][j] != 0) {
                    count++;
                    sparseArr[count][0] = i;
                    sparseArr[count][1] = j;
                    sparseArr[count][2] = chessArr1[i][j];
                }
            }
        }
        //输出稀疏数组的形式
        System.out.println("得到的稀疏数组");
        for (int i = 0; i < sparseArr.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArr[i][0], sparseArr[i][1], sparseArr[i][2]);

        }
        System.out.println();
        //将稀疏数组返还成二维数组
        int chessArr2[][]=new int[sparseArr[0][0]][ sparseArr[0][1]];
        //读取稀疏数组（从第二行开始）赋值给原二维数组
        for(int i=1;i<sparseArr.length;i++){
            chessArr2[sparseArr[i][0]][sparseArr[i][1]]=sparseArr[i][2];
        }

        System.out.println("恢复后的数组");
        for(int[] row:chessArr2) {
            for (int data : row) {
                System.out.printf("%d\t", data);
            }
            System.out.println();
        }

*/
        //字符串由单词组成 空格分隔，求最后一个单词的长度
       /* System.out.println("请输入字符串");
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        String[]arr=str.split(" ");
        int length=arr[arr.length-1].length();
        System.out.println(length);*/
//计算一个字符串中某个字符出现的次数
       /* Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
        Character c=sc.nextLine().charAt(0);

        int  count=0;
        for (int i = 0; i < str.length(); i++) {
            if(c.equals(str.charAt(i))){
                count++;
            }
        }
        System.out.println(count);*/

       //数组去重并排序
        Scanner sc=new Scanner(System.in);
        while(sc.hasNext()){

        }


    }
}
