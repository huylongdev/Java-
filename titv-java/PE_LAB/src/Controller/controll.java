package Controller;

import Model.CONGTAC;
import Model.HOC;
import Model.NHANSU;
import Model.PHEP;

import java.util.ArrayList;
import java.util.Scanner;


public class controll {
    public controll() {
    }

    ArrayList<NHANSU> list = new ArrayList<>();
    public void addNew(){
        PHEP phep = new PHEP();
        HOC hoc = new HOC();
        CONGTAC congtac = new CONGTAC();
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose type of service to add");
        System.out.println("1.Phep ");
        System.out.println("2.Hoc ");
        System.out.println("3.Cong tac ");
        System.out.println("Choose: ");
        int a = sc.nextInt();
        sc.nextLine();
        if (a==1){
            list.add(phep.add());
        }
        if (a==2){
            list.add(hoc.add());
        }
        if (a==3){
            list.add(congtac.add());
        }
    }

}

