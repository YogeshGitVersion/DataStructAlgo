class Solution:
    def numWaterBottles(self, numBottles: int, numExchange: int) -> int:
        #itr #1 where all bottles are drunk
        total_bottles = numBottles
        empty_bottles = numBottles

        while empty_bottles >= numExchange:
            # Exchange
            # Exchange empty bottles for full_bottle ones -> no multiple bottles at once
            empty_bottles = empty_bottles - numExchange
            numExchange += 1
            total_bottles += 1
            empty_bottles += 1

        return total_bottles


sol = Solution()
print('Final Result: ',sol.numWaterBottles(13, 6)) #15
print('Final Result: ',sol.numWaterBottles(19, 12)) #20
print('Final Result: ',sol.numWaterBottles(10, 3)) #13

