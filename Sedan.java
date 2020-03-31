public class Sedan extends Car {

    private String type, Use;

    public Sedan() {
    }

    public Sedan(String peoplenum1, String type1, String Use1) {
        this.setpeoplenum(peoplenum1);
        type = type1;
        Use = Use1;
    }

    // public void setpeoplenum(String newpeoplenum) {
    //     this.peoplenum = newpeoplenum;
    // }

    // public String getpeoplenum() {
    //     return this.peoplenum;
    // }

    public void settype(String newtype) {
        this.type = newtype;
    }

    public String gettype() {
        return this.type;
    }

    public void setUse(String newUse) {
        this.Use = newUse;
    }

    public String getUse() {
        return this.Use;
    }

    public String showinfo() {
        return "Sedan: " + this.getpeoplenum() + " | " + gettype() + " | " + getUse();
    }
}