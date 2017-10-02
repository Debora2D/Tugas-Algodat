package Tugasalgodat;

public class Main {
    public static void main(String[] args) {
        
        Object [][] data ={
            {"Rizky"  ,"1993" ,"Laki-laki"}, // baris ke-0
            {"Mustika","1999" ,"Perempuan"}, // baris ke-1
            {"Aditya"   ,"1998" ,"Laki-laki"}, // baris ke-2
            {"Yudha"   ,"1994" ,"Laki-laki"}, // baris ke-3
            {"Tino"   ,"1997" ,"Laki-laki"}  // baris ke-4
        };
        
        Object[][] ganti = ChangeArrayLength.changeLength2D(data, 9, 3);
        
        System.out.println("Length   : "+ganti.length);
        System.out.println("Length 2 : "+ganti[0].length);
        System.out.println("");
        
        for(Object[] ganti2 : ganti){
            for(int i = 0; i<ganti[0].length; i++){
                System.out.println(ganti2[i]);
            }
            System.out.println();
        }
    }
}
