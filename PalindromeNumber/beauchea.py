# By jay den
# original work do not steal plz

class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        return self.recur(str(x), True, '_');    

    def recur(self, x, b, c):
        if x == '': 
            # print("yeah")
            return True
        if b:
            # print("b true ", x, " ", c)
            return self.recur(str(x)[1:], False, str(x)[0])
        else:
            # print("b false ", x, " ", c)
            if str(x)[-1] != c: 
                # print("nah")
                return False
            return self.recur(str(x)[:-1], True, c)