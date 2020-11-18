package tugas;

public class Gorilla extends Binatang implements IKarnivora, IHerbivora {
   private String suara;
    private  String warnaBulu;

    public Gorilla(String nama, int jmlKaki,String suara, String warnaBulu) {
        super(nama, jmlKaki);
        this.suara=suara;
        this.warnaBulu=warnaBulu;
    }
    @Override
    public void displayMakan(){
    System.out.println("Gorilla Merupakan Pemakan Daging dan Tumbuhan");
}
    @Override
    public void displayBinatang() {
        System.out.println("Nama        : "+ super.nama);
        System.out.println("Jumlah Kaki : " +super.jmlKaki);
    }
    public void displayData(){
        System.out.println("Suara       : "+this.suara);
        System.out.println("Warna Bulu  : "+this.warnaBulu );
    }    
}
