public class Bus extends Car {

    private String doorNum, Company;

    public Bus() {
    }

    public Bus(String peoplenum1, String doorNum1, String Company1) {
        this.setpeoplenum(peoplenum1);
        doorNum = doorNum1;
        Company = Company1;
    }

    // public void setpeoplenum(String newpeoplenum){
    // this.peoplenum=newpeoplenum;
    // }
    // public String getpeoplenum(){
    // return this.peoplenum;
    // }
    public void setdoorNum(String newdoorNum) {
        this.doorNum = newdoorNum;
    }

    public String getdoorNum() {
        return this.doorNum;
    }

    public void setCompany(String newCompany) {
        this.Company = newCompany;
    }

    public String getCompany() {
        return this.Company;
    }

    public String showinfo() {
        return "Bus:  " + this.getpeoplenum() + " | " + getdoorNum() + " | " + getCompany();
    }
}