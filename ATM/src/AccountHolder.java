public class AccountHolder {
    private int ssn;
    private String name;
    private String phone;
    private String Address;

    AccountHolder (String name, int ssn) {
        this.name = name;
        this.ssn = ssn;
    }

    public void addInfo(String phone, String address) {
        this.phone = phone;
        this.address = address;
    }
    public String getName() {
        return name;
    }
    public int getSSN() {
        return ssn;
    }
}
