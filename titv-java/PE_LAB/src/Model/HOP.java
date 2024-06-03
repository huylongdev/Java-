package Model;

import java.util.Date;

public class HOP {
    protected String ID_hop;
    protected String noi_dung;
    protected Date ngay_dangKi;
    protected Date gio_dangKi;
    protected byte ID_dangKi;
    protected Date ngay_hop;
    protected Date start_gioHop;
    protected Date stop_gioHop;
    protected byte ID_diaDiem;

    public HOP(String ID_hop, String noi_dung, Date ngay_dangKi, Date gio_dangKi, byte ID_dangKi, Date ngay_hop, Date start_gioHop, Date stop_gioHop, byte ID_diaDiem) {
        this.ID_hop = ID_hop;
        this.noi_dung = noi_dung;
        this.ngay_dangKi = ngay_dangKi;
        this.gio_dangKi = gio_dangKi;
        this.ID_dangKi = ID_dangKi;
        this.ngay_hop = ngay_hop;
        this.start_gioHop = start_gioHop;
        this.stop_gioHop = stop_gioHop;
        this.ID_diaDiem = ID_diaDiem;
    }

    public String getID_hop() {
        return ID_hop;
    }

    public void setID_hop(String ID_hop) {
        this.ID_hop = ID_hop;
    }

    public String getNoi_dung() {
        return noi_dung;
    }

    public void setNoi_dung(String noi_dung) {
        this.noi_dung = noi_dung;
    }

    public Date getNgay_dangKi() {
        return ngay_dangKi;
    }

    public void setNgay_dangKi(Date ngay_dangKi) {
        this.ngay_dangKi = ngay_dangKi;
    }

    public Date getGio_dangKi() {
        return gio_dangKi;
    }

    public void setGio_dangKi(Date gio_dangKi) {
        this.gio_dangKi = gio_dangKi;
    }

    public byte getID_dangKi() {
        return ID_dangKi;
    }

    public void setID_dangKi(byte ID_dangKi) {
        this.ID_dangKi = ID_dangKi;
    }

    public Date getNgay_hop() {
        return ngay_hop;
    }

    public void setNgay_hop(Date ngay_hop) {
        this.ngay_hop = ngay_hop;
    }

    public Date getStart_gioHop() {
        return start_gioHop;
    }

    public void setStart_gioHop(Date start_gioHop) {
        this.start_gioHop = start_gioHop;
    }

    public Date getStop_gioHop() {
        return stop_gioHop;
    }

    public void setStop_gioHop(Date stop_gioHop) {
        this.stop_gioHop = stop_gioHop;
    }

    public byte getID_diaDiem() {
        return ID_diaDiem;
    }

    public void setID_diaDiem(byte ID_diaDiem) {
        this.ID_diaDiem = ID_diaDiem;
    }
}
