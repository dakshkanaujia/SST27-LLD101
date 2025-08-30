public class CannotFax implements FaxBehaviour{
    @Override
    public void fax(String s){
        System.out.println("Cannot Fax");
    }    
}