package Model;

public class DIA_DIEM {
    protected byte ID_DIADIEM;
    protected String DIA_DIEM;

    public DIA_DIEM(byte ID_DIADIEM, String DIA_DIEM) {
        this.ID_DIADIEM = ID_DIADIEM;
        this.DIA_DIEM = DIA_DIEM;
    }

    public byte getID_DIADIEM() {
        return ID_DIADIEM;
    }

    public void setID_DIADIEM(byte ID_DIADIEM) {
        this.ID_DIADIEM = ID_DIADIEM;
    }

    public String getDIA_DIEM() {
        return DIA_DIEM;
    }

    public void setDIA_DIEM(String DIA_DIEM) {
        this.DIA_DIEM = DIA_DIEM;
    }
}
