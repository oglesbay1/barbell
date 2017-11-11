package com.timbuchalka;

public class BarbellWeight {

    private String name;
    private String bar;
    private float totalweight;


    public BarbellWeight(String name, String bar, float totalweight) {
        this.name = name;
        this.bar = bar;
        this.totalweight = totalweight;


    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBar(String bar) {
        this.bar = bar;
    }

    public int getBar() {
        if (this.bar == "bow") {
            return 65;
        }
        if (this.bar == "male regular") {
            return 45;
        }
        if (this.bar == "female regular") {
            return 35;
        }
        if (this.bar == "football") {
            return 45;
        }

        if (this.bar == "zigzag") {
            return 25;
        } else {
            return 0;
        }
    }


    public float getTotalweight() {
        return this.totalweight;
    }

    public void setTotalweight(float totalweight) {
        this.totalweight = totalweight;
    }

    public boolean isWeightValid() {
        return this.totalweight - this.getBar() > 0;

    }

    public void printTotalPlateWeightResults() {
        if (isWeightValid()) {
            System.out.println(this.bar + " bar = " + getBar() + ".  Weight of plates = " + calculateTotalPlateWeight());
        } else {
            System.out.println("Did not compute");
        }
    }


    public float calculateTotalPlateWeight() {
        totalweight -= this.getBar();
        return this.totalweight; //calculating the weight minus the bar being used;
    }

    public float calculatePlateWeightOneSide() {
        this.totalweight /= 2;
        return this.totalweight; //calculating the plate weight for one side of bar;
    }

    public boolean isPlateWeightValid() {
        return this.totalweight >=0;
    }

    public int caculate45lbPlatesPerSide() {
        if (isPlateWeightValid()) {
            float n = (this.totalweight / 45);
            int x = (int) n;
            if (x < 1) {
                return 0;
            } else
                System.out.println("45lb plates per side =" + x);
            return x;
        } else {
            System.out.println("Weight not Valid");
            return 0;
        }


    }

    public float calculateWeightminus45lbPlates() {
        if (isPlateWeightValid()) {
            this.totalweight -= (caculate45lbPlatesPerSide() * 45);
            return this.totalweight;
        } else {
            return 0;
        }
    }

    public void calculateSetUp() {
        calculateTotalPlateWeight();
        calculatePlateWeightOneSide();
    }


    public int calculate25lbEachSide() {
        if (isPlateWeightValid()) {
            float n = (this.totalweight / 25);
            int x = (int) n;
            if (x < 1) {
                return 0;
            } else
                System.out.println("25lb plates per side =" + x);
            return x;
        } else {
            System.out.println("Weight not Valid");
            return 0;
        }
    }
    public float calculateWeightminus4525lbPlates() {
        if (isPlateWeightValid()) {
            this.totalweight -= (calculate25lbEachSide() * 25);
            return this.totalweight;
        } else {
            return 0;
        }
    }
    public int calculate15lbEachSide() {
        if (isPlateWeightValid()) {
            float n = (this.totalweight / 15);
            int x = (int) n;
            if (x < 1) {
                return 0;
            } else
                System.out.println("15lb plates per side =" + x);
            return x;
        } else {
            System.out.println("Weight not Valid");
            return 0;
        }
    }
    public float calculateWeightminus452515lbPlates() {
        if (isPlateWeightValid()) {
            this.totalweight -= (calculate15lbEachSide() * 15);
            return this.totalweight;
        } else {
            return 0;
        }
    }
    public int calculate10lbEachSide() {
        if (isPlateWeightValid()) {
            float n = (this.totalweight / 10);
            int x = (int) n;
            if (x < 1) {
                return 0;
            } else
                System.out.println("10lb plates per side =" + x);
            return x;
        } else {
            System.out.println("Weight not Valid");
            return 0;
        }
    }
    public float calculateWeightminus45251510lbPlates() {
        if (isPlateWeightValid()) {
            this.totalweight -= (calculate10lbEachSide() * 10);
            return this.totalweight;
        } else {
            return 0;
        }
    }


    public int calculate5lbEachSide() {
        if (isPlateWeightValid()) {
            float n = (this.totalweight / 5);
            int x = (int) n;
            if (x < 1) {
                return 0;
            } else
                System.out.println("5lb plates per side =" + x);
            return x;
        } else {
            System.out.println("Weight not Valid");
            return 0;
        }
    }
    public float calculateWeightminus4525155lbPlates() {
        if (isPlateWeightValid()) {
            this.totalweight -= (calculate5lbEachSide() * 5);
            return this.totalweight;
        } else {
            return 0;
        }
    }
    public int calculate2halflbEachSide() {
        if (isPlateWeightValid()) {
            double n = (this.totalweight / 2.5);
            int x = (int) n;
            if (x < 1) {
                return 0;
            } else
                System.out.println("2.5lb plates per side =" + x);
            return x;
        } else {
            System.out.println("Weight not Valid");
            return 0;
        }
    }
    public float calculateWeightminus45251552halflbPlates() {
        if (isPlateWeightValid()) {
            this.totalweight -= (calculate2halflbEachSide() * 2.5);
            return this.totalweight;
        } else {
            return 0;
        }
    }

    public int calculate1lbEachSide() {
        if (isPlateWeightValid()) {
            double n = (this.totalweight / 1);
            int x = (int) n;
            if (x < 1) {
                return 0;
            } else
                System.out.println("1lb plates per side =" + x);
            return x;
        } else {
            System.out.println("Weight not Valid");
            return 0;
        }
    }
    public float calculateWeightminus45251552half1lbPlates() {
        if (isPlateWeightValid()) {
            this.totalweight -= (calculate1lbEachSide() * 1);
            return this.totalweight;
        } else {
            return 0;
        }
    }

    public int calculateHalflbEachSide() {
        if (isPlateWeightValid()) {
            double n = (this.totalweight / 0.5);
            int x = (int) n;
            if (x < 1) {
                return 0;
            } else
                System.out.println(".5lb plates per side =" + x);
            return x;
        } else {
            System.out.println("Weight not Valid");
            return 0;
        }
    }
    public float calculateWeightminus45251552half1halflbPlates() {
        if (isPlateWeightValid()) {
            this.totalweight -= (calculateHalflbEachSide() * 0.5);
            return this.totalweight;
        } else {
            return 0;
        }
    }


    public void calculatePlatesPerSide() {
        calculateSetUp();
        calculateWeightminus45lbPlates();
        calculateWeightminus4525lbPlates();
        calculateWeightminus452515lbPlates();
        calculateWeightminus45251510lbPlates();
        calculateWeightminus4525155lbPlates();
        calculateWeightminus45251552halflbPlates();
        calculateWeightminus45251552half1lbPlates();
        calculateWeightminus45251552half1halflbPlates();
    }


}













