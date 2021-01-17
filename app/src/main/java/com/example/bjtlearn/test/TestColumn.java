package com.example.bjtlearn.test;

public enum TestColumn {
    COLUMN_ID("ID", "INTEGER PRIMARY KEY NOT NULL"),
    COLUMN_AAA("AAA", "TEXT"),
    COLUMN_BBB("BBB", "TEXT"),
    COLUMN_CCC("CCC", "TEXT"),
    COLUMN_DDD("DDD", "INTEGER"),
    COLUMN_EEE("EEE", "TEXT"),
    COLUMN_FFF("FFF", "TEXT"),
    COLUMN_GGG("GGG", "TEXT"),
    COLUMN_HHH("HHH", "INTEGER"),
    COLUMN_III("III", "TEXT"),
    COLUMN_JJJ("JJJ", "TEXT"),
    COLUMN_KKK("KKK", "TEXT"),
    COLUMN_LLL("LLL", "INTEGER"),
    COLUMN_MMM("MMM", "TEXT"),
    COLUMN_NNN("NNN", "TEXT"),
    COLUMN_OOO("OOO", "TEXT"),
    COLUMN_PPP("PPP", "TEXT"),
    COLUMN_QQQ("QQQ", "INTEGER"),
    COLUMN_RRR("RRR", "TEXT"),
    COLUMN_SSS("SSS", "TEXT"),
    COLUMN_TTT("TTT", "TEXT"),
    COLUMN_UUU("UUU", "INTEGER"),
    COLUMN_VVV("VVV", "TEXT"),
    COLUMN_WWW("WWW", "TEXT"),
    COLUMN_XXX("XXX", "TEXT"),
    COLUMN_YYY("YYY", "TEXT"),
    COLUMN_ZZZ("ZZZ", "INTEGER");

    public String key;
    public String type;

    TestColumn(String key, String type) {
        this.key = key;
        this.type = type;
    }

}
