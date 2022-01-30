public class nokia216 extends dumpPhone{
    nokia216(String ram,String rom){
        this.ram=ram;
        this.rom=rom;
    }
    public void call(){
        System.out.println("Calling from nokia216");
    }
    public void message(){
        System.out.println("Texting from nokia216");
    }
    public void printDetails(){
        System.out.println("nokia216 has "+ram+" of ram and "+rom+" of rom");
    }
}
