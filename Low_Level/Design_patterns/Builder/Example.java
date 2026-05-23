package Low_Level.Design_patterns.Builder;


class Computer{
    private String RAM;
    private String CPU;
    private String Storage;

    private Computer(BuildComputer builder){
        this.RAM = builder.RAM;
        this.CPU = builder.CPU;
        this.Storage = builder.Storage;
    }

        static class BuildComputer{
            String RAM;
            String CPU;
            String Storage;

            BuildComputer setRam(String RAM){
                this.RAM = RAM;
                return this;
            }

            BuildComputer setCPU(String CPU){
                this.CPU = CPU;
                return this;
            }

            BuildComputer setStorage(String Storage){
                this.Storage = Storage;
                return this;
            }

            Computer build(){
                return new Computer(this);
            }
        }

        public void show(){
            System.out.println(RAM+ " "+CPU+ " "+Storage);
        }
    

}

public class Example {
    public static void main(String[] args) {
        
        Computer computer = new Computer.BuildComputer()
        .setCPU("Intel")
        .setRam("16Gb")
        .setStorage("512 GB")
        .build();

        computer.show();

    }
}
