public abstract class Car{

    private String color,capacity,weight,Displacement,Year;

    public Car() {
    }

    public Car(String color1, String capacity1, String weight1, String Displacement1 ,String Year1) {
        color = color1;
        capacity = capacity1;
        weight=weight1;
        Displacement=Displacement1;
        Year=Year1;
        // this.color=newcolor;
        // this.capacity=newcapacity;
        // this.weight=newweight;
        // this.Displacement=newDisplacement;
        // this.Year=newYear;
    }

    public void setcolor(String newcolor) {
        this.color = newcolor;
    }

    public String getcolor() {
        return this.color;
    }

    public void setcapacity(String newcapacity) {
        this.capacity = newcapacity;
    }

    public String getcapacity() {
        return this.capacity;
    }

    public void setweight(String newweight) {
        this.weight = newweight;
    }

    public String getweight() {
        return this.weight;
    }
    public void setDisplacement(String newDisplacement) {
        this.Displacement = newDisplacement;
    }

    public String getDisplacement() {
        return this.Displacement;
    }
    public void set(String newYear) {
        this.Year = newYear;
    }

    public String getYear() {
        return this.Year;
    }
    public abstract String showinfo() ;
}
