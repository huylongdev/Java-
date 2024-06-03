import java.util.ArrayList;
import java.util.Scanner;

import Controller.management;
import Model.CONGTAC;
import Model.HOC;
import Model.NHANSU;
import Model.PHEP;

public class Main {
    public static void main(String[] args) {	
    	ArrayList<NHANSU> list = new ArrayList<>();
        
        
            PHEP phep = new PHEP();
            HOC hoc = new HOC();
            CONGTAC congtac = new CONGTAC();
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào thứ bạn muốn add");
            System.out.println("1.Nghỉ phép ");
            System.out.println("2.Học ");
            System.out.println("3.Công tác");
            System.out.println("Your choice: ");
            int a = sc.nextInt();
            
            
            
            
            
            sc.nextLine();
            if (a==1){
                list.add(phep.addition());
            }
            if (a==2){
                list.add(hoc.addition());
            }
            if (a==3){
                list.add(congtac.addition());
            
        }    }
}