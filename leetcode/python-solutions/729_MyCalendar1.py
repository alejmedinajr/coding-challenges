from sortedcontainers import SortedList as sl

class MyCalendar(object):

    def __init__(self):
        self.calendar = sl()        

    def book(self, start, end):
        """
        :type start: int
        :type end: int
        :rtype: bool
        """
        i = self.calendar.bisect_right((start, end))
        if(i > 0 and self.calendar[i - 1][1] > start) or (i < len(self.calendar) and self.calendar[i][0] < end):
            return False
        self.calendar.add((start, end))
        return True

