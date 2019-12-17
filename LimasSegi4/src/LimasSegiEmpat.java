public class LimasSegiEmpat {
    private double panjang,lebar,tinggi,tinggiPanjang,tinggiLebar,luasAlas,luasPermukaan,volume,keliling;

    public double getPanjang() {
        panjang = getRandomIntegerBetweenRange(1,100);
        return panjang;
    }

    public double getLebar() {
        lebar = getRandomIntegerBetweenRange(1,100);
        return lebar;
    }

    public double getTinggi() {
        tinggi = getRandomIntegerBetweenRange(1,100);
        return tinggi;
    }

    public double getTinggiPanjang() {
        tinggiPanjang =  Math.sqrt(Math.pow(tinggi,2) + Math.pow((lebar/2),2));
        return tinggiPanjang;
    }

    public double getTinggiLebar() {
        tinggiLebar =  Math.sqrt(Math.pow(tinggi,2) + Math.pow((tinggi/2),2));
        return tinggiLebar;
    }

    public double getLuasAlas() {
        luasAlas = panjang*lebar;
        return luasAlas;
    }

    public double getVolume() {
        volume = getLuasAlas()*tinggi;
        return volume;
    }

    public double getLuasPermukaan() {
        double luasSisiPanjang,luasSisiLebar;

        luasSisiPanjang = (panjang*tinggiPanjang)/2;
        luasSisiLebar = (lebar*tinggiLebar)/2;

        luasPermukaan = luasAlas+(2*(luasSisiPanjang+luasSisiLebar));
        return (int) luasPermukaan;
    }

    public double getKeliling() {
        double miringPanjang,miringLebar;
        miringPanjang =  Math.sqrt(Math.pow(tinggiPanjang,2) + Math.pow((panjang/2),2));
        miringLebar =  Math.sqrt(Math.pow(tinggiLebar,2) + Math.pow((lebar/2),2));
        keliling = (2*panjang)+(2*lebar)+(2*miringPanjang)+(2*miringLebar);
        return keliling;
    }

    public double VolumeLimasSegiEmpat() {
        return getVolume();
    }

    public double LuasPermukaanLimasSegiEmpat() {
        return getLuasPermukaan();
    }

    public double KelilingLimasSegiEmpat() {
        return getKeliling();
    }

    public static double getRandomIntegerBetweenRange(double min, double max){
        double x = (int)(Math.random()*((max-min)+1))+min;
        return x;
    }
}
