public class CanPrint implements PrintBehaviour{
    @Override
    public void print(String str){
        System.out.println("Print : " + str);
    }    
}