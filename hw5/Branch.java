public class Branch {
    private String branchCode;
    private String city;
    private int degree;

    public Branch(String branchCode, String city, int degree) {
        this.branchCode = branchCode;
        this.city = city;
        setDegree(degree);
    }

    public String getBranchCode() {
        return branchCode;
    }
    public void setBranchCode(String branchCode) {
        this.branchCode = branchCode;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public int getDegree() {
        return degree;
    }
    public void setDegree(int degree) {
        if (0 <degree && degree < 4)
          this.degree = degree;
        else
            System.out.println("Degree must be between 1 to 3.");
    }

    @Override
    public String toString() {
        return "Branch code: " + branchCode + '\n' +
                "City: " + city + '\n' +
                "Degree: " + degree ;
    }
}
