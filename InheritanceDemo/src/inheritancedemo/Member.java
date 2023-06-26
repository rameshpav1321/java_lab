package inheritancedemo;
import java.util.*;
public class Member {
    public String welcome="Welcome to ABC fitness";
    protected double annualFee;
    private String name;
    private int memberId;
    private int memberSince;
    private int discount;

    public Member(){
        System.out.println("Parent constructor with no parameter");
    }
    public Member(String pName,int pMemberId,int pMemberSince){
        System.out.println("Parent constructor with 3 parameters");

        name=pName;
        memberId=pMemberId;
        memberSince=pMemberSince;

    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(){
        Scanner input=new Scanner(System.in);
        String password;
        System.out.print("Please enter the admin password: ");
        password=input.nextLine();
        if(!password.equals("abcd")){
            System.out.println("Invalid passowrd...");
        }else{
            System.out.print("Please enter the discount: ");
            discount= input.nextInt();
        }
    }
    public void displayMemInfo(){
        System.out.println("Member Name: "+name);
        System.out.println("Member ID: "+memberId);
        System.out.println("Member Since: "+memberSince);
        System.out.println("Annual Fee: "+annualFee);
    }

    public void calculateAnnualFee(){
        annualFee=0;
    }
}
