package ThaoTacDuLieu;

import NhanVien.User;

import java.util.ArrayList;
import java.util.Scanner;

public class ListUser {
    Scanner sc = new Scanner(System.in);
    private static ArrayList<User> userArrayList = new ArrayList<>();

    public static ArrayList<User> getUserArrayList() {
        return userArrayList;
    }

    public static void setUserArrayList(ArrayList<User> userArrayList) {
        ListUser.userArrayList = userArrayList;
    }
    public User checkUser(){
        User users = new User("ADMIN","1",User.getAdminRole());
        userArrayList.add(users);
        try{
            System.out.println("Thông Tin Đăng Nhập");
            System.out.println("Tên Tài khoản");
            String name = sc.nextLine();
            System.out.println("Mật khẩu");
            String password = sc.nextLine();
            for (User user1: userArrayList){
                if (name.equals(user1.getUserName())&& password.equals(user1.getPassWord())){
                    System.out.println("Đăng nhập thành công");
                    return user1;
                }else System.out.println("Sai tài khoản hoặc mật khẩu-->\n mời chọn lại:");
                break;
            }
        }catch(Exception e){}

        return null;
    }
}







