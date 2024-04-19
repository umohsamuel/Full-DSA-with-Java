package com.laptop;

import com.laptop.components.GraphicsCard;
import com.laptop.components.Processor;

public class Laptop {
    private float screen;
    private Processor processor;
    private String ram;
    private String hardDrive;
    private GraphicsCard graphicsCard;
    private String opticalDrive;
    private String keyBoard;

    public Laptop() {
        this.screen = 14.5f;
        this.processor = new Processor();
        this.ram = "16GB";
        this.hardDrive = "1TB SSD";
        this.graphicsCard = new GraphicsCard();
        this.opticalDrive = "MLT";
        this.keyBoard = "Backlit";
    }

    public Laptop(float screen, Processor processor, String ram, String hardDrive, GraphicsCard graphicsCard, String opticalDrive, String keyBoard) {
        this.screen = screen;
        this.processor = processor;
        this.ram = ram;
        this.hardDrive = hardDrive;
        this.graphicsCard = graphicsCard;
        this.opticalDrive = opticalDrive;
        this.keyBoard = keyBoard;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screen=" + screen +
                ", processor=" + processor +
                ", ram='" + ram + '\'' +
                ", hardDrive='" + hardDrive + '\'' +
                ", graphicsCard=" + graphicsCard +
                ", opticalDrive='" + opticalDrive + '\'' +
                ", keyBoard='" + keyBoard + '\'' +
                '}';
    }

    public float getScreen() {
        return screen;
    }

    public Processor getProcessor() {
        return processor;
    }

    public String getRam() {
        return ram;
    }

    public String getHardDrive() {
        return hardDrive;
    }

    public GraphicsCard getGraphicsCard() {
        return graphicsCard;
    }

    public String getOpticalDrive() {
        return opticalDrive;
    }

    public String getKeyBoard() {
        return keyBoard;
    }

    public void gamingMode() {
        processor.setFrequency(processor.getMaxFrequency());
    }
}
