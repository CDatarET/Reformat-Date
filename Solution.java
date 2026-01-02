class Solution {
    public String reformatDate(String date) {
        String[] s = date.split(" ");
        Map<String, String> map = Map.ofEntries(
            Map.entry("Jan", "-01-"),
            Map.entry("Feb", "-02-"),
            Map.entry("Mar", "-03-"),
            Map.entry("Apr", "-04-"),
            Map.entry("May", "-05-"),
            Map.entry("Jun", "-06-"),
            Map.entry("Jul", "-07-"),
            Map.entry("Aug", "-08-"),
            Map.entry("Sep", "-09-"),
            Map.entry("Oct", "-10-"),
            Map.entry("Nov", "-11-"),
            Map.entry("Dec", "-12-")
        );
        String m = map.get(s[1]);
        String y = s[2];
        String d = "";
        if(s[0].length() == 3) d = "0" + s[0].charAt(0);
        else d = s[0].substring(0, 2);
        return(y + m + d);
    }
}
