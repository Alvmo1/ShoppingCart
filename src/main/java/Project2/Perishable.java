package Project2;

public interface Perishable {

    default boolean isPerishable(){
        return false;
    }
}
