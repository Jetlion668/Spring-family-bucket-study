package com.southwind.converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.core.convert.converter.Converter;

public class DateConverter implements Converter<String,Date>{

    private String pattern;

    public DateConverter(String pattern){
        this.pattern = pattern;
    }

    public Date convert(String source) {
        // TODO Auto-generated method stub
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        try {
            return simpleDateFormat.parse(source);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }

}
