package Model;

public class THONGBAO {
    protected byte ID_thongBao;
    protected byte ID_nguoiTB;
    protected byte ID_nguoiDuocTB;

    public THONGBAO(byte ID_thongBao, byte ID_nguoiTB, byte ID_nguoiDuocTB) {
        this.ID_thongBao = ID_thongBao;
        this.ID_nguoiTB = ID_nguoiTB;
        this.ID_nguoiDuocTB = ID_nguoiDuocTB;
    }

    public byte getID_thongBao() {
        return ID_thongBao;
    }

    public void setID_thongBao(byte ID_thongBao) {
        this.ID_thongBao = ID_thongBao;
    }

    public byte getID_nguoiTB() {
        return ID_nguoiTB;
    }

    public void setID_nguoiTB(byte ID_nguoiTB) {
        this.ID_nguoiTB = ID_nguoiTB;
    }

    public byte getID_nguoiDuocTB() {
        return ID_nguoiDuocTB;
    }

    public void setID_nguoiDuocTB(byte ID_nguoiDuocTB) {
        this.ID_nguoiDuocTB = ID_nguoiDuocTB;
    }
}
