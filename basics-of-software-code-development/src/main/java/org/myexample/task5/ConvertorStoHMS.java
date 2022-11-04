package org.myexample.task5;

import java.text.Format;

public class ConvertorStoHMS {
    public static String getHMSfromS(String secStr) throws NumberFormatException{

        final int allSec;
        final int mm;
        final int hh;
        final int secLeft;
        final int ss;

        allSec = Integer.parseInt(secStr);

        hh = (int) (allSec / 3600);
        secLeft = allSec - hh * 3600;
        mm = (int)( secLeft / 60);
        ss = (int)(secLeft - mm * 60);

        return String.format("%dHH %dMM %dSS", hh, mm, ss);
    }
}
