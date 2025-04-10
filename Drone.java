public class Drone {
    int energi;
    int ketinggian;
    int kecepatan;
    String merek;
    
    void terbang(){
        energi -- ;
        if (energi > 10){
            ketinggian ++;
            System.out.println("Drone terbang");
            
        }else {
            System.out.println("energi lemah ; tidak dapat terbang");
            
        }
    }
    void matikanMesin(){
        if(ketinggian >0){
            System.out.println("mesin tidak aktif");
            
        }else {
            System.out.println("mesin mati");
            
        }
    }
    void turun(){
        ketinggian --;
        energi --;
        System.out.println("turun");
    }
    void belok(){
        energi --;
        System.out.println("BELOK");
    }
    void maju(){
        energi --;
        System.out.println("MAju");
        kecepatan ++;
        
    }
    void mundur(){
        energi --;
        System.out.println(mundur);
        kecepatan ++;
    }
}
