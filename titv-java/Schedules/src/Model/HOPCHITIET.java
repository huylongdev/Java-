package Model;

public class HOPCHITIET {
    protected String HOP_CHITIET;
    protected byte ID_HOP;
    protected byte ID_NHANSU;
    protected String READON;

    public HOPCHITIET(String HOP_CHITIET, byte ID_HOP, byte ID_NHANSU, String READON) {
        this.HOP_CHITIET = HOP_CHITIET;
        this.ID_HOP = ID_HOP;
        this.ID_NHANSU = ID_NHANSU;
        this.READON = READON;
    }

    public String getHOP_CHITIET() {
        return HOP_CHITIET;
    }

    public void setHOP_CHITIET(String HOP_CHITIET) {
        this.HOP_CHITIET = HOP_CHITIET;
    }

    public byte getID_HOP() {
        return ID_HOP;
    }

    public void setID_HOP(byte ID_HOP) {
        this.ID_HOP = ID_HOP;
    }

    public byte getID_NHANSU() {
        return ID_NHANSU;
    }

    public void setID_NHANSU(byte ID_NHANSU) {
        this.ID_NHANSU = ID_NHANSU;
    }

    public String getREADON() {
        return READON;
    }

    public void setREADON(String READON) {
        this.READON = READON;
    }
}
