package FIS;

public class student extends user {
    String universityID;
    double GPA;
    int academicYr;
    int path;


    public void displayInfo()
    {
        System.out.println("NIC Number: "+this.NIC);
        System.out.println("Name: "+this.name);
        if (this.email!=null) System.out.println("email: "+this.email);
        System.out.println("Phone Number: "+this.phoneNumber);
    }

    void GPAIncrease(){
        System.out.println("Current GPA "+this.GPA);
        if (this.academicYr ==2) this.GPA+=0.001;
        System.out.println("Updated GPA "+this.GPA);
    }

    boolean specialDegree(double cutoff)
    {
        if (this.GPA>=cutoff)
            return true;
        else return false;
    }
}
