package org.maks.newclass;

public enum LevelEnglish {
    BEGINNER("Beginner"),
    INTERMEDIATE("Intermediate"),
    ADVANCED("Advanced"),

    FLUENT("Fluent");

    private String desc;

    LevelEnglish(String desc) {
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }


}
