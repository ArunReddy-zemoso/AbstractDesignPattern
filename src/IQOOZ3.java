public class IQOOZ3 extends smartPhone{
    IQOOZ3(String ram,String rom){
        this.ram=ram;
        this.rom=rom;
    }
    public void call(){
        System.out.println("Calling from IQOOZ3");
    }
    public void message(){
        System.out.println("Texting from IQOOZ3");
    }
    public void videoCall(){
        System.out.println("videoCalling from IQOOZ3");
    }
    public void printDetails(){
        System.out.println("IQOOZ3 has "+ram+" of ram and "+rom+" of rom");
    }
}
