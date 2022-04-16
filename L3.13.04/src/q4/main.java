package q4;

import java.util.Scanner;

public class main {
    public static void main(String[] args){
        Data data1_F = new Data(21, 8, 2022);
        Data data2_F = new Data(22, 6, 2000);

        Data data1_F2 = new Data("Agosto", 21, 2022);
        Data data2_F2 = new Data("Junho", 22, 2000);

        Data data1_F3 = new Data(365, 2022);
        Data data2_F3 = new Data(366, 2020);


        System.out.println("-------------- DATA 1 --------------------");
        System.out.println(data1_F.getData());
        System.out.println(data2_F.getData());
        System.out.println("-------------- DATA 2 --------------------");
        System.out.println(data1_F2.getData());
        System.out.println(data2_F2.getData());
        System.out.println("-------------- DATA 3 --------------------");
        System.out.println(data1_F3.getData());
        System.out.println(data2_F3.getData());

    }
}
