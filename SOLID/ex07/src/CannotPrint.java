public class CannotPrint implements PrintBehaviour{
    @Override
    public void print(String str){
        System.out.println("Cannot Print !");
    }    
}