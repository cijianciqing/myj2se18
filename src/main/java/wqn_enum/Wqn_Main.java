package wqn_enum;

public class Wqn_Main {
    public static void main(String[] args) {
//        Wqn_Enum wqn_enum = Enum.valueOf(Wqn_Enum.class,"SMALL");
        Wqn_Enum wqn_enum = Wqn_Enum.SMALL;
        System.out.println(wqn_enum.getAbbreviation());


//        CJValidateCodeType cjValidateCodeType = CJValidateCodeType.IMAGE;
//        System.out.println(cjValidateCodeType.getParamNameOnValidate());
    }
}
