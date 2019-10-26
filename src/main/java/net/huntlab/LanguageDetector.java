package net.huntlab;

import net.huntlab.vo.DetectLanguageTypeCode;
import org.apache.commons.lang3.StringUtils;

/**
 * return Enum<DetectLanguageTypeCode>
 * DetectLanguageTypeCode :
 * KOREA(TypeCode, TypeCountry, LanguageName, CountryName), AMERICA(...), JAPAN(...), CHINA(...)
 */
public class LanguageDetector {
    private LanguageDetector () {}

    public Enum<DetectLanguageTypeCode> transTargetLanguage(String s) throws Exception{
        if (StringUtils.isEmpty(s)) { // 0, null
            throw new NullPointerException();
        }
        char[] c = s.toCharArray();

        // 숫자여부
        // 특수문자여부
        for (char indexC : c) {
            if (validate(indexC) == false) {
                throw new IllegalArgumentException();
            }
            // 복합 문자열일 경우 throw
        }

        String characterString = utf8ByteAnalyzer(c[0]);
        if (StringUtils.equals(characterString, "KOR")) {
            return DetectLanguageTypeCode.KOR;
        } else if (StringUtils.equals(characterString, "USA")) {
            return DetectLanguageTypeCode.USA;
        } else if (StringUtils.equals(characterString, "JPN")) {
            return DetectLanguageTypeCode.JPN;
        } else if (StringUtils.equals(characterString, "CHN")) {
            return DetectLanguageTypeCode.CHN;
        } else {
            throw new Exception("Not Supported Language Type(support : KOR, USA, JPN, CHN)");
        }
    }

    private boolean validate(char c) {
        return true; // temp
    }
    private String utf8ByteAnalyzer(char c) {
        int charType = Character.getType(c);
        String result = "";
        switch (charType) {
            case 0 :
                break;
            case 1 :
                break;
            case 2 :
                break;
            case 3 :
                break;
            case 4 :
                break;
            case 5 :
                result = "KOR";
                break;
            default :
                break;
        }
        return result;
    }
}
