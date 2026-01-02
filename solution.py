class Solution:
    def reformatDate(self, date):
        s = date.split()
        months = {"Jan":"-01-", "Feb":"-02-", "Mar":"-03-", "Apr":"-04-", "May":"-05-", "Jun":"-06-", "Jul":"-07-", "Aug":"-08-", "Sep":"-09-", "Oct":"-10-", "Nov":"-11-", "Dec":"-12-"}
        m = months[s[1]]
        y = s[2]
        d = ""
        if len(s[0]) == 3: d = "0" + s[0][0]
        else: d = s[0][0:2]
        return y + m + d
