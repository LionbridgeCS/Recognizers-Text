package com.microsoft.recognizers.text.datetime;

import com.microsoft.recognizers.text.datetime.resources.BaseDateTime;

public class Constants {

    public static final String SYS_DATETIME_DATE = "date";
    public static final String SYS_DATETIME_TIME = "time";
    public static final String SYS_DATETIME_DATEPERIOD = "daterange";
    public static final String SYS_DATETIME_DATETIME = "datetime";
    public static final String SYS_DATETIME_TIMEPERIOD = "timerange";
    public static final String SYS_DATETIME_DATETIMEPERIOD = "datetimerange";
    public static final String SYS_DATETIME_DURATION = "duration";
    public static final String SYS_DATETIME_SET = "set";
    public static final String SYS_DATETIME_DATETIMEALT = "datetimealt";
    public static final String SYS_DATETIME_TIMEZONE = "timezone";

    // Model Name
    public static final String MODEL_DATETIME = "datetime";

    // Multiple Duration Types
    public static final String MultipleDuration_Prefix = "multipleDuration";
    public static final String MultipleDuration_Type = MultipleDuration_Prefix + "Type";
    public static final String MultipleDuration_DateTime = MultipleDuration_Prefix + "DateTime";
    public static final String MultipleDuration_Date = MultipleDuration_Prefix + "Date";
    public static final String MultipleDuration_Time = MultipleDuration_Prefix + "Time";

    // DateTime Parse
    public static final String Resolve = "resolve";
    public static final String ResolveToPast = "resolveToPast";
    public static final String ResolveToFuture = "resolveToFuture";

    // In the ExtractResult data
    public static final String Context = "context";
    public static final String ContextType_RelativePrefix = "relativePrefix";
    public static final String ContextType_RelativeSuffix = "relativeSuffix";
    public static final String ContextType_AmPm = "AmPm";
    public static final String SubType = "subType";

    // Comment - internal tag used during entity processing, never exposed to users. 
    // Tags are filtered out in BaseMergedParser DateTimeResolution()
    public static final String Comment = "Comment";
    // AmPm time representation for time parser
    public static final String Comment_AmPm = "ampm";
    // Prefix early/late for time parser
    public static final String Comment_Early = "early";
    public static final String Comment_Late = "late";
    // Parse week of date format
    public static final String Comment_WeekOf = "WeekOf";
    public static final String Comment_MonthOf = "MonthOf";

    // Mod Value
    // "before" -> To mean "preceding in time". I.e. Does not include the extracted datetime entity in the resolution's ending point. Equivalent to "<"
    public static final String BEFORE_MOD = "before";

    // "after" -> To mean "following in time". I.e. Does not include the extracted datetime entity in the resolution's starting point. Equivalent to ">"
    public static final String AFTER_MOD = "after";

    // "since" -> Same as "after", but including the extracted datetime entity. Equivalent to ">="
    public static final String SINCE_MOD = "since";

    // "until" -> Same as "before", but including the extracted datetime entity. Equivalent to "<="
    public static final String UNTIL_MOD = "until";

    public static final String EARLY_MOD = "start";
    public static final String MID_MOD = "mid";
    public static final String LATE_MOD = "end";

    public static final String MORE_THAN_MOD = "more";
    public static final String LESS_THAN_MOD = "less";

    public static final String REF_UNDEF_MOD = "ref_undef";

    // Invalid year
    public static final int InvalidYear = Integer.MIN_VALUE;

    public static final int MinYearNum = BaseDateTime.MinYearNum;
    public static final int MaxYearNum = BaseDateTime.MaxYearNum;

    public static final int MaxTwoDigitYearFutureNum = BaseDateTime.MaxTwoDigitYearFutureNum;
    public static final int MinTwoDigitYearPastNum = BaseDateTime.MinTwoDigitYearPastNum;

    // These are some particular values for timezone recognition
    public static final int InvalidOffsetValue = -10000;
    public static final String UtcOffsetMinsKey = "utcOffsetMins";
    public static final String TimeZoneText = "timezoneText";
    public static final String TimeZone = "timezone";
    public static final String ResolveTimeZone = "resolveTimeZone";
    public static final int PositiveSign = 1;
    public static final int NegativeSign = -1;

    public static final int TrimesterMonthCount = 3;
    public static final int SemesterMonthCount = 6;
    public static final int WeekDayCount = 7;
    public static final int CenturyYearsCount = 100;

    // hours of one half day
    public static final int HalfDayHourCount = 12;
    // hours of a half mid-day-duration
    public static final int HalfMidDayDurationHourCount = 2;

    public static final String DefaultLanguageFallback_MDY = "MDY";
    public static final String DefaultLanguageFallback_DMY = "DMY";

    // Groups' names for named groups in regexes
    public static final String NextGroupName = "next";
    public static final String AmGroupName = "am";
    public static final String PmGroupName = "pm";
    public static final String ImplicitAmGroupName = "iam";
    public static final String ImplicitPmGroupName = "ipm";
    public static final String PrefixGroupName = "prefix";
    public static final String SuffixGroupName = "suffix";
    public static final String DescGroupName = "desc";
    public static final String SecondGroupName = "sec";
    public static final String MinuteGroupName = "min";
    public static final String HourGroupName = "hour";
}