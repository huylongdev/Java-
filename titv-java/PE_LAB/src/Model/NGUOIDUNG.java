package Model;

import java.util.Scanner;

public class NGUOIDUNG {
    protected byte ID_nguoiDung;
    protected byte ID_nhanSu;
    protected String userName;
    protected String passWord;
    protected int level_user;

    public NGUOIDUNG(byte ID_nguoiDung, byte ID_nhanSu, String userName, String passWord, int level_user) {
        this.ID_nguoiDung = ID_nguoiDung;
        this.ID_nhanSu = ID_nhanSu;
        this.userName = userName;
        this.passWord = passWord;
        this.level_user = level_user;
    }

    public byte getID_nguoiDung() {
        return ID_nguoiDung;
    }

    public void setID_nguoiDung(byte ID_nguoiDung) {
        this.ID_nguoiDung = ID_nguoiDung;
    }

    public byte getID_nhanSu() {
        return ID_nhanSu;
    }

    public void setID_nhanSu(byte ID_nhanSu) {
        this.ID_nhanSu = ID_nhanSu;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getLevel_user() {
        return level_user;
    }

    public void setLevel_user(int level_user) {
        this.level_user = level_user;
    }

}
