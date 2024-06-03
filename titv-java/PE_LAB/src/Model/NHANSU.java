package Model;

import java.util.Scanner;

public class NHANSU {
    protected byte ID_NhanSu;
    protected byte ID_Phong;
    protected String tenNhanSu;

    public NHANSU(byte ID_NhanSu, byte ID_Phong, String tenNhanSu) {
        this.ID_NhanSu = ID_NhanSu;
        this.ID_Phong = ID_Phong;
        this.tenNhanSu = tenNhanSu;
    }

    public NHANSU(byte ID_NhanSu) {
    }

    public byte getID_NhanSu() {
        return ID_NhanSu;
    }

    public void setID_NhanSu(byte ID_NhanSu) {
        this.ID_NhanSu = ID_NhanSu;
    }

    public byte getID_Phong() {
        return ID_Phong;
    }

    public void setID_Phong(byte ID_Phong) {
        this.ID_Phong = ID_Phong;
    }

    public String getTenNhanSu() {
        return tenNhanSu;
    }

    public void setTenNhanSu(String tenNhanSu) {
        this.tenNhanSu = tenNhanSu;
    }
    public NHANSU add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ID_NhanSu: ");
        this.ID_NhanSu = sc.nextByte();
        sc.nextLine(); // Consume newline character
        System.out.println("Enter ID_Phong: ");
        this.ID_Phong = sc.nextByte();
        sc.nextLine(); // Consume newline character
        System.out.println("Enter Name: ");
        this.tenNhanSu = sc.nextLine();
        return this;
    }

    public NHANSU() {
    }
}
