public class CanFax implements FaxBehaviour{
    @Override
    public void fax(String s){
        System.out.println("Fax = " + s);
    }    
}