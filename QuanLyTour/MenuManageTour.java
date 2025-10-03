package QuanLyTour;
import java.util.Scanner;

public class MenuManageTour {
      public static final int WIDTH = 60;

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

      //staff menu 
      public static void showStaffMenu(Scanner sc){
            AuthService auth = new AuthService();
            int WIDTH = MenuManageTour.WIDTH;

            String title = "Menu Nhân viên";

            // login loop 
            boolean logged = false;
            while(!logged){
                  MenuManageTour.printCenterTitle(title, WIDTH);
                  System.out.println("ĐĂNG NHẬP");
                  System.out.print("Username:");
                  String Username = sc.nextLine();
                  System.out.print("Password:");
                  String Password = sc.nextLine();

                  if(auth.login(Username, Password)){
                        logged = true;
                        System.out.println("Đăng nhập thành công!");
                        staffmenu(sc);
                  }else{
                        // check account against
                        System.out.println("*".repeat(WIDTH/3) + "Bạn đã nhập sai tài khoản hoặc mật khẩu!" + "*".repeat(WIDTH/3));
                        System.out.println("Vui lòng lựa chọn\nẤn phím 1 để đăng nhập lại hoặc nhấn vào phím bất kỳ để thoát");
                        String tmp = "";
                        tmp = sc.nextLine();
                        if(tmp.equals("1")){
                              System.out.println("Đã chọn nhập lại tài khoản!");
                        }
                        else break;
                  }
            }
      }

      public static void staffmenu(Scanner sc){
            int WIDTH = MenuManageTour.WIDTH;

            // loop for staff menu 
            int choice;
            String titleStaffMenu = "Hiện đang trong tài khoản nhân viên, vui lòng chọn:";
            do{
                  MenuManageTour.printCenterTitle(titleStaffMenu, WIDTH);
                  System.out.println("1. Xem danh sách khách hàng");
                  System.out.println("2. Thêm khách hàng mới");
                  System.out.println("3. Cập nhật thông tin tour");
                  System.out.println("4. Xem danh sách tour");
                  System.out.println("5. Thêm tour mới");
                  System.out.println("6. Sửa thông tin tour");
                  System.out.println("7. Xóa tour");
                  System.out.println("0. Đăng xuất");
                  System.out.println("Lựa chọn: ");
                  
                  choice = sc.nextInt();
                  sc.nextLine();

                  switch (choice) {
                        case 0: 
                              System.out.println("Đăng xuất thành công!");
                              return;
                        case 1:     
                              // view guess list 
                              break;
                        case 2:
                              // add new guess
                              break;
                        case 3:
                              // update information tour
                              break;
                        case 4:
                              // view tour list
                              break;
                        case 5:
                              // add new tour
                              break;
                        case 6:
                              // fix tour information
                              break;
                        case 7:
                              // delete tour
                              break;
                        default:
                              System.out.println();
                              System.out.println("*".repeat(WIDTH/3) +" Lựa chọn không hợp lệ, vui lòng thử lại." + "*".repeat(WIDTH/3));
                  }
            }while(choice != 0);
      }



      // guess menu 
      public static void showGuessMenu(Scanner sc){
      int choice;
      String title = "Menu khách hàng";
      int WIDTH = MenuManageTour.WIDTH;

      do{
            MenuManageTour.printCenterTitle(title, WIDTH);
            System.out.println("1. Xem thông tin tour");
            System.out.println("2. Tìm kiếm tour");
            System.out.println("3. Đăng ký tour");
            System.out.println("0. Thoát");
            System.out.println("Lựa chọn: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                  case 0: 
                        break;
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
                  default:
            }
      }while(choice != 0);
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