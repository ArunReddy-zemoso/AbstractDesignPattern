public class nokia3310 extends dumpPhone{
    nokia3310(String ram,String rom){
        this.ram=ram;
        this.rom=rom;
    }
    public void call(){
        System.out.println("Calling from nokia3310");
    }
    public void message(){
        System.out.println("Texting from nokia3310");
    }
    public void printDetails(){
        System.out.println("nokia3310 has "+ram+" of ram and "+rom+" of rom");
    }
}
