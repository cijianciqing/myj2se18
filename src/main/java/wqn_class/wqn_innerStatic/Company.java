package wqn_class.wqn_innerStatic;

class Company {
    private String theCEO = "stupid";
    private static String companyName = "STUPID COM";
    public Company(){
        System.out.println("Company object is created");
    }
    //内部类
    static class Employee {
        public Employee() {
            System.out.println("company name - " + Company.companyName);
        }
    }
}

