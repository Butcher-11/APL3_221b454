public class ESingleton{
    private static ESingleton uniqueInstance = new ESingleton();
    private ESingleton(){}
    public static ESingleton getInstance(){
        return uniqueInstance;
    }
}