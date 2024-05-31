class Solution:
    def isValid(self, s: str) -> bool:
        stack = []
        for i in range(0,len(s)):
            if s[i] == "(" or s[i] == "{" or s[i] == "[":
                stack.append(s[i])

            elif stack and s[i] == ")" and stack[-1] == "(" :
                stack.pop()
            elif stack and s[i] == "}" and stack[-1] == "{" :
                stack.pop()
            elif stack and s[i] == "]" and stack[-1] == "[" :
                stack.pop()
            else:
                return False

        return not stack




sol = Solution()
print('Result : ', sol.isValid("()"))
print('Result : ', sol.isValid("()[]{}"))
print('Result : ', sol.isValid("(]"))