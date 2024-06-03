package Model;

import java.util.Scanner;

public class NHANSU {
    protected byte ID_NHANSU;
    protected byte ID_PHONG;
    protected String TEN_NHANSU;
    public NHANSU() {
    	
    }

    public NHANSU(byte ID_NHANSU, byte ID_PHONG, String TEN_NHANSU) {
        this.ID_NHANSU = ID_NHANSU;
        this.ID_PHONG = ID_PHONG;
        this.TEN_NHANSU = TEN_NHANSU;
    }

    public NHANSU(byte ID_NHANSU) {
    }

    public byte getID_NHANSU() {
        return ID_NHANSU;
    }

    public void setID_NHANSU(byte ID_NhanSu) {
        this.ID_NHANSU = ID_NHANSU;
    }

    public byte getID_PHONG() {
        return ID_PHONG;
    }

    public void setID_PHONG(byte ID_PHONG) {
        this.ID_PHONG = ID_PHONG;
    }

    public String getTEN_NHANSU() {
        return TEN_NHANSU;
    }

    public void setTEN_NHANSU(String TEN_NHANSU) {
        this.TEN_NHANSU = TEN_NHANSU;
    }
    public NHANSU addition(){
        Scanner sc = new Scanner(System.in);
        System.out.println(" NHAP VAO ID CUA NHAN SU ");
        this.ID_NHANSU = sc.nextByte();
        sc.nextLine(); 
        System.out.println("NHAP VAO ID PHONG ");
        this.ID_PHONG = sc.nextByte();
        sc.nextLine(); 
        System.out.println(" NHAP TEN NHAN SU");
        this.TEN_NHANSU = sc.nextLine();
        return this;
    }

  
}
