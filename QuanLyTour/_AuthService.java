package QuanLyTour;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class _AuthService {
      private List<Staff> StaffList = new ArrayList<>();

      // method add people is staff
      public void addPeopleCanLogin(){
            String Username;
            String Password;
            try { 
                  BufferedReader read = new BufferedReader(new FileReader("D:\\QuanLyTour\\QuanLyTour\\DanhSachNhanVien.txt"));
                  String line;

                  while ((line = read.readLine()) != null) {
                        int firstIndexOfComma = line.indexOf(",");
                        int lastIndexOfComma = line.lastIndexOf(",");
                        Username = line.substring(lastIndexOfComma + 1);
                        Password = line.substring(0, firstIndexOfComma);
                        StaffList.add(new Staff(Username.trim(), Password.trim())); 
                  }
                  read.close();
            } 
            catch (Exception e) {
                  System.out.println("Loi khi doc file: " + e);
            }

      }

      public _AuthService(){
            //add staff list
            addPeopleCanLogin();
      }

      public boolean login(String Username, String Password){
            for(Staff nv : StaffList){
                  // if Username and Password equal least one in List dsNhanVien ---> return true
                  if(nv.getUsername().equals(Username) && nv.getPassword().equals(Password))
                        return true;
                  // accept login 
            }
            // if don't has any Username and Password equal ---> return false
            return false; 
            // failed login 
      }
}
