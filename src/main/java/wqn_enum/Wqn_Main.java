package wqn_enum;

public class Wqn_Main {
    public static void main(String[] args) {
        Wqn_Enum wqn_enum = Enum.valueOf(Wqn_Enum.class,"LARGE");
        System.out.println(wqn_enum.getAbbreviation());
    }
}
