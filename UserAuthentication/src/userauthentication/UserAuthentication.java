package userauthentication;
import java.util.Scanner;
public class UserAuthentication {

    public static void main(String[] args){
        String name,password;
        int id;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=scanner.nextLine();
        System.out.println("Enter your Id:");
        id=scanner.nextInt();
        System.out.println("Enter your Password:");
        password=scanner.next();
        if(name.equals("User") && id==101 && password.equals("user@101")){
            System.out.println("Verified!\nWelcome!");
        }
        else{
            System.out.println("Access Denied!"); 
        }
    }   
    public void statusCheck(){
        
    }
}
