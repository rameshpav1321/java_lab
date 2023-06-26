package demo;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(scopeName = "prototype")
public class Doctor implements Staff {
    @Override
    public String toString(){
        return "Doctor{"+"qualification='"+qualification+'\''+'}';
    }
    private String qualification;
    public void assist(){
        System.out.println("Doc is assisting");
    }

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }
}
