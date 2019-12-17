public class Main {


    public static void main(String[] args) {
        LimasSegiEmpat limasSegiEmpat = new LimasSegiEmpat();
        System.out.println("panjang: "+limasSegiEmpat.getPanjang());
        System.out.println("lebar: "+limasSegiEmpat.getLebar());
        System.out.println("tinggi: "+limasSegiEmpat.getTinggi());
        System.out.println("volume: "+limasSegiEmpat.VolumeLimasSegiEmpat());
        System.out.println("luas: "+limasSegiEmpat.LuasPermukaanLimasSegiEmpat());
        System.out.println("keliling: "+limasSegiEmpat.KelilingLimasSegiEmpat());
    }
}
