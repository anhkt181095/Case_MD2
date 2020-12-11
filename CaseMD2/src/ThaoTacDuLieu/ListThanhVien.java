package ThaoTacDuLieu;

import NhanVien.ChuyenVien;
import NhanVien.CongNhan;
import NhanVien.People;
//import jdk.internal.util.xml.impl.Input;

import java.util.ArrayList;
import java.util.Scanner;

public class ListThanhVien {

    Scanner sc = new Scanner(System.in);
    private ArrayList<People> peoples = new ArrayList<>();

    public ArrayList<People> getPeople() {
        return peoples;
    }

    public void setPeople(ArrayList<People> people) {
        this.peoples = people;
    }

    public void add() {
        System.out.println("1: thêm chuyên viên ");
        System.out.println("2: thêm công nhân");
        System.out.println("0: trở lại");
        People people = new People();
        int n = Integer.parseInt(sc.nextLine());
        switch (n) {
            case 1:
                ChuyenVien chuyenVien = new ChuyenVien();
                chuyenVien.nhap();
                getPeople().add(chuyenVien);
                System.out.println("Thêm thành công!");
                break;
            case 2:
                CongNhan congNhan = new CongNhan();
                congNhan.nhap();
                getPeople().add(congNhan);
                System.out.println("Thêm thành công!");
                break;
        }
    }

    public void show() {
        System.out.println("nhập mã thành viên cần tìm");
        String timKiem = sc.nextLine();
        int n = 0;
        for (int i = 0; i < getPeople().size(); i++) {
            if (timKiem.equals(getPeople().get(i).getMaNhanVien())) {
                System.out.println(getPeople().get(i).toString());
                n++;
            }
        }
        if (n == 0) {
            System.out.println(" Không tìm thấy dữ liệu ");
        }
    }

    public void delete() {
        System.out.println(" nhập mã người dùng cần xóa");
        String name = sc.nextLine();
        int index = 0;
        for (int i = 0; i < getPeople().size(); i++) {
            if (name.equals(getPeople().get(i).getMaNhanVien())) {
                System.out.println(" thông tin tài khoản đã xóa " + getPeople().get(i).toString());
                getPeople().remove(getPeople().get(i));
                index++;
            }
        }
        if (index == 0) {
            System.out.println(" người dùng không tồn tại! ");
        }
    }

    public void edit() {
        System.out.println("nhập mã nhân viên cần sửa");
        String id = sc.nextLine();
        int count = 0;
        for (int i = 0; i < getPeople().size(); i++) {
            if (id.equals(getPeople().get(i).getMaNhanVien())) {
                System.out.println(getPeople().get(i).toString());

                System.out.println("Nhập lại thông tin nhân viên cần sửa");

                System.out.println("Nhập họ tên cần sửa:");
                String hoTen = sc.nextLine();
                getPeople().get(i).setHoTen(hoTen);

                System.out.println("nhập Mã Nhân viên cần sửa:");
                String maNhanVien = sc.nextLine();
                getPeople().get(i).setMaNhanVien(maNhanVien);

                System.out.println("nhập Email cần sửa:");
                String eMail = sc.nextLine();
                getPeople().get(i).setMail(eMail);

                System.out.println("Nhập SDT cần sửa:");
                String soDienthoai = sc.nextLine();
                getPeople().get(i).setSoDienThoai(soDienthoai);

                System.out.println("Nhập Tuổi cần sửa:");
                int tuoi = sc.nextInt();
                getPeople().get(i).setTuoi(tuoi);

                System.out.println("thông tin đã sửa thành công!"
                        + "\n Họ và Tên: " + getPeople().get(i).getHoTen() +
                        " Mã nhân viên: " + getPeople().get(i).getMaNhanVien() +
                        " EMail: " + getPeople().get(i).getMail() +
                        " Tuổi: " + getPeople().get(i).getTuoi() +
                        " Số điện thoại: " + getPeople().get(i).getSoDienThoai()
                );
                count++;
                break;
            }
        }
        if (count == 0) {
            System.out.println("Nhân viên không tồn tại");    }
    }

}
