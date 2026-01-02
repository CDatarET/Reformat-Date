public class Solution {
    public string ReformatDate(string date) {
        string[] s = date.Split(" ");
        var months = new Dictionary<string, string>{
            ["Jan"] = "-01-",
            ["Feb"] = "-02-",
            ["Mar"] = "-03-",
            ["Apr"] = "-04-",
            ["May"] = "-05-",
            ["Jun"] = "-06-",
            ["Jul"] = "-07-",
            ["Aug"] = "-08-",
            ["Sep"] = "-09-",
            ["Oct"] = "-10-",
            ["Nov"] = "-11-",
            ["Dec"] = "-12-"
        };
        string m = months[s[1]];
        string y = s[2];
        string d = "";
        if(s[0].Length == 3) d = "0" + s[0][0];
        else d = s[0].Substring(0, 2);
        return(y + m + d);
    }
}
