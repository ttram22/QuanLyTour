package QuanLyTour;
import java.util.ArrayList;
import java.util.List;

public class AuthService {
      private List<Staff> StaffList = new ArrayList<>();

      public AuthService(){
            //  account demo, (admin)
            StaffList.add(new Staff("viethieu", "admin123")); 
            StaffList.add(new Staff("tuyettram", "admin123")); 
            StaffList.add(new Staff("tuyetngan", "admin123")); 
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
