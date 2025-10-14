package QuanLyTour;
public class _Staff {
      private String Username;
      private String Password;
      private String role;

      public _Staff(String Username, String Password, String role){
            this.Username = Username;
            this.Password = Password;
            this.role = role;
      }

      // method take username form staff table
      public String getUsername(){
            return Username;
      }
      public String getPassword(){
            return Password;
      }  
      public String getrole() {
            return role;
      }
}
