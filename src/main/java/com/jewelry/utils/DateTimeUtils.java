package com.jewelry.utils;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * DateTimeUtils
 * 
 * @Author zhi.liu
 * @Version 1.0
 * @See
 */

public class DateTimeUtils
{
    public static final String PATTERN_DATE = "yyyy-MM-dd";

    public static final String PATTERN_DATETIME = "yyyy-MM-dd HH:mm:ss";

    public static final String PATTERN_DATETIME_FULL = "yyyyMMddHHmmss";

    public static final String PATTERN_YEAR = "yyyy";

    public static final String PATTERN_MONTH = "yyyy-MM";
    
    public static final String PATTERN_MONTH_DAY = "MM-dd";

    public static final long LONG_SECOND = 1000;
    
    public static final long LONG_MINUTE = 1000 * 60;
    
    public static final long LONG_DAY = 1000 * 24 * 60 * 60;

    public static final int DAY_PER_MONTH = 30;

    public static final int MONTH_PER_YEAR = 12;
    
    public static Date parseDate(String value, String pattern)
    {
        if (value == null || value.trim().length() <= 0)
        {
            return null;
        }

        SimpleDateFormat formater = new SimpleDateFormat(pattern, Locale.US);
        try
        {
            Date date = formater.parse(value);
            return date;
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }

        return null;
    }

    /**
     * get the date, ignore the time.
     * 
     * @param date
     * @return
     */
    public static Date getDateWithoutTime(Date date)
    {
        if (date != null)
        {
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(date);
            calendar.set(Calendar.HOUR_OF_DAY, 0);
            calendar.set(Calendar.MINUTE, 0);
            calendar.set(Calendar.SECOND, 0);
            calendar.set(Calendar.MILLISECOND, 0);
            date = calendar.getTime();
        }
        return date;
    }

    public static String formatSqlDate(Date value)
    {
        return formatDate(value, PATTERN_DATE, null);
    }

    public static String formatSqlDateTime(Date value)
    {
        return formatDate(value, PATTERN_DATETIME, null);
    }

    public static String formatDateTime(Date value)
    {
        return formatDate(value, PATTERN_DATETIME_FULL, null);
    }

    public static Date getYearStart(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        return cal.getTime();
    }

    public static Date getYearEnd(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.MONTH, Calendar.DECEMBER);
        cal.set(Calendar.DAY_OF_MONTH, 31);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        return cal.getTime();
    }

    public static Date getQuarterStart(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        switch (month)
        {
        case 0:
        case 1:
        case 2:
            cal.set(Calendar.MONTH, Calendar.JANUARY);
            break;
        case 3:
        case 4:
        case 5:
            cal.set(Calendar.MONTH, Calendar.APRIL);
            break;
        case 6:
        case 7:
        case 8:
            cal.set(Calendar.MONTH, Calendar.JULY);
            break;
        case 9:
        case 10:
        case 11:
            cal.set(Calendar.MONTH, Calendar.OCTOBER);
            break;
        default:
            break;
        }
        cal.set(Calendar.DAY_OF_MONTH, 1);
        cal.set(Calendar.HOUR_OF_DAY, 0);
        cal.set(Calendar.MINUTE, 0);
        cal.set(Calendar.SECOND, 0);

        return cal.getTime();
    }

    public static Date getQuarterEnd(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        int month = cal.get(Calendar.MONTH);
        switch (month)
        {
        case 0:
        case 1:
        case 2:
            cal.set(Calendar.MONTH, Calendar.MARCH);
            cal.set(Calendar.DAY_OF_MONTH, 31);
            break;
        case 3:
        case 4:
        case 5:
            cal.set(Calendar.MONTH, Calendar.JUNE);
            cal.set(Calendar.DAY_OF_MONTH, 30);
            break;
        case 6:
        case 7:
        case 8:
            cal.set(Calendar.MONTH, Calendar.SEPTEMBER);
            cal.set(Calendar.DAY_OF_MONTH, 30);
            break;
        case 9:
        case 10:
        case 11:
            cal.set(Calendar.MONTH, Calendar.DECEMBER);
            cal.set(Calendar.DAY_OF_MONTH, 31);
            break;
        default:
            break;
        }
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        return cal.getTime();
    }

    public static Date getMonthStart(Date date)
    {
        Date nextMonthStart = getNextMonthStart(date);
        return addMonths(nextMonthStart, -1);
    }

    public static Date getMonthEnd(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        Date month = DateTimeUtils.addMonths(cal.getTime(), 1);
		cal.setTime(month);//灏嗘棩鏈熻缃负鏂扮殑鏃堕棿cal.get(Calendar.DAY_OF_MONTH)鍙杕onth鎵�湪鐨勫ぉ鏁�
        Date day = DateTimeUtils.addDays(month,
                -(cal.get(Calendar.DAY_OF_MONTH)));
        cal.setTime(day);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        return cal.getTime();
    }

    public static Date getDayStart(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 00);
        cal.set(Calendar.MINUTE, 00);
        cal.set(Calendar.SECOND, 00);

        return cal.getTime();
    }
    
    public static Date getDayEnd(Date date)
    {
        Calendar cal = Calendar.getInstance();
        cal.setTime(date);
        cal.set(Calendar.HOUR_OF_DAY, 23);
        cal.set(Calendar.MINUTE, 59);
        cal.set(Calendar.SECOND, 59);

        return cal.getTime();
    }

    public static Date getNextMonthStart(Date current)
    {
        return DateTimeUtils.addSeconds(getMonthEnd(current), 1);
    }

    /**
     * format the date with the given pattern.
     * 
     * @param value Date
     * @param pattern String the format pattern, for example,
     *            SimpleDate.PATTERN_US_DATE
     * @param tz TimeZone if null,will use the server's default timezone
     * @return String the formated string
     */
    public static String formatDate(Date value, String pattern)
    {

        return formatDate(value, pattern, null);
    }
    
    public static String formatDate(Date value, String pattern, TimeZone tz)
    {
        
        if (value == null)
        {
            return "";
        }
        SimpleDateFormat formater = new SimpleDateFormat(pattern, Locale.US);
        if (tz != null)
        {
            formater.setTimeZone(tz);
        }
        return formater.format(value);
    }

    /**
     * Add year to the date.
     * 
     * @param date
     * @param amount
     * @return
     */
    public static Date addYears(Date date, int amount)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.YEAR, amount);
        return calendar.getTime();
    }

    /**
     * Get year to the date.
     * 
     * @param date
     * @return
     */
    public static int getYear(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.YEAR);
    }

    /**
     * Add month to the date.
     * 
     * @param date
     * @param amount
     * @return
     */
    public static Date addMonths(Date date, int amount)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MONTH, amount);
        return calendar.getTime();
    }

    /**
     * Get month to the date.
     * 
     * @param date
     * @return
     */
    public static int getMonth(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.MONTH) + 1;
    }

    /**
     * Add day to the date.
     * 
     * @param date
     * @param amount
     * @return
     */
    public static Date addDays(Date date, int amount)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.DAY_OF_MONTH, amount);
        return calendar.getTime();
    }

    /**
     * Get day to the date.
     * 
     * @param date
     * @return
     */
    public static int getDay(Date date)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        return calendar.get(Calendar.DATE);
    }

    /**
     * Get quarter to the date.
     * 
     * @param date
     * @return
     */
    public static int getQuarter(Date date)
    {
        int month = getMonth(date);
        int quarter = -1;
        switch (month)
        {
        case 1:
        case 2:
        case 3:
            quarter = 1;
            break;
        case 4:
        case 5:
        case 6:
            quarter = 2;
            break;
        case 7:
        case 8:
        case 9:
            quarter = 3;
            break;
        case 10:
        case 11:
        case 12:
            quarter = 4;
            break;
        default:
            break;
        }
        return quarter;
    }

    /**
     * Add hour to the date.
     * 
     * @param date
     * @param amount
     * @return
     */
    public static Date addHours(Date date, int amount)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.HOUR, amount);
        return calendar.getTime();
    }

    /**
     * Add minutes to the date.
     * 
     * @param date
     * @param amount
     * @return
     */
    public static Date addMinutes(Date date, int amount)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.MINUTE, amount);
        return calendar.getTime();
    }

    /**
     * Add second to the date.
     * 
     * @param date
     * @param amount
     * @return
     */
    public static Date addSeconds(Date date, int amount)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.add(Calendar.SECOND, amount);
        return calendar.getTime();
    }

    public static int secondDiff(Date fromDate, Date toDate)
    {
        long diff = toDate.getTime() - fromDate.getTime();

        return (int) (diff / LONG_SECOND) + 1;
    }
    
    public static int minuteDiff(Date fromDate, Date toDate)
    {
        long diff = toDate.getTime() - fromDate.getTime();
        
        return (int) (diff / LONG_MINUTE) + 1;
    }
    
    public static int dateDiff(Date fromDate, Date toDate)
    {
        long diff = toDate.getTime() - fromDate.getTime();
        
        return (int) (diff / LONG_DAY) + 1;
    }

    public static int monthDiff(Date fromDate, Date toDate)
    {
        long dateDiff = dateDiff(fromDate, toDate);

        int monthDiff = (int) (dateDiff / DAY_PER_MONTH);

        if (addMonths(fromDate, monthDiff).after(toDate))
        {
            monthDiff--;
        }

        return monthDiff;
    }

    public static Timestamp getCurrentTimestamp()
    {
        return new Timestamp(System.currentTimeMillis());
    }

    public static Timestamp toTimestamp(Date date)
    {
        return new Timestamp(date.getTime());
    }

    public static Date toDate(Timestamp timestamp)
    {
        return new Date(timestamp.getTime());
    }

    public static java.sql.Date toSQLDate(Date date)
    {
        return new java.sql.Date(date.getTime());
    }

    /**
     * Judge whether or not that now date after the date.
     *
     * @param date
     * @return boolean
     */
    public static boolean isPast(Date date)
    {
        return isAfter(new Date(), date);
    }

    /**
     * Judge whether or not that comparedDate after baseDate.
     *
     * @param comparedDate
     * @param baseDate
     * @return if comparedDate after baseDate, then return 'true'; or return
     *         'false'.
     */
    public static boolean isAfter(Date comparedDate, Date baseDate)
    {
        return comparedDate.after(baseDate);
    }

    /**
     * Judge whether or not that comparedDate is not before baseDate.
     *
     * @param comparedDate
     * @param baseDate
     * @return if comparedDate is not before baseDate, then return 'true'; or return
     *         'false'.
     */
    public static boolean isNotBefore(Date comparedDate, Date baseDate)
    {
        return comparedDate.getTime() >= baseDate.getTime();
    }

    /**
     * Judge whether or not that comparedDate is not after baseDate.
     *
     * @param comparedDate
     * @param baseDate
     * @return if comparedDate is not after baseDate, then return 'true'; or return
     *         'false'.
     */
    public static boolean isNotAfter(Date comparedDate, Date baseDate)
    {
        return comparedDate.getTime() <= baseDate.getTime();
    }

    public static java.sql.Date string2Date(String date)
    {
    	String str = "";
    	if( date.length() > 10)
    	{
    		str = PATTERN_DATETIME;
    	}else {
    		str = PATTERN_DATE;
		}

    	 SimpleDateFormat format = new SimpleDateFormat(str);
    	  Date d = null;
          try {  
              d = format.parse(date);  
          } catch (Exception e) {  
              e.printStackTrace();  
          }  
          java.sql.Date date1 = new java.sql.Date(d.getTime());  
          return date1; 
    }

    public static List<String> getStartAndEndDateByNow(Integer days) {
        Date endDate = new Date();
        Date startDate = DateTimeUtils.addDays(endDate, -(days - 1));

        List<String> dateStringList = new ArrayList<>();
        dateStringList.add(DateTimeUtils.formatSqlDate(startDate));
        dateStringList.add(DateTimeUtils.formatSqlDate(endDate));

        return dateStringList;
    }

    public static void main(String[] args)
    {
        /*System.out.println(DateTimeUtils.getYear(new Date()));
        System.out.println(getDayStart(new Date()));*/
        /*String currentDateStr = DateTimeUtils.formatDate(new Date(), DateTimeUtils.PATTERN_DATE);
        Date currentDate = DateTimeUtils.parseDate(currentDateStr, DateTimeUtils.PATTERN_DATE);
        System.out.println("\n\n" + new Date() + "\n"
                            + currentDateStr + "\n"
                            + currentDate);
        System.out.print("\n" + toSQLDate(new Date()));*/

        Date utilDate = new Date();
        System.out.print("\n" + utilDate + "\n" + toSQLDate(utilDate));
        
       

    }
    
    public static int interestDateDiff(Date fromDate, Date toDate)
    {
    	fromDate = getDateWithoutTime(fromDate);
    	toDate = getDateWithoutTime(toDate);
    	int days = dateDiff(fromDate, toDate);
    	if(days < 0)
    	{
    		days = 0;
    	}
    	return days;
    }
    
    //判断时间是否在范围内
    public static boolean belongCalendar(Date time, Date from, Date to) {
        Calendar date = Calendar.getInstance();
        date.setTime(time);

        Calendar after = Calendar.getInstance();
        after.setTime(from);

        Calendar before = Calendar.getInstance();
        before.setTime(to);

        if (date.after(after) && date.before(before)) {
            return true;
        } else {
            return false;
        }
    }
    
    /** 
     * 判断时间是否在时间段内 
     *  
     * @param date 
     *            当前时间 yyyy-MM-dd HH:mm:ss 
     * @param strDateBegin 
     *            开始时间 06:00:00 
     * @param strDateEnd 
     *            结束时间 18:00:00 
     * @return 
     */  
    public static boolean isInDate(Date date, String strDateBegin,  
            String strDateEnd) {  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String strDate = sdf.format(date);  
        // 截取当前时间时分秒  
        int strDateH = Integer.parseInt(strDate.substring(11, 13));  
        int strDateM = Integer.parseInt(strDate.substring(14, 16));  
        int strDateS = Integer.parseInt(strDate.substring(17, 19));  
        // 截取开始时间时分秒  
        int strDateBeginH = Integer.parseInt(strDateBegin.substring(0, 2));  
        int strDateBeginM = Integer.parseInt(strDateBegin.substring(3, 5));  
        int strDateBeginS = Integer.parseInt(strDateBegin.substring(6, 8));  
        // 截取结束时间时分秒  
        int strDateEndH = Integer.parseInt(strDateEnd.substring(0, 2));  
        int strDateEndM = Integer.parseInt(strDateEnd.substring(3, 5));  
        int strDateEndS = Integer.parseInt(strDateEnd.substring(6, 8));  
        if ((strDateH >= strDateBeginH && strDateH <= strDateEndH)) {  
            // 当前时间小时数在开始时间和结束时间小时数之间  
            if (strDateH > strDateBeginH && strDateH < strDateEndH) {  
                return true;  
                // 当前时间小时数等于开始时间小时数，分钟数在开始和结束之间  
            } else if (strDateH == strDateBeginH && strDateM >= strDateBeginM  
                    && strDateM <= strDateEndM) {  
                return true;  
                // 当前时间小时数等于开始时间小时数，分钟数等于开始时间分钟数，秒数在开始和结束之间  
            } else if (strDateH == strDateBeginH && strDateM == strDateBeginM  
                    && strDateS >= strDateBeginS && strDateS <= strDateEndS) {  
                return true;  
            }  
            // 当前时间小时数大等于开始时间小时数，等于结束时间小时数，分钟数小等于结束时间分钟数  
            else if (strDateH >= strDateBeginH && strDateH == strDateEndH  
                    && strDateM <= strDateEndM) {  
                return true;  
                // 当前时间小时数大等于开始时间小时数，等于结束时间小时数，分钟数等于结束时间分钟数，秒数小等于结束时间秒数  
            } else if (strDateH >= strDateBeginH && strDateH == strDateEndH  
                    && strDateM == strDateEndM && strDateS <= strDateEndS) {  
                return true;  
            } else {  
                return false;  
            }  
        } else {  
            return false;  
        }  
    }  
     
    /** 
     * 判断时间是否在时间段内 
     *  
     * @param date 
     *            当前时间 yyyy-MM-dd HH:mm:ss 
     * @param strDateBegin 
     *            开始时间 06:00:00 
     * @param strDateEnd 
     *            结束时间 18:00:00 
     * @return 
     */  
    public static boolean isInDate(Date date, int creditBeginTime, int creditEndTime) {  
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
        String strDate = sdf.format(date);  
        // 截取当前时间时分秒  
        int dateH = Integer.parseInt(strDate.substring(11, 13));  
        
        if(dateH >= creditBeginTime && dateH < creditEndTime)
        {
        	return true;
        }else {
			return false;
		}
    }

    /**获取当天日期格式化*/
    public static Date getToday(){
//		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		return new Date();
    }
    
    /**获取7天前日期格式化*/
    public static String getStartDate(){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();  
		c.add(Calendar.DATE, - 3);  
		Date monday = c.getTime();
		String preMonday = sdf.format(monday);
		return preMonday;
    }
    
    /**获取7天前日期格式化*/
    public static String getWeekAgoDate(int num){
    	
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();  
		c.add(Calendar.DATE, - num);  	
		Date monday = c.getTime();
		String preMonday = sdf.format(monday);
		return preMonday;
    }
}
