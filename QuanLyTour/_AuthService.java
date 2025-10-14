package QuanLyTour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class _AuthService {
      private List<_Staff> StaffList = new ArrayList<>();

      public void addPeopleCanLogin(){
            String Username;
            String Password;
            try { 
                  BufferedReader read = new BufferedReader(new FileReader("D:\\JAVA\\OOP\\QuanLyTour\\DanhSachNhanVien.txt"));
                  String line;

                  while ((line = read.readLine()) != null) {
                        int firstIndexOfComma = line.indexOf(",");
                        int lastIndexOfComma = line.lastIndexOf(",");

                        Username = line.substring(lastIndexOfComma + 1);
                        Password = line.substring(0, firstIndexOfComma);

                        String role;
                        if (Password.startsWith("QL")) 
                              role = "manager";
                        else 
                              role = "staff";

                        StaffList.add(new _Staff(Username.trim(), Password.trim(), role.trim())); 
                  }
                  read.close();
            } 
            catch (Exception e) {
                  System.out.println("Loi khi doc file: " + e);
            }
      }

      public _AuthService() {
            addPeopleCanLogin();
      }

      public String login(String Username, String Password) {
            for(_Staff nv : StaffList) {
                  if(nv.getUsername().equals(Username) && nv.getPassword().equals(Password))
                        return nv.getrole();
            }
            return null; 
      }
}
