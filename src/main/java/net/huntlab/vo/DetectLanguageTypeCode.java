package net.huntlab.vo;

import lombok.Data;

@Data
public enum DetectLanguageTypeCode {
    KOR("KO", "KOREA", "한국어", "한국")
    , USA("US", "UNITEDSTATEAMERICA", "English", "UNITED STATE AMERICA")
    , JPN("JP", "JAPAN", "日本語", "日本の")
    , CHN("CH", "CHINA", "中文", "中文版")
    ;

    private String TypeCode;
    private String TypeCountry;
    private String LanguageName;
    private String CountryName;

    private DetectLanguageTypeCode(String typeCode, String tyoeCountry, String languageName, String countryName){}
}
