public class MiA1 extends smartPhone{
    MiA1(String ram,String rom){
        this.ram=ram;
        this.rom=rom;
    }
    public void call(){
        System.out.println("Calling from MiA1");
    }
    public void message(){
        System.out.println("Texting from MiA1");
    }
    public void videoCall(){
        System.out.println("videoCalling from MiA1");
    }
    public void printDetails(){
        System.out.println("MiA1 has "+ram+" of ram and "+rom+" of rom");
    }
}

