package view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author hoang hung
 */
public abstract class Menu<T> {
    private String title;
    private ArrayList<T> choices;

    public Menu() {
    }

    public Menu(String title, T[] mchon){
        this.title = title;
        choices = new ArrayList<>();
        choices.addAll(Arrays.asList(mchon));
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<T> getChoices() {
        return choices;
    }

    public void setChoices(ArrayList<T> choices) {
        this.choices = choices;
    }
//----------------------------------------------------
    public void display(){
        System.out.println(title);
        System.out.println("-------------------");
        for (int i = 0; i < choices.size(); i++){
            System.out.println((i+1) + ". " + choices.get(i));
        }
        System.out.println("-------------------");
    }
//----------------------------------------------------
    public int getSelected(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your choice: ");
        return sc.nextInt();
    }    
//----------------------------------------------------
    public abstract void execute(int ch);
//----------------------------------------------------
    public void run(){
        while (true) {
            display();
            int choice = getSelected();
            
            if (choice <= 0 || choice > choices.size()) {
                System.out.println("Invalid choice!!!");
            }
            execute(choice);
            if (choice == choices.size()) {
                break;
            }
        } 
    }    
//----------------------------------------------------    
}
