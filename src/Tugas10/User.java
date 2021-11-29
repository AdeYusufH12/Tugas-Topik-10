package Tugas10;

public class User {
    String nik,nama, nomorTelepon;
    double saldo;

    public User ( String nik, String nama, String nomorTelepon, double saldo ) {
        this.nik = nik;
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
        this.saldo = saldo;
    }

    public User () { }

    public String getNik () {
        return nik;
    }

    public void setNik ( String nik ) {
        this.nik = nik;
    }

    public String getNama () {
        return nama;
    }

    public void setNama ( String nama ) {
        this.nama = nama;
    }

    public String getNomorTelepon () {
        return nomorTelepon;
    }

    public void setNomorTelepon ( String nomorTelepon ) {
        this.nomorTelepon = nomorTelepon;
    }

    public double getSaldo () {
        return saldo;
    }

    public void setSaldo ( double saldo ) {
        this.saldo = saldo;
    }
}
