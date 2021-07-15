
public class SprintNAPFunctions {

    public static String truncateDateTime(String dateString) {
        if (dateString != null && !dateString.isEmpty())
            return dateString.split("T")[0];
        else
            return null;
    }

    public static String convertUnixTimeToDateTime(String dateString) {
        if (dateString != null && !dateString.isEmpty())
			return java.time.Instant.ofEpochMilli(Long.parseLong(dateString))
									.atZone(java.time.ZoneOffset.UTC)
									.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"));
        else
            return null;
    }   
	
    public static String convertUnixTimeToDate(String dateString) {
        if (dateString != null && !dateString.isEmpty())
			return java.time.Instant.ofEpochMilli(Long.parseLong(dateString))
									.atZone(java.time.ZoneOffset.UTC)
									.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        else
            return null;
    }	

    public static String convertDateTimeToUTC(String dateString) {
        if (dateString != null && !dateString.isEmpty())
			return java.time.OffsetDateTime.parse(dateString)
									.toInstant()
									.atZone(java.time.ZoneOffset.UTC)
									.format(java.time.format.DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSS"));
        else
            return null;
    } 

    public static String getFrenchNAPCatalogueRecordModifiedDate(String updatedString, String createdString) {
        if (updatedString != null && !updatedString.isEmpty())
			return convertDateTimeToUTC(updatedString);
        else
			if (createdString != null && !createdString.isEmpty())
				return createdString+"T00:00:00.000";
			else
				return null;
    }

}