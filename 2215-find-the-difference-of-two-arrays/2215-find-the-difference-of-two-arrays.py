class Solution:
    def findDifference(self, nums1: List[int], nums2: List[int]) -> List[List[int]]:
        s1=set(nums1)
        s2=set(nums2)
        r1=s1-s2
        r2=s2-s1
        res=[]
        res.append(list(r1))
        res.append(list(r2))
        return res