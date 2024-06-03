package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class CONGTAC extends NHANSU {
    protected byte ID_;
    protected byte ID_nhanSu;
    protected String noi_dung;
    protected Date start_ngayCongTac;
    protected Date stop_ngayCongTac;
    protected String noi_congTac;
    protected String phuong_tien;
    protected byte ID_dangKi;
    protected Date ngay_dangKi;

    public CONGTAC(byte ID_NhanSu, byte ID_, String noi_dung, Date start_ngayCongTac, Date stop_ngayCongTac, String noi_congTac, String phuong_tien, byte ID_dangKi, Date ngay_dangKi) {
        super(ID_NhanSu);
        this.ID_ = ID_;
        this.noi_dung = noi_dung;
        this.start_ngayCongTac = start_ngayCongTac;
        this.stop_ngayCongTac = stop_ngayCongTac;
        this.noi_congTac = noi_congTac;
        this.phuong_tien = phuong_tien;
        this.ID_dangKi = ID_dangKi;
        this.ngay_dangKi = ngay_dangKi;
    }

    public byte getID_() {
        return ID_;
    }

    public void setID_(byte ID_) {
        this.ID_ = ID_;
    }

    public byte getID_nhanSu() {
        return ID_nhanSu;
    }

    public void setID_nhanSu(byte ID_nhanSu) {
        this.ID_nhanSu = ID_nhanSu;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }

    public Date getStart_ngayCongTac() {
        return start_ngayCongTac;
    }

    public void setStart_ngayCongTac(Date start_ngayCongTac) {
        this.start_ngayCongTac = start_ngayCongTac;
    }

    public Date getStop_ngayCongTac() {
        return stop_ngayCongTac;
    }

    public void setStop_ngayCongTac(Date stop_ngayCongTac) {
        this.stop_ngayCongTac = stop_ngayCongTac;
    }

    public String getNoi_congTac() {
        return noi_congTac;
    }

    public void setNoi_congTac(String noi_congTac) {
        this.noi_congTac = noi_congTac;
    }

    public String getPhuong_tien() {
        return phuong_tien;
    }

    public void setPhuong_tien(String phuong_tien) {
        this.phuong_tien = phuong_tien;
    }

    public byte getID_dangKi() {
        return ID_dangKi;
    }

    public void setID_dangKi(byte ID_dangKi) {
        this.ID_dangKi = ID_dangKi;
    }

    public Date getNgay_dangKi() {
        return ngay_dangKi;
    }

    public void setNgay_dangKi(Date ngay_dangKi) {
        this.ngay_dangKi = ngay_dangKi;
    }

    public CONGTAC() {

    }
}
