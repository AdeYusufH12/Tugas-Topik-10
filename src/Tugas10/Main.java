package Tugas10;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
        static ArrayList<Driver> d = new ArrayList<>();
        static ArrayList<Costumer> c = new ArrayList<>();
        static Scanner usr = new Scanner(System.in);

        public static void main (String[]args ){
            int menu;
            do {
                System.out.println("1.Input Driver");
                System.out.println("2.Input Customer");
                System.out.println("3.Info Driver");
                System.out.println("4.Info Customer");
                System.out.println("5.Top up saldo Customer");
                System.out.println("6. Transaksi Jasa Pengantaran");
                System.out.println("7. Keluar");
                System.out.println("Masukkan menu");
                menu = usr.nextInt();

                switch (menu) {
                    case 1:
                        inputDriver();
                        break;
                    case 2:
                        inputCustomer();
                        break;
                    case 3:
                        infoUserDriver();
                        break;
                    case 4:
                        infoUserCustomer();
                        break;
                    case 5:
                        topUpSaldoCustomer();
                        break;
                    case 6:
                        bayarDriver();
                        break;
                    case 7:
                        System.out.println("===Program Telah Selesai===");
                        break;
                    default:
                        System.out.println("!!! MASUKAN MENU DENGAN BENAR !!!\n");
                        break;
                }
            } while (menu != 7);
        }
        static void inputDriver () {
            String nik, nama, nomorTelepon, platMobil, jenisMobil;
            double saldo;

            System.out.println("NIK :");
            nik = usr.next();
            System.out.println("Nama :");
            nama = usr.next();
            System.out.println("Nomor Telepon :");
            nomorTelepon = usr.next();
            System.out.println("Saldo :");
            saldo = usr.nextDouble();
            System.out.println("Plat Mobil");
            platMobil = usr.next();
            System.out.println("Jenis Mobil");
            jenisMobil = usr.next();

            d.add(new Driver(nik, nama, nomorTelepon, saldo, platMobil, jenisMobil));
            System.out.println();
        }

        static void inputCustomer () {
            String nik, nama, nomorTelepon;
            double saldo;

            System.out.println("NIK :");
            nik = usr.next();
            System.out.println("Nama :");
            nama = usr.next();
            System.out.println("Nomor Telepon :");
            nomorTelepon = usr.next();
            System.out.println("Saldo :");
            saldo = usr.nextDouble();
            c.add(new Costumer(nik, nama, nomorTelepon, saldo));
            System.out.println();
        }
        private static void infoUserDriver() {
            for (Driver driver : d) {
                System.out.println("NIK :" + driver.getNik()
                        + "\nNama : " + driver.getNama()
                        + "\nNomor Telepon :" + driver.getNomorTelepon()
                        + "\nSaldo :" + driver.getSaldo()
                        + "\nNomor Plat :" + driver.getPlatMobil()
                        + "\nJenis Mobil :" + driver.getJenisMobil());
            }
            System.out.println();
        }

        static void infoUserCustomer () {
            for (Costumer customer : c) {
                System.out.println("NIK :" + customer.getNik()
                        + "\nNama :" + customer.getNama()
                        + "\nNomor Telepon :" + customer.getNomorTelepon()
                        + "\nSaldo :" + customer.getSaldo() + "\n");
            }
            System.out.println();
        }

        static void topUpSaldoCustomer () {
            int indesxCustomer, indexDriver;
            double topUp;

            System.out.println("Masukkan index customer :");
            indesxCustomer = usr.nextInt();
            System.out.println("Masukkan index driver :");
            indexDriver = usr.nextInt();
            System.out.println("Total saldo yang akan ditop up :");
            topUp = usr.nextDouble();

            d.get(indexDriver).saldo -= topUp;
            c.get(indesxCustomer).saldo += topUp;

            System.out.println("Transaksi berhasil yeayy. \n");
        }

        static void bayarDriver () {
            int indesxCustomer, indexDriver;double bayar;

            System.out.println("Masukkan index driver :");
            indexDriver = usr.nextInt();
            System.out.println("Masukkan index customer :");
            indesxCustomer = usr.nextInt();
            System.out.println("Total saldo yang akan ditop up :");
            bayar = usr.nextDouble();

            c.get(indexDriver).saldo -= bayar();
            d.get(indesxCustomer).saldo += bayar();

            System.out.println("Transaksi berhasil yeayy. \n");
        }

        private static double bayar () {
            return bayar();
        }
}
