package NhanVien;

public class CongNhan extends People {
    private int overTime;
    private int troCap = 300000;
    private int luongCoBan = 4730000 + troCap;

    public CongNhan() {
        super();
    }

    public CongNhan(int overTime) {
        super();
        this.overTime = overTime;
    }

    public int getOverTime() {
        return overTime;
    }

    public void setOverTime(int overTime) {
        this.overTime = overTime;
    }

    public int getTroCap() {
        return troCap;
    }

    public void setTroCap(int troCap) {
        this.troCap = troCap;
    }

    @Override
    public void nhap() {
        super.nhap();
        System.out.println("Nhập số giờ làm thêm:");
        overTime = scanner.nextInt();
    }

    @Override
    public int tinhLuong() {
        this.luong = this.luongCoBan + this.troCap + (this.overTime * ((this.luongCoBan / 200) * 2));
        return this.luong;
    }

    @Override
    public String toString() {
        return
                "Mã Nhân viên:" + getMaNhanVien() +
                "\t Tên \t"+ this.getHoTen()+
                        "\n Là Công Nhân " +
                ",OverTime=" + overTime +
                ", Trợ Cấp=" + troCap +
                ", Lương Cơ Bản=" + luongCoBan +
                ", Tổng Lương Thực Nhận "+this.tinhLuong()
        +"\n";
    }
}
