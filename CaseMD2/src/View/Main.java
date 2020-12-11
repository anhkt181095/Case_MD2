package View;

//import NhanVien.ChuyenVien;
//import NhanVien.CongNhan;
//import NhanVien.People;
import NhanVien.User;
import ThaoTacDuLieu.ListThanhVien;
import ThaoTacDuLieu.ListUser;

//import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void menu(){
        Scanner sc = new Scanner(System.in);
        ListUser listUser = new ListUser();
        ListThanhVien listThanhVien = new ListThanhVien();
        int cases = 0;
        do {
            System.out.println("1: Đăng Nhập (CHỈ DÀNH CHO NHÂN VIÊN ) ");
            System.out.println("2: tìm kiếm thông tin cá nhân");
            System.out.println("0: exit");
            try {
                cases = Integer.parseInt(sc.nextLine());
                switch (cases) {
                    case 1:
                        User user = listUser.checkUser();
                        if (user.getRole() == 1) {
                            int n = 0;
                            do {
                                System.out.println("Chọn chức năng:");
                                System.out.println("1:-> thêm thành viên");
                                System.out.println("2:-> Xóa Thông tin thành viên ");
                                System.out.println("3:-> sửa thông tin thành viên ");
                                System.out.println("0: Thoát.");
                                n = Integer.parseInt(sc.nextLine());
                                if (n == 1 ){
                                    listThanhVien.add();
                                }if (n == 2){
                                    listThanhVien.delete();
                                }if (n == 3){
                                    listThanhVien.edit();
                                }if(n== 0){
                                    System.out.println(" Chọn lại-->>");
                                    menu();
                                }

                            } while (user.getRole() == 1);
                        } else if (user.getRole() == 0) {
                        }
                    case 2:
                        listThanhVien.show();
                        break;
                }
            }catch (NullPointerException | NumberFormatException e) {}
        } while (cases != 0);
    }
    public static void main(String[] args) {
        menu();
    }
}
