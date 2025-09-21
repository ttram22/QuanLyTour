package QuanLyTour;

public interface QuanLy<T> { 
      void them(T obj);
      void sua(String ma); 
      void xoa(String ma); 
      T timKiem(String ma); 
      void xuatDanhSach();
}