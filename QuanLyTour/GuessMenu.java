package QuanLyTour;
import java.util.Scanner;

public class GuessMenu {public static void showMenu(Scanner sc){
      int choice;
      String title = "Menu khách hàng";
      int WIDTH = MenuManageTour.WIDTH;

      do{
            MenuManageTour.printCenterTitle(title, WIDTH);
            System.out.println("1. Xem thông tin tour");
            System.out.println("2. Tìm kiếm tour");
            System.out.println("3. Đăng ký tour");
            System.out.println("4. Thoát");
            System.out.println("Lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                  case 1:
                        // code view information tour 
                        break;
                  case 2:
                        // code find tour 
                        showMenuFindTour(sc);
                        break;
                  case 3:
                        // code register for tour 
                        break;
            }
      }while(choice != 4);
}

      public static void showMenuFindTour(Scanner sc){
            int choice;
            String title = "Tìm kiếm tour";
            int WIDTH = MenuManageTour.WIDTH;

            do{
                  MenuManageTour.printCenterTitle(title, WIDTH);
                  System.out.println("1. Tìm kiếm theo mã tour");
                  System.out.println("2. Tìm kiếm theo tên tour");
                  System.out.println("3. Tìm kiếm theo khoảng giá");
                  System.out.println("4. Tìm kiếm theo loại tour (trong nước/quốc tế)");
                  System.out.println("5. Thoát (quay lại menu Khách hàng)");
                  System.out.println("Lựa chọn: ");
                  choice = sc.nextInt();
                  sc.nextLine();

                  switch (choice) {
                        case 1:
                              // code find by id tour 
                              break;
                        case 2:
                              // code find by name tour
                              break;
                        case 3:
                              // code find by price range 
                              break;
                        case 4:
                              // code find by type
                              break;
                  }
            }while(choice != 5);
      }
}