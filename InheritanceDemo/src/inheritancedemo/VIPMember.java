package inheritancedemo;

public class VIPMember extends Member{
    public VIPMember(String pName,int pMemberId,int pMemberSince){
        super(pName,pMemberId,pMemberSince);
        System.out.println("Child constructor with 3 parameters ");
    }

    @Override
    public void calculateAnnualFee(){
        annualFee=(1-0.01*getDiscount())*1200;
    }
}
