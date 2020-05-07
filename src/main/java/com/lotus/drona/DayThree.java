package com.lotus.drona;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.testng.annotations.Test;

public class DayThree {

    @Test(enabled=false)
    public void testBigDecimal() {
    	BigDecimal value = new BigDecimal(0);
    	if (value == null) {
    		System.out.println("yes");
    	}
    		
    }
    
    @Test
    public void testDate() {
    	System.out.println(getDay("2020-05-10"));
    }
    

    public static String getDay(String currentDate) {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(dateFormat.parse(currentDate));
            int day = calendar.get(Calendar.DAY_OF_WEEK);
            switch(day) {
            case 1:
            	return "SUNDAY";
			case 2:
            	return "MONDAY";
            case 3:
            	return "TUESDAY";
            case 4:
            	return "WEDNESDAY";
            case 5:
            	return "THURSDAY";
            case 6:
            	return "FRIDAY";
            case 7:
            	return "SATURDAY";	
            default:
            	return null;
            }
        } catch (Exception e) {
            System.out.println("Exception in getting date " + e.getMessage());
        }
        return null;
    }
}
