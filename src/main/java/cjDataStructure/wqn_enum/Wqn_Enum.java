package cjDataStructure.wqn_enum;

public enum  Wqn_Enum {
    SMALL("s"),
    MEDIAM("m"),
    LARGE("l"),
    EXTRA_LARGE("xl");

    private  String abbreviation;

    Wqn_Enum(String abbreviation){
        this.abbreviation = abbreviation;
    }

    public String getAbbreviation(){
        return  this.abbreviation;
    }


}
