package kiralynok;

import java.io.IOException;

public class Kiralynok {

    public static void main(String[] args) throws IOException {
        //4. feladat
        Tabla tabla = new Tabla('#');
        System.out.println("4. feladat: Az üres tábla");
        tabla.megjelenit();
        
        //5. feladat
        tabla.elhelyez(8);
        tabla.megjelenit();
        
        
    }

}
