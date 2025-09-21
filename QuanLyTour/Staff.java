package QuanLyTour;
public class Staff {
      private String Username;
      private String Password;

      public Staff(String Username, String Password){
            this.Username = Username;
            this.Password = Password;
      }

      // method take username form staff table
      public String getUsername(){
            return Username;
      }
      public String getPassword(){
            return Password;
      }
}
