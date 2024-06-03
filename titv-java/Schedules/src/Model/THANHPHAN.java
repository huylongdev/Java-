package Model;

public class THANHPHAN {
    protected byte ID_THANHPHAN;
    protected String TEN_THANHPHAN;
    protected String NHAN_SU;

    public THANHPHAN(byte ID_THANHPHAN, String TEN_THANHPHAN, String NHAN_SU) {
        this.ID_THANHPHAN = ID_THANHPHAN;
        this.TEN_THANHPHAN = TEN_THANHPHAN;
        this.NHAN_SU = NHAN_SU;
    }

    public byte getID_THANHPHAN() {
        return ID_THANHPHAN;
    }

    public void setID_THANHPHAN(byte ID_THANHPHAN) {
        this.ID_THANHPHAN = ID_THANHPHAN;
    }

    public String getTEN_THANHPHAN() {
        return TEN_THANHPHAN;
    }

    public void setTEN_THANHPHAN(String TEN_THANHPHAN) {
        this.TEN_THANHPHAN = TEN_THANHPHAN;
    }

    public String getNHAN_SU() {
        return NHAN_SU;
    }

    public void setNHAN_SU(String NHAN_SU) {
        this.NHAN_SU = NHAN_SU;
    }
}
