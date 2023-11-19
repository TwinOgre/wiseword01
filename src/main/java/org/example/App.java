package org.example;

import java.util.Scanner;

public class App {
    private Scanner sc;

    App (Scanner sc) {
        this.sc = sc;
    }
    void run() {
        System.out.println("== 명언 앱 ==");
         long count01 = 0;
        while(true){
            System.out.print("명령) ");
            String command = this.sc.nextLine().trim();

            if(command.equals("종료")) {
                break;
            } else if(command.equals("등록")){
                count01++;
                System.out.print("명언 : ");
                String content = this.sc.nextLine().trim();
                System.out.print("작가 : ");
                String author = this.sc.nextLine().trim();
                System.out.println(count01+"번 명언이 등록 되었습니다.");
            }
        }
//        Scanner scan = new Scanner(System.in);





    }
}
