import java.util.Random;

public class SthWithADependency {

    private ADep dependency;
    public SthWithADependency(ADep adep){
        this.dependency = adep;
    }

    public boolean determineSth(String value) {
        return dependency.isSth(value);
    }

}
