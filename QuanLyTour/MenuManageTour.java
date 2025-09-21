package QuanLyTour;
import java.util.Scanner;

public class MenuManageTour {
      public static final int WIDTH = 80;

      public static void main(String[] args ){
            Scanner sc = new Scanner(System.in);
            // create new obj is QuanLyTour 
            // QuanLyTour manage = new QuanLyTour();
            String title = "Menu";

            int choice;
            // create Menu choice, if input = 0 => out Menu 
            do{
                  printCenterTitle(title, WIDTH);
                  System.out.println("Bạn là:");
                  System.out.println("1. Khách hàng");
                  System.out.println("2. Nhân viên");
                  System.out.println("0. Thoát");
                  System.out.println("Lựa chọn: ");
                  choice = sc.nextInt();
                  sc.nextLine();
                  
                  switch (choice) {
                        case 1:
                              GuessMenu.showMenu(sc);
                              break;
                        case 2:
                              StaffMenu.showMenu(sc);
                              break;
                  }
            }while(choice != 0);

            sc.close();
            
      }
      public static void printCenterTitle(String title, int width){
            // total of char need to add left and right 
            int totalPadding = width - title.length();
            int left = totalPadding / 2;
            int right = totalPadding - left;
            System.out.println("=".repeat(left) + " " + title + " " + "=".repeat(right));
      }

}