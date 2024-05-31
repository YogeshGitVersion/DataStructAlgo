from typing import List
class Solution:
    def rotate(self, students: List[int]):
        return students[1:] + students[:1]


    def countStudents(self, students: List[int], sandwiches: List[int]) -> int:
        i = 0
        while sandwiches and sandwiches[0] in students:
            if students[0] == sandwiches[0]:
                students.pop(0)
                sandwiches.pop(0)
            else:
                students = self.rotate(students)
            i += 1
        return len(students)


sol = Solution()
# print(sol.longestMonotonicSubarray([1,4,3,3,2]))
print(sol.countStudents([1,1,0,0],[0,1,0,1]))
print(sol.countStudents([1,1,1,0,0,1], [1,0,0,0,1,1]))
