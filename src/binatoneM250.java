public class binatoneM250 extends dumpPhone{
    binatoneM250(String ram,String rom){
        this.ram=ram;
        this.rom=rom;
    }
    public void call(){
        System.out.println("Calling from binatoneM250");
    }
    public void message(){
        System.out.println("Texting from binatoneM250");
    }
    public void printDetails(){
        System.out.println("binatoneM250 has "+ram+" of ram and "+rom+" of rom");
    }
}
