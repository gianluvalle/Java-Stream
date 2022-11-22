package it.unikey.utils;

import java.text.DecimalFormat;
import java.time.format.DateTimeFormatter;

public class Formatters {

    public static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DecimalFormat decimalFormatter = new DecimalFormat("0.00");
}
