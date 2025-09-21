package QuanLyTour;
import java.util.Scanner;

public class StaffMenu{
      public static void showMenu(Scanner sc){
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
                        System.out.println("Nhập sai tài khoản hoặc mật khẩu!");
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
                  System.out.println("8. Đăng xuất");
                  System.out.println("Lựa chọn: ");
                  
                  choice = sc.nextInt();
                  sc.nextLine();

                  switch (choice) {
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
                        case 8: 
                              System.out.println("Đăng xuất thành công!");
                              return;
                        default:
                              System.out.println("Lựa chọn không hợp lệ, vui lòng thử lại.");
                  }
            }while(choice != 8);
      }
}
