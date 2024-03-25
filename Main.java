class Segitiga {
    private double alas;
    private double tinggi;
    private double sisi;

    public Segitiga() {
        alas = 1;
        tinggi = 1;
        sisi = 1;
    } 
    
    public Segitiga(double alasBaru, double tinggiBaru, double sisiBaru) {
        alas = alasBaru;
        tinggi = tinggiBaru;
        sisi = sisiBaru;
    }
    
    public void setAlas(double alasBaru) {
        this.alas = alasBaru;
    }
    
    public double getAlas() {
        return this.alas;
    }
    
    public void setTinggi(double tinggiBaru) {
        this.tinggi = tinggiBaru;
    }
    
    public double getTinggi() {
        return this.tinggi;
    }
    
    public void setSisi(double sisiBaru) {
        this.sisi = sisiBaru;
    }
    
    public double getSisi() {
        return this.sisi;
    }
    
    public double getLuas() {
        return 0.5 * this.alas * this.tinggi;
    }
    
    public double getKeliling() {
        return this.sisi * 3;
    }
}

public class Main {
    public static void main(String[] args) {

        Segitiga segitiga1 = new Segitiga();
        System.out.println("Segitiga 1:");
        System.out.println("Luas: " + segitiga1.getLuas());
        System.out.println("Keliling: " + segitiga1.getKeliling());


        Segitiga segitiga2 = new Segitiga(30, 10, 90);
        System.out.println("\nSegitiga 2:");
        System.out.println("Luas: " + segitiga2.getLuas());
        System.out.println("Keliling: " + segitiga2.getKeliling());


        Segitiga segitiga3 = new Segitiga(20, 30, 60);
        System.out.println("\nSegitiga 3:");
        System.out.println("Luas: " + segitiga3.getLuas());
        System.out.println("Keliling: " + segitiga3.getKeliling());
    }
}
