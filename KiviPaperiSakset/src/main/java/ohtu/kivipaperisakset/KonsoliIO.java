package ohtu.kivipaperisakset;

import java.util.Scanner;

public class KonsoliIO implements IO {
    
    static final Scanner scanner = new Scanner(System.in);

    @Override
    public String read() {
        return scanner.nextLine();
    }

    @Override
    public void print(Object o) {
        System.out.println(o);
    }
    
}
