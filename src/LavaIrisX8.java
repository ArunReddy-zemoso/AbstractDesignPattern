public class LavaIrisX8 extends smartPhone{
    LavaIrisX8(String ram,String rom){
        this.ram=ram;
        this.rom=rom;
    }

    public void call(){
        System.out.println("Calling from LavaIrisX8");
    }
    public void message(){
        System.out.println("Texting from LavaIrisX8");
    }
    public void videoCall(){
        System.out.println("videoCalling from LavaIrisX8");
    }
    public void printDetails(){
        System.out.println("LavaIrisX8 has "+ram+" of ram and "+rom+" of rom");
    }
}
