package org.hbrs.se1.ws21.uebung1.control.test;

import org.hbrs.se1.ws21.uebung1.control.GermanTranslator;
import org.hbrs.se1.ws21.uebung1.control.Translator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GermanTranslatorTest {

    @Test
    void translateNumberTest() {
        GermanTranslator g=new GermanTranslator();
        assertEquals("Übersetzung der Zahl"+ "  "+(12)+ " "+ "nicht möglich" + " ("+Translator.version+")",  g.translateNumber(12)); //Äk1
        assertEquals("Übersetzung der Zahl"+ "  "+(-17)+ " "+ "nicht möglich" + " ("+Translator.version+")",  g.translateNumber(-17)); //Äk2
        assertEquals("Übersetzung der Zahl"+ "  "+(0)+ " "+ "nicht möglich" + " ("+Translator.version+")",  g.translateNumber(0));
        assertEquals("fünf", g.translateNumber(5));  //Äk3
        assertEquals("eins", g.translateNumber(1));  //Äk3

    }
}