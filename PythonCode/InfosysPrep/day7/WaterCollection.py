# heights=[1, 8, 6, 2, 5, 4, 8, 3, 7]
heights=[1, 8, 9, 2, 5, 8]

def calcMaxWater(heights):
    start=0
    end=len(heights)-1
    maxArea=0

    while(start<end):
        height=min(heights[start],heights[end])
        width=end-start
        area=height*width

        if area>maxArea:
            maxArea=area

        if heights[start]<=heights[end]:
            start+=1
        else:
            end-=1
    return maxArea


max=calcMaxWater(heights)
print(max)