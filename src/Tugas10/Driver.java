package Tugas10;

public class Driver extends User{
    String platMobil, jenisMobil;

    public Driver ( String nik, String nama, String nomorTelepon, double saldo, String platMobil, String jenisMobil ) {
        super(nik, nama, nomorTelepon, saldo);
        this.platMobil = platMobil;
        this.jenisMobil = jenisMobil;

    }
    public
    String getPlatMobil () {
        return platMobil;
    }

    public
    void setPlatMobil ( String platMobil ) {
        this.platMobil = platMobil;
    }

    public
    String getJenisMobil () {
        return jenisMobil;
    }

    public
    void setJenisMobil ( String jenisMobil ) {
        this.jenisMobil = jenisMobil;
    }
}
