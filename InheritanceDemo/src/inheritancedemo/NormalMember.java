package inheritancedemo;

public class NormalMember extends Member {

    public NormalMember(){
        System.out.println("Child constructor with no parameter");
    }
    public NormalMember(String pName,int pMemberId,int pMemberSince){
        super(pName,pMemberId,pMemberSince);
        System.out.println("Child constructor with 3 parameters");
    }

    @Override
    public void calculateAnnualFee(){
        annualFee=(1-0.01*getDiscount())*(100+12*30);
    }
}
