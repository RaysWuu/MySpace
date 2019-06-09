package com.company;

public enum KeyMapperEnum {
    ONE('1',new char[] {}),
    TWO('2',new char[] {'A','B','C'}),
    THREE('3',new char[] {'D','E','F'}),
    FOUR('4',new char[] {'G','H','I'}),
    FIVE('5',new char[] {'J','K','L'}),
    SIX('6',new char[] {'M','N','O'}),
    SEVEN('7',new char[] {'P','Q','R','S'}),
    EIGHT('8',new char[] {'T','U','V'}),
    NINE('9', new char[] {'W','X','Y','Z'}),
    ZERO('0', new char[] {});

    private char code;
    private char[] value;

    private KeyMapperEnum(char code, char[] value){
        this.code = code;
        this.value = value;
    }

    public static char[] getValue(char code){
        for (KeyMapperEnum item: KeyMapperEnum.values()){
            if(code == item.code){
                return item.value;
            }
        }
        return new char[]{};
    }
}
