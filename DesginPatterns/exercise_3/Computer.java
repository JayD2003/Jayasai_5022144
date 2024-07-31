package exercise_3;

public class Computer {
    // Attributes of Computer
    private String CPU;
    private String RAM;
    private String storage;
    private String GPU;
    private String powerSupply;

    // Private constructor to ensure object creation only through the Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.GPU = builder.GPU;
        this.powerSupply = builder.powerSupply;
    }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", storage=" + storage + 
               ", GPU=" + GPU + ", powerSupply=" + powerSupply + "]";
    }

    // Step 3: Implement the Builder Class
    public static class Builder {
        private String CPU;
        private String RAM;
        private String storage;
        private String GPU;
        private String powerSupply;

        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Methods to set each attribute
        public Builder setCPU(String CPU) {
            this.CPU = CPU;
            return this;
        }

        public Builder setRAM(String RAM) {
            this.RAM = RAM;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        public Builder setGPU(String GPU) {
            this.GPU = GPU;
            return this;
        }

        public Builder setPowerSupply(String powerSupply) {
            this.powerSupply = powerSupply;
            return this;
        }

        // Build method to return an instance of Computer
        public Computer build() {
            return new Computer(this);
        }
    }
}